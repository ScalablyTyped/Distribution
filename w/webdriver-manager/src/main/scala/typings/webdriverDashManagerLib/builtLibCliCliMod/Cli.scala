package typings
package webdriverDashManagerLib.builtLibCliCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-manager/built/lib/cli/cli", "Cli")
@js.native
class Cli () extends js.Object {
  var programs: webdriverDashManagerLib.builtLibCliProgramsMod.Programs = js.native
  var usageText: java.lang.String = js.native
  var version: java.lang.String = js.native
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
  def getOptions(): webdriverDashManagerLib.builtLibCliOptionsMod.Options = js.native
  /**
    * For commands, gets the position where the description should start so they
    * are aligned.
    * @returns The position where the command description should start.
    */
  def posCmdDescription(): scala.Double = js.native
  /**
    * For options, get the position where the default values should start so they
    * are aligned.
    * @returns The position where the option default values should start.
    */
  def posDefault(): scala.Double = js.native
  /**
    * For options, gets the position where the description should start so they
    * are aligned.
    * @returns The position where the option description should start.
    */
  def posDescription(): scala.Double = js.native
  /**
    * Prints help for the programs registered to the cli.
    */
  def printHelp(): scala.Unit = js.native
  /**
    * Register a program to the command line interface.
    * @returns The cli for method chaining.
    */
  def program(prog: webdriverDashManagerLib.builtLibCliProgramsMod.Program): Cli = js.native
  /**
    * Add a usage for the command line interface.
    * @returns The cli for method chaining.
    */
  def usage(usageText: java.lang.String): Cli = js.native
}

