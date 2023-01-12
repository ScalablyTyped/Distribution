package typings.victoryCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events extends StObject {
  
  var events: js.Array[Any]
  
  var getEventState: js.Function
}
object Events {
  
  inline def apply(events: js.Array[Any], getEventState: js.Function): Events = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], getEventState = getEventState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: js.Array[Any]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: Any*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setGetEventState(value: js.Function): Self = StObject.set(x, "getEventState", value.asInstanceOf[js.Any])
  }
}
