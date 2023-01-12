package typings.xstate.libTypesMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseActorRef[?], TEvent /* <: EventObject */] (val x: Self & BaseActorRef[TEvent]) extends AnyVal {
    
    inline def setSend(value: TEvent => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
  }
}
