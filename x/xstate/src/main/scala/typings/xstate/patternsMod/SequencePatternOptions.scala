package typings.xstate.patternsMod

import typings.xstate.typesMod.Event
import typings.xstate.typesMod.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequencePatternOptions[TEvent /* <: EventObject */] extends js.Object {
  var nextEvent: js.UndefOr[Event[TEvent]] = js.native
  var prevEvent: js.UndefOr[Event[TEvent]] = js.native
}

object SequencePatternOptions {
  @scala.inline
  def apply[/* <: typings.xstate.typesMod.EventObject */ TEvent](): SequencePatternOptions[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequencePatternOptions[TEvent]]
  }
  @scala.inline
  implicit class SequencePatternOptionsOps[Self <: SequencePatternOptions[_], /* <: typings.xstate.typesMod.EventObject */ TEvent] (val x: Self with SequencePatternOptions[TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextEvent(value: Event[TEvent]): Self = this.set("nextEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextEvent: Self = this.set("nextEvent", js.undefined)
    @scala.inline
    def setPrevEvent(value: Event[TEvent]): Self = this.set("prevEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevEvent: Self = this.set("prevEvent", js.undefined)
  }
  
}

