package typings.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateLike[TContext] extends js.Object {
  var _event: typings.xstate.typesMod.SCXML.Event[EventObject] = js.native
  var context: TContext = js.native
  var event: EventObject = js.native
  var value: StateValue = js.native
}

object StateLike {
  @scala.inline
  def apply[TContext](
    _event: typings.xstate.typesMod.SCXML.Event[EventObject],
    context: TContext,
    event: EventObject,
    value: StateValue
  ): StateLike[TContext] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateLike[TContext]]
  }
  @scala.inline
  implicit class StateLikeOps[Self <: StateLike[_], TContext] (val x: Self with StateLike[TContext]) extends AnyVal {
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
    def set_event(value: typings.xstate.typesMod.SCXML.Event[EventObject]): Self = this.set("_event", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: TContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: EventObject): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: StateValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

