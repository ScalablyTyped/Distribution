package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendAction[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */]
  extends StObject
     with ActionObject[TContext, TEvent] {
  
  var delay: js.UndefOr[Double | String | (DelayExpr[TContext, TEvent])] = js.undefined
  
  var event: TSentEvent | (SendExpr[TContext, TEvent, TSentEvent])
  
  var id: String | Double
  
  var to: js.UndefOr[
    String | Double | (ActorRef[Any, Any]) | (ExprWithMeta[TContext, TEvent, String | Double | (ActorRef[Any, Any])])
  ] = js.undefined
}
object SendAction {
  
  inline def apply[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: TSentEvent | (SendExpr[TContext, TEvent, TSentEvent]), id: String | Double, `type`: String): SendAction[TContext, TEvent, TSentEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendAction[?, ?, ?], TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */] (val x: Self & (SendAction[TContext, TEvent, TSentEvent])) extends AnyVal {
    
    inline def setDelay(value: Double | String | (DelayExpr[TContext, TEvent])): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayFunction3(value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => Double): Self = StObject.set(x, "delay", js.Any.fromFunction3(value))
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setEvent(value: TSentEvent | (SendExpr[TContext, TEvent, TSentEvent])): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventFunction3(value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => TSentEvent): Self = StObject.set(x, "event", js.Any.fromFunction3(value))
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTo(
      value: String | Double | (ActorRef[Any, Any]) | (ExprWithMeta[TContext, TEvent, String | Double | (ActorRef[Any, Any])])
    ): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToFunction3(
      value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => String | Double | (ActorRef[Any, Any])
    ): Self = StObject.set(x, "to", js.Any.fromFunction3(value))
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
