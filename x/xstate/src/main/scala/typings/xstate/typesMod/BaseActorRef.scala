package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseActorRef[TEvent /* <: EventObject */] extends StObject {
  
  def send(event: TEvent): Unit
}
object BaseActorRef {
  
  inline def apply[TEvent /* <: EventObject */](send: TEvent => Unit): BaseActorRef[TEvent] = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[BaseActorRef[TEvent]]
  }
  
  extension [Self <: BaseActorRef[?], TEvent /* <: EventObject */](x: Self & BaseActorRef[TEvent]) {
    
    inline def setSend(value: TEvent => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
  }
}
