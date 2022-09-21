package typings.useGestureCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event[EventType] extends StObject {
  
  var event: EventType
}
object Event {
  
  inline def apply[EventType](event: EventType): Event[EventType] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[EventType]]
  }
  
  extension [Self <: Event[?], EventType](x: Self & Event[EventType]) {
    
    inline def setEvent(value: EventType): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
