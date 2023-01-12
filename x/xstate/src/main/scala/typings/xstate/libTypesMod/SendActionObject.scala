package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendActionObject[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */]
  extends StObject
     with SendAction[TContext, TEvent, TSentEvent] {
  
  var _event: typings.xstate.libTypesMod.SCXML.Event[TSentEvent]
  
  @JSName("delay")
  var delay_SendActionObject: js.UndefOr[Double] = js.undefined
  
  @JSName("event")
  var event_SendActionObject: TSentEvent
  
  @JSName("to")
  var to_SendActionObject: js.UndefOr[String | Double | (ActorRef[Any, Any])] = js.undefined
}
object SendActionObject {
  
  inline def apply[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](
    _event: typings.xstate.libTypesMod.SCXML.Event[TSentEvent],
    event: TSentEvent,
    id: String | Double,
    `type`: String
  ): SendActionObject[TContext, TEvent, TSentEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendActionObject[TContext, TEvent, TSentEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendActionObject[?, ?, ?], TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */] (val x: Self & (SendActionObject[TContext, TEvent, TSentEvent])) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setEvent(value: TSentEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String | Double | (ActorRef[Any, Any])): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def set_event(value: typings.xstate.libTypesMod.SCXML.Event[TSentEvent]): Self = StObject.set(x, "_event", value.asInstanceOf[js.Any])
  }
}
