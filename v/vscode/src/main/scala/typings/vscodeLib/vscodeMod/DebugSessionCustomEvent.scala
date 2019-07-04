package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugSessionCustomEvent extends js.Object {
  /**
  		 * Event specific information.
  		 */
  val body: js.UndefOr[js.Any] = js.undefined
  /**
  		 * Type of event.
  		 */
  val event: java.lang.String
  /**
  		 * The [debug session](#DebugSession) for which the custom event was received.
  		 */
  val session: DebugSession
}

object DebugSessionCustomEvent {
  @scala.inline
  def apply(event: java.lang.String, session: DebugSession, body: js.Any = null): DebugSessionCustomEvent = {
    val __obj = js.Dynamic.literal(event = event, session = session)
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[DebugSessionCustomEvent]
  }
}

