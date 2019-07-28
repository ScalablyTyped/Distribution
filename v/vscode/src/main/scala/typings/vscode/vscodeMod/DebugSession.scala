package typings.vscode.vscodeMod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugSession extends js.Object {
  /**
  		 * The "resolved" [debug configuration](#DebugConfiguration) of this session.
  		 * "Resolved" means that
  		 * - all variables have been substituted and
  		 * - platform specific attribute sections have been "flattened" for the matching platform and removed for non-matching platforms.
  		 */
  val configuration: DebugConfiguration = js.native
  /**
  		 * The unique ID of this debug session.
  		 */
  val id: String = js.native
  /**
  		 * The debug session's name from the [debug configuration](#DebugConfiguration).
  		 */
  val name: String = js.native
  /**
  		 * The debug session's type from the [debug configuration](#DebugConfiguration).
  		 */
  val `type`: String = js.native
  /**
  		 * The workspace folder of this session or `undefined` for a folderless setup.
  		 */
  val workspaceFolder: js.UndefOr[WorkspaceFolder] = js.native
  /**
  		 * Send a custom request to the debug adapter.
  		 */
  def customRequest(command: String): Thenable[_] = js.native
  def customRequest(command: String, args: js.Any): Thenable[_] = js.native
}

