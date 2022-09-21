package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendActionOptions[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var delay: js.UndefOr[Double | String | (DelayExpr[TContext, TEvent])] = js.undefined
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var to: js.UndefOr[
    String | (ActorRef[Any, Any]) | (ExprWithMeta[TContext, TEvent, String | (ActorRef[Any, Any])])
  ] = js.undefined
}
object SendActionOptions {
  
  inline def apply[TContext, TEvent /* <: EventObject */](): SendActionOptions[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendActionOptions[TContext, TEvent]]
  }
  
  extension [Self <: SendActionOptions[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (SendActionOptions[TContext, TEvent])) {
    
    inline def setDelay(value: Double | String | (DelayExpr[TContext, TEvent])): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayFunction3(value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => Double): Self = StObject.set(x, "delay", js.Any.fromFunction3(value))
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTo(
      value: String | (ActorRef[Any, Any]) | (ExprWithMeta[TContext, TEvent, String | (ActorRef[Any, Any])])
    ): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToFunction3(value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => String | (ActorRef[Any, Any])): Self = StObject.set(x, "to", js.Any.fromFunction3(value))
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
