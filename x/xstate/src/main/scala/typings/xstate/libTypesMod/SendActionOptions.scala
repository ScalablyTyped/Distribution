package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendActionOptions[TContext, TEvent /* <: EventObject */]
  extends StObject
     with RaiseActionOptions[TContext, TEvent] {
  
  var to: js.UndefOr[
    String | (ActorRef[Any, Any]) | (ExprWithMeta[TContext, TEvent, String | (ActorRef[Any, Any])])
  ] = js.undefined
}
object SendActionOptions {
  
  inline def apply[TContext, TEvent /* <: EventObject */](): SendActionOptions[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendActionOptions[TContext, TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendActionOptions[?, ?], TContext, TEvent /* <: EventObject */] (val x: Self & (SendActionOptions[TContext, TEvent])) extends AnyVal {
    
    inline def setTo(
      value: String | (ActorRef[Any, Any]) | (ExprWithMeta[TContext, TEvent, String | (ActorRef[Any, Any])])
    ): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToFunction3(value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => String | (ActorRef[Any, Any])): Self = StObject.set(x, "to", js.Any.fromFunction3(value))
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
