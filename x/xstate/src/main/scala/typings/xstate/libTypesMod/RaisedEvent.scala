package typings.xstate.libTypesMod

import typings.xstate.libTypesMod.ActionTypes.Raise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaisedEvent[TEvent /* <: EventObject */] extends BuiltInEvent[TEvent] {
  var event: TEvent
  var `type`: Raise
}

object RaisedEvent {
  @scala.inline
  def apply[TEvent /* <: EventObject */](event: TEvent, `type`: Raise): RaisedEvent[TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RaisedEvent[TEvent]]
  }
}

