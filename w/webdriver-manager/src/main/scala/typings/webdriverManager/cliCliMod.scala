package typings.webdriverManager

import typings.webdriverManager.optionsMod.Options
import typings.webdriverManager.programsMod.Program
import typings.webdriverManager.programsMod.Programs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cliCliMod {
  
  @JSImport("webdriver-manager/built/lib/cli/cli", "Cli")
  @js.native
  class Cli () extends StObject {
    
    /**
      * Get the options used by the programs and create the minimist options
      * to ensure that minimist parses the values properly.
      * @returns The options for minimist.
      */
    def getMinimistOptions(): js.Object = js.native
    
    /**
      * Go through all programs and add options to the collection.
      * @returns The options used in the programs.
      */
    def getOptions(): Options = js.native
    
    /**
      * For commands, gets the position where the description should start so they
      * are aligned.
      * @returns The position where the command description should start.
      */
    def posCmdDescription(): Double = js.native
    
    /**
      * For options, get the position where the default values should start so they
      * are aligned.
      * @returns The position where the option default values should start.
      */
    def posDefault(): Double = js.native
    
    /**
      * For options, gets the position where the description should start so they
      * are aligned.
      * @returns The position where the option description should start.
      */
    def posDescription(): Double = js.native
    
    /**
      * Prints help for the programs registered to the cli.
      */
    def printHelp(): Unit = js.native
    
    /**
      * Register a program to the command line interface.
      * @returns The cli for method chaining.
      */
    def program(prog: Program): Cli = js.native
    
    var programs: Programs = js.native
    
    /**
      * Add a usage for the command line interface.
      * @returns The cli for method chaining.
      */
    def usage(usageText: String): Cli = js.native
    
    var usageText: String = js.native
    
    var version: String = js.native
  }
}
