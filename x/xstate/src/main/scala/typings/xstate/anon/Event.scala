package typings.xstate.anon

import typings.xstate.xstateStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var event: _empty
}

object Event {
  @scala.inline
  def apply(event: _empty): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

