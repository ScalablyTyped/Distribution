package typings.xstate.typesMod

import typings.xstate.actorMod.Actor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendActionObject[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */] extends SendAction[TContext, TEvent, TSentEvent] {
  
  var _event: typings.xstate.typesMod.SCXML.Event[TSentEvent] = js.native
  
  @JSName("delay")
  var delay_SendActionObject: js.UndefOr[Double] = js.native
  
  @JSName("event")
  var event_SendActionObject: TSentEvent = js.native
  
  @JSName("to")
  var to_SendActionObject: js.UndefOr[String | Double | (Actor[_, AnyEventObject])] = js.native
}
object SendActionObject {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](
    _event: typings.xstate.typesMod.SCXML.Event[TSentEvent],
    event: TSentEvent,
    id: String | Double,
    `type`: String
  ): SendActionObject[TContext, TEvent, TSentEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendActionObject[TContext, TEvent, TSentEvent]]
  }
  
  @scala.inline
  implicit class SendActionObjectOps[Self <: SendActionObject[_, _, _], TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */] (val x: Self with (SendActionObject[TContext, TEvent, TSentEvent])) extends AnyVal {
    
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
    def set_event(value: typings.xstate.typesMod.SCXML.Event[TSentEvent]): Self = this.set("_event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: TSentEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setTo(value: String | Double | (Actor[_, AnyEventObject])): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
}
