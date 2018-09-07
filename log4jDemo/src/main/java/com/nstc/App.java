package com.nstc;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args ) {
        try{
            System.out.println(5/0);
        }catch(Exception e){
            throw e;
        }

    }
}
