package typings.ws.wsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorEvent extends js.Object {
  var error: js.Any
  var message: String
  var target: WebSocket
  var `type`: String
}

object ErrorEvent {
  @scala.inline
  def apply(error: js.Any, message: String, target: WebSocket, `type`: String): ErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEvent]
  }
}

