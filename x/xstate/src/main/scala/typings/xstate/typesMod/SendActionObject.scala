package typings.xstate.typesMod

import typings.xstate.actorMod.Actor
import org.scalablytyped.runtime.StObject
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
  implicit class SendActionObjectMutableBuilder[Self <: SendActionObject[_, _, _], TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */] (val x: Self with (SendActionObject[TContext, TEvent, TSentEvent])) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setEvent(value: TSentEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String | Double | (Actor[_, AnyEventObject])): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    @scala.inline
    def set_event(value: typings.xstate.typesMod.SCXML.Event[TSentEvent]): Self = StObject.set(x, "_event", value.asInstanceOf[js.Any])
  }
}
