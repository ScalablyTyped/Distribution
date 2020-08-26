package typings.xstate.typesMod

import typings.xstate.actorMod.Actor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendActionOptions[TContext, TEvent /* <: EventObject */] extends js.Object {
  var delay: js.UndefOr[Double | String | (DelayExpr[TContext, TEvent])] = js.native
  var id: js.UndefOr[String | Double] = js.native
  var to: js.UndefOr[
    String | (ExprWithMeta[TContext, TEvent, String | Double | (Actor[_, AnyEventObject])])
  ] = js.native
}

object SendActionOptions {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](): SendActionOptions[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendActionOptions[TContext, TEvent]]
  }
  @scala.inline
  implicit class SendActionOptionsOps[Self <: SendActionOptions[_, _], TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent] (val x: Self with (SendActionOptions[TContext, TEvent])) extends AnyVal {
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
    def setDelayFunction3(value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => Double): Self = this.set("delay", js.Any.fromFunction3(value))
    @scala.inline
    def setDelay(value: Double | String | (DelayExpr[TContext, TEvent])): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setToFunction3(
      value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => String | Double | (Actor[_, AnyEventObject])
    ): Self = this.set("to", js.Any.fromFunction3(value))
    @scala.inline
    def setTo(value: String | (ExprWithMeta[TContext, TEvent, String | Double | (Actor[_, AnyEventObject])])): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

