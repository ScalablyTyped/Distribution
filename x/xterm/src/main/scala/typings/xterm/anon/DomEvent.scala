package typings.xterm.anon

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomEvent extends js.Object {
  var domEvent: KeyboardEvent
  var key: String
}

object DomEvent {
  @scala.inline
  def apply(domEvent: KeyboardEvent, key: String): DomEvent = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomEvent]
  }
}

