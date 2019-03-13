package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugSession extends js.Object {
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
  		 * Send a custom request to the debug adapter.
  		 */
  def customRequest(command: java.lang.String): vscodeLib.Thenable[_] = js.native
  def customRequest(command: java.lang.String, args: js.Any): vscodeLib.Thenable[_] = js.native
}

