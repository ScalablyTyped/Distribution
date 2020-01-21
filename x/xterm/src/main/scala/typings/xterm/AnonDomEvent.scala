package typings.xterm

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDomEvent extends js.Object {
  var domEvent: KeyboardEvent
  var key: String
}

object AnonDomEvent {
  @scala.inline
  def apply(domEvent: KeyboardEvent, key: String): AnonDomEvent = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDomEvent]
  }
}

