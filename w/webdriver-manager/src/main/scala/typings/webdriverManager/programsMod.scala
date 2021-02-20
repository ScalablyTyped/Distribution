package typings.webdriverManager

import org.scalablytyped.runtime.StringDictionary
import typings.std.JSON
import typings.webdriverManager.optionsMod.MinimistArgs
import typings.webdriverManager.optionsMod.Option
import typings.webdriverManager.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object programsMod {
  
  @JSImport("webdriver-manager/built/lib/cli/programs", "Program")
  @js.native
  class Program () extends StObject {
    
    /**
      * Registers a method that will be used to run the program.
      * @param runMethod The method that will be used to run the program.
      * @returns The program for method chaining.
      */
    def action(runMethod: js.Function): Program = js.native
    
    /**
      * Adds an option to the program.
      * @param option The option.
      * @returns The program for method chaining.
      */
    def addOption(option: Option): Program = js.native
    
    var cmd: String = js.native
    
    var cmdDescription: String = js.native
    
    /**
      * Register a command and the description.
      * @param cmd The command.
      * @param cmdDescription The description of the command.
      * @returns The program for method chaining.
      */
    def command(cmd: String, cmdDescription: String): Program = js.native
    
    /**
      * Get the options used by the program and create the minimist options
      * to ensure that minimist parses the values properly.
      * @returns The options for minimist.
      */
    def getMinimistOptions(): MinimistArgs = js.native
    
    /**
      * Create a collection of options used by this program.
      * @returns The options used in the programs.
      */
    def getOptions_(allOptions: Options): Options = js.native
    
    /* private */ def getValue_(key: js.Any, json: js.Any): js.Any = js.native
    
    var helpDescription: String = js.native
    
    def lengthOf_(param: String): Double = js.native
    
    /**
      * Register a new option.
      * @param opt The option.
      * @param description The description of the option.
      * @param type The type of value expected: boolean, number, or string
      * @param defaultValue The option's default value.
      * @returns The program for method chaining.
      */
    def option(opt: String, description: String, `type`: String): Program = js.native
    def option(opt: String, description: String, `type`: String, opt_defaultValue: String): Program = js.native
    def option(opt: String, description: String, `type`: String, opt_defaultValue: Boolean): Program = js.native
    def option(opt: String, description: String, `type`: String, opt_defaultValue: Double): Program = js.native
    
    var options: Options = js.native
    
    def posDefault(): Double = js.native
    
    def posDescription(): Double = js.native
    
    /**
      * Prints the command with the description. The description will have spaces
      * between the cmd so that the starting position is "posDescription". If the
      * gap between the cmd and the description is less than MIN_SPACING or
      * posDescription is undefined, the spacing will be MIN_SPACING.
      *
      * @param opt_postDescription Starting position of the description.
      */
    def printCmd(): Unit = js.native
    def printCmd(opt_posDescription: Double): Unit = js.native
    
    /**
      * Assuming that the this program can run by itself, to print out the program's
      * help. Also assuming that the commands are called cmd-run and cmd-help.
      */
    def printHelp(): Unit = js.native
    
    /**
      * Prints the options with the option descriptions and default values.
      * The posDescription and posDefault is the starting position for the option
      * description. If extOptions are provided, check to see if we have already
      * printed those options. Also, once we print the option, add them to the extOptions.
      *
      * @param posDescription Position to start logging the description.
      * @param posDefault Position to start logging the default value.
      * @param opt_extOptions A collection of options that will be updated.
      */
    def printOptions(posDescription: Double, posDefault: Double): Unit = js.native
    def printOptions(posDescription: Double, posDefault: Double, opt_extOptions: Options): Unit = js.native
    
    /**
      * Adds the value to the options and passes the updated options to the run
      * method.
      * @param args The arguments that will be parsed to run the method.
      */
    def run(json: JSON): js.Promise[Unit] = js.native
    
    var runMethod: js.Function = js.native
    
    var version: String = js.native
  }
  /* static members */
  object Program {
    
    @JSImport("webdriver-manager/built/lib/cli/programs", "Program")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriver-manager/built/lib/cli/programs", "Program.MIN_SPACING")
    @js.native
    def MIN_SPACING: Double = js.native
    @scala.inline
    def MIN_SPACING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_SPACING")(x.asInstanceOf[js.Any])
  }
  
  type Programs = StringDictionary[Program]
}
