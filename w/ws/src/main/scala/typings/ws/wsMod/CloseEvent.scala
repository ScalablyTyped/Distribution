package typings.ws.wsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseEvent extends js.Object {
  var code: Double
  var reason: String
  var target: WebSocket
  var wasClean: Boolean
}

object CloseEvent {
  @scala.inline
  def apply(code: Double, reason: String, target: WebSocket, wasClean: Boolean): CloseEvent = {
    val __obj = js.Dynamic.literal(code = code, reason = reason, target = target, wasClean = wasClean)
  
    __obj.asInstanceOf[CloseEvent]
  }
}

