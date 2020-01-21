package typings.ws.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenEvent extends js.Object {
  var target: WebSocket
}

object OpenEvent {
  @scala.inline
  def apply(target: WebSocket): OpenEvent = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenEvent]
  }
}

