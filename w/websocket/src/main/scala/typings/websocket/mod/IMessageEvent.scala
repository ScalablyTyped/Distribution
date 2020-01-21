package typings.websocket.mod

import typings.node.Buffer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageEvent extends js.Object {
  var data: String | Buffer | ArrayBuffer
}

object IMessageEvent {
  @scala.inline
  def apply(data: String | Buffer | ArrayBuffer): IMessageEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMessageEvent]
  }
}

