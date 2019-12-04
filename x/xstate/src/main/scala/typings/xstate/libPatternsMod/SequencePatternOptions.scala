package typings.xstate.libPatternsMod

import typings.xstate.libTypesMod.Event
import typings.xstate.libTypesMod.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequencePatternOptions[TEvent /* <: EventObject */] extends js.Object {
  var nextEvent: js.UndefOr[Event[TEvent]] = js.undefined
  var prevEvent: js.UndefOr[Event[TEvent]] = js.undefined
}

object SequencePatternOptions {
  @scala.inline
  def apply[TEvent /* <: EventObject */](nextEvent: Event[TEvent] = null, prevEvent: Event[TEvent] = null): SequencePatternOptions[TEvent] = {
    val __obj = js.Dynamic.literal()
    if (nextEvent != null) __obj.updateDynamic("nextEvent")(nextEvent.asInstanceOf[js.Any])
    if (prevEvent != null) __obj.updateDynamic("prevEvent")(prevEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequencePatternOptions[TEvent]]
  }
}

