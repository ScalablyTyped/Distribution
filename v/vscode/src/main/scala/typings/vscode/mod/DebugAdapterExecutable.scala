package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "DebugAdapterExecutable")
@js.native
class DebugAdapterExecutable protected () extends DebugAdapterDescriptor {
  /**
    * Creates a description for a debug adapter based on an executable program.
    *
    * @param command The command or executable path that implements the debug adapter.
    * @param args Optional arguments to be passed to the command or executable.
    * @param options Optional options to be used when starting the command or executable.
    */
  def this(command: String) = this()
  def this(command: String, args: js.Array[String]) = this()
  def this(command: String, args: js.Array[String], options: DebugAdapterExecutableOptions) = this()
  /**
    * The arguments passed to the debug adapter executable. Defaults to an empty array.
    */
  val args: js.Array[String] = js.native
  /**
    * The command or path of the debug adapter executable.
    * A command must be either an absolute path of an executable or the name of an command to be looked up via the PATH environment variable.
    * The special value 'node' will be mapped to VS Code's built-in Node.js runtime.
    */
  val command: String = js.native
  /**
    * Optional options to be used when the debug adapter is started.
    * Defaults to undefined.
    */
  val options: js.UndefOr[DebugAdapterExecutableOptions] = js.native
}

