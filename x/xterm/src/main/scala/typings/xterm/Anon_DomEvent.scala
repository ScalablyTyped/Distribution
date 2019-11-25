package typings.xterm

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DomEvent extends js.Object {
  var domEvent: KeyboardEvent
  var key: String
}

object Anon_DomEvent {
  @scala.inline
  def apply(domEvent: KeyboardEvent, key: String): Anon_DomEvent = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DomEvent]
  }
}

