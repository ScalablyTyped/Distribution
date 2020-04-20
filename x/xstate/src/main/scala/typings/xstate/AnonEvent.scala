package typings.xstate

import typings.xstate.xstateStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent extends js.Object {
  var event: _empty
}

object AnonEvent {
  @scala.inline
  def apply(event: _empty): AnonEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEvent]
  }
}

