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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Event[?], EventType] (val x: Self & Event[EventType]) extends AnyVal {
    
    inline def setEvent(value: EventType): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
