package typings.xstate.typesMod

import typings.xstate.actorMod.Actor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendAction[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var delay: js.UndefOr[Double | String | (DelayExpr[TContext, TEvent])] = js.native
  var event: TSentEvent | (SendExpr[TContext, TEvent, TSentEvent]) = js.native
  var id: String | Double = js.native
  var to: js.UndefOr[
    String | Double | (Actor[_, AnyEventObject]) | (ExprWithMeta[TContext, TEvent, String | Double | (Actor[_, AnyEventObject])])
  ] = js.native
}

object SendAction {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent, /* <: typings.xstate.typesMod.EventObject */ TSentEvent](event: TSentEvent | (SendExpr[TContext, TEvent, TSentEvent]), id: String | Double, `type`: String): SendAction[TContext, TEvent, TSentEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  }
  @scala.inline
  implicit class SendActionOps[Self <: SendAction[_, _, _], TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent, /* <: typings.xstate.typesMod.EventObject */ TSentEvent] (val x: Self with (SendAction[TContext, TEvent, TSentEvent])) extends AnyVal {
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
    def setEventFunction3(value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => TSentEvent): Self = this.set("event", js.Any.fromFunction3(value))
    @scala.inline
    def setEvent(value: TSentEvent | (SendExpr[TContext, TEvent, TSentEvent])): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelayFunction3(value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => Double): Self = this.set("delay", js.Any.fromFunction3(value))
    @scala.inline
    def setDelay(value: Double | String | (DelayExpr[TContext, TEvent])): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setToFunction3(
      value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => String | Double | (Actor[_, AnyEventObject])
    ): Self = this.set("to", js.Any.fromFunction3(value))
    @scala.inline
    def setTo(
      value: String | Double | (Actor[_, AnyEventObject]) | (ExprWithMeta[TContext, TEvent, String | Double | (Actor[_, AnyEventObject])])
    ): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

