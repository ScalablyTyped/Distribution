package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePortEventMap extends js.Object {
  var message: MessageEvent
}

object MessagePortEventMap {
  @scala.inline
  def apply(message: MessageEvent): MessagePortEventMap = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePortEventMap]
  }
}

