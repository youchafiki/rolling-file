package com.logging.rollingfile;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Logger;

@Log4j2
public class Log4j2RollingFile {

	public static void main(String[] args) throws InterruptedException {

			for(int i = 0; i < 2000; i++) {
				log.info("This is the " + i + " time I say 'Hello World'.");
				log.warn("This is the " + i + " time I say 'warn World'.");
				log.warn("This is the " + i + " time I say 'error World'.");
				log.trace("This is the " + i + " time I say 'trace World'.");

				Thread.sleep(100);
			}

	}
}
