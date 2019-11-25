package typings.ws.wsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageEvent extends js.Object {
  var data: Data
  var target: WebSocket
  var `type`: String
}

object MessageEvent {
  @scala.inline
  def apply(data: Data, target: WebSocket, `type`: String): MessageEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEvent]
  }
}

