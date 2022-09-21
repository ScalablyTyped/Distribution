package typings.xstate.typesMod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActorContext[TEvent /* <: EventObject */, TEmitted] extends StObject {
  
  var id: String
  
  var observers: Set[Observer[TEmitted]]
  
  var parent: js.UndefOr[ActorRef[Any, Any]] = js.undefined
  
  var self: ActorRef[TEvent, TEmitted]
}
object ActorContext {
  
  inline def apply[TEvent /* <: EventObject */, TEmitted](id: String, observers: Set[Observer[TEmitted]], self: ActorRef[TEvent, TEmitted]): ActorContext[TEvent, TEmitted] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], observers = observers.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActorContext[TEvent, TEmitted]]
  }
  
  extension [Self <: ActorContext[?, ?], TEvent /* <: EventObject */, TEmitted](x: Self & (ActorContext[TEvent, TEmitted])) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setObservers(value: Set[Observer[TEmitted]]): Self = StObject.set(x, "observers", value.asInstanceOf[js.Any])
    
    inline def setParent(value: ActorRef[Any, Any]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setSelf(value: ActorRef[TEvent, TEmitted]): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
  }
}
