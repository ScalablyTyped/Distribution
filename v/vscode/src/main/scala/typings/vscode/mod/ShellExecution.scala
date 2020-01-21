package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "ShellExecution")
@js.native
class ShellExecution protected () extends js.Object {
  /**
  		 * Creates a shell execution with a full command line.
  		 *
  		 * @param commandLine The command line to execute.
  		 * @param options Optional options for the started the shell.
  		 */
  def this(commandLine: String) = this()
  def this(commandLine: String, options: ShellExecutionOptions) = this()
  /**
  		 * Creates a shell execution with a command and arguments. For the real execution VS Code will
  		 * construct a command line from the command and the arguments. This is subject to interpretation
  		 * especially when it comes to quoting. If full control over the command line is needed please
  		 * use the constructor that creates a `ShellExecution` with the full command line.
  		 *
  		 * @param command The command to execute.
  		 * @param args The command arguments.
  		 * @param options Optional options for the started the shell.
  		 */
  def this(command: String, args: js.Array[String | ShellQuotedString]) = this()
  def this(command: ShellQuotedString, args: js.Array[String | ShellQuotedString]) = this()
  def this(command: String, args: js.Array[String | ShellQuotedString], options: ShellExecutionOptions) = this()
  def this(
    command: ShellQuotedString,
    args: js.Array[String | ShellQuotedString],
    options: ShellExecutionOptions
  ) = this()
  /**
  		 * The shell args. Is `undefined` if created with a full command line.
  		 */
  var args: js.Array[String | ShellQuotedString] = js.native
  /**
  		 * The shell command. Is `undefined` if created with a full command line.
  		 */
  var command: String | ShellQuotedString = js.native
  /**
  		 * The shell command line. Is `undefined` if created with a command and arguments.
  		 */
  var commandLine: js.UndefOr[String] = js.native
  /**
  		 * The shell options used when the command line is executed in a shell.
  		 * Defaults to undefined.
  		 */
  var options: js.UndefOr[ShellExecutionOptions] = js.native
}

