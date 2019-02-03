package typings
package webdriverDashManagerLib.builtLibCliProgramsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-manager/built/lib/cli/programs", "Program")
@js.native
class Program () extends js.Object {
  var cmd: java.lang.String = js.native
  var cmdDescription: java.lang.String = js.native
  var helpDescription: java.lang.String = js.native
  var options: webdriverDashManagerLib.builtLibCliOptionsMod.Options = js.native
  var runMethod: js.Function = js.native
  var version: java.lang.String = js.native
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
  def addOption(option: webdriverDashManagerLib.builtLibCliOptionsMod.Option): Program = js.native
  /**
    * Register a command and the description.
    * @param cmd The command.
    * @param cmdDescription The description of the command.
    * @returns The program for method chaining.
    */
  def command(cmd: java.lang.String, cmdDescription: java.lang.String): Program = js.native
  /**
    * Get the options used by the program and create the minimist options
    * to ensure that minimist parses the values properly.
    * @returns The options for minimist.
    */
  def getMinimistOptions(): webdriverDashManagerLib.builtLibCliOptionsMod.MinimistArgs = js.native
  /**
    * Create a collection of options used by this program.
    * @returns The options used in the programs.
    */
  def `getOptions_`(allOptions: webdriverDashManagerLib.builtLibCliOptionsMod.Options): webdriverDashManagerLib.builtLibCliOptionsMod.Options = js.native
  /* private */ def `getValue_`(key: js.Any, json: js.Any): js.Any = js.native
  def `lengthOf_`(param: java.lang.String): scala.Double = js.native
  /**
    * Register a new option.
    * @param opt The option.
    * @param description The description of the option.
    * @param type The type of value expected: boolean, number, or string
    * @param defaultValue The option's default value.
    * @returns The program for method chaining.
    */
  def option(opt: java.lang.String, description: java.lang.String, `type`: java.lang.String): Program = js.native
  def option(
    opt: java.lang.String,
    description: java.lang.String,
    `type`: java.lang.String,
    opt_defaultValue: java.lang.String
  ): Program = js.native
  def option(
    opt: java.lang.String,
    description: java.lang.String,
    `type`: java.lang.String,
    opt_defaultValue: scala.Boolean
  ): Program = js.native
  def option(
    opt: java.lang.String,
    description: java.lang.String,
    `type`: java.lang.String,
    opt_defaultValue: scala.Double
  ): Program = js.native
  def posDefault(): scala.Double = js.native
  def posDescription(): scala.Double = js.native
  /**
    * Prints the command with the description. The description will have spaces
    * between the cmd so that the starting position is "posDescription". If the
    * gap between the cmd and the description is less than MIN_SPACING or
    * posDescription is undefined, the spacing will be MIN_SPACING.
    *
    * @param opt_postDescription Starting position of the description.
    */
  def printCmd(): scala.Unit = js.native
  def printCmd(opt_posDescription: scala.Double): scala.Unit = js.native
  /**
    * Assuming that the this program can run by itself, to print out the program's
    * help. Also assuming that the commands are called cmd-run and cmd-help.
    */
  def printHelp(): scala.Unit = js.native
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
  def printOptions(posDescription: scala.Double, posDefault: scala.Double): scala.Unit = js.native
  def printOptions(
    posDescription: scala.Double,
    posDefault: scala.Double,
    opt_extOptions: webdriverDashManagerLib.builtLibCliOptionsMod.Options
  ): scala.Unit = js.native
  /**
    * Adds the value to the options and passes the updated options to the run
    * method.
    * @param args The arguments that will be parsed to run the method.
    */
  def run(json: stdLib.JSON): js.Promise[scala.Unit] = js.native
}

/* static members */
@JSImport("webdriver-manager/built/lib/cli/programs", "Program")
@js.native
object Program extends js.Object {
  var MIN_SPACING: scala.Double = js.native
}

