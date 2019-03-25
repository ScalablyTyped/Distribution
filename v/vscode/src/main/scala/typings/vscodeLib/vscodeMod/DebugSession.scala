package typings
package vscodeLib.vscodeMod

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
  val id: java.lang.String = js.native
  /**
  		 * The debug session's name from the [debug configuration](#DebugConfiguration).
  		 */
  val name: java.lang.String = js.native
  /**
  		 * The debug session's type from the [debug configuration](#DebugConfiguration).
  		 */
  val `type`: java.lang.String = js.native
  /**
  		 * The workspace folder of this session or `undefined` for a folderless setup.
  		 */
  val workspaceFolder: js.UndefOr[WorkspaceFolder] = js.native
  /**
  		 * Send a custom request to the debug adapter.
  		 */
  def customRequest(command: java.lang.String): vscodeLib.Thenable[_] = js.native
  def customRequest(command: java.lang.String, args: js.Any): vscodeLib.Thenable[_] = js.native
}

