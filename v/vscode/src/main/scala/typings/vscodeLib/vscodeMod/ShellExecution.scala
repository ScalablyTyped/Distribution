package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "ShellExecution")
@js.native
class ShellExecution protected () extends js.Object {
  /**
  		 * Creates a process execution.
  		 *
  		 * @param commandLine The command line to execute.
  		 * @param options Optional options for the started the shell.
  		 */
  def this(commandLine: java.lang.String) = this()
  def this(commandLine: java.lang.String, options: ShellExecutionOptions) = this()
  /**
  		 * The shell command line
  		 */
  var commandLine: java.lang.String = js.native
  /**
  		 * The shell options used when the command line is executed in a shell.
  		 * Defaults to undefined.
  		 */
  var options: js.UndefOr[ShellExecutionOptions] = js.native
}

