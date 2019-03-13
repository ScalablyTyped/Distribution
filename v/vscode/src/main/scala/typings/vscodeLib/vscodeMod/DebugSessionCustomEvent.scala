package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugSessionCustomEvent extends js.Object {
  /**
  		 * Event specific information.
  		 */
  var body: js.UndefOr[js.Any] = js.undefined
  /**
  		 * Type of event.
  		 */
  var event: java.lang.String
  /**
  		 * The [debug session](#DebugSession) for which the custom event was received.
  		 */
  var session: DebugSession
}

object DebugSessionCustomEvent {
  @scala.inline
  def apply(event: java.lang.String, session: DebugSession, body: js.Any = null): DebugSessionCustomEvent = {
    val __obj = js.Dynamic.literal(event = event, session = session)
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[DebugSessionCustomEvent]
  }
}

