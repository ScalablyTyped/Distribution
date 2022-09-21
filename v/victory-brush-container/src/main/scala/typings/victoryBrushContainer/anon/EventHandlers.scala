package typings.victoryBrushContainer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventHandlers extends StObject {
  
  var eventHandlers: OnGlobalMouseMove
  
  var target: String
}
object EventHandlers {
  
  inline def apply(eventHandlers: OnGlobalMouseMove, target: String): EventHandlers = {
    val __obj = js.Dynamic.literal(eventHandlers = eventHandlers.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventHandlers]
  }
  
  extension [Self <: EventHandlers](x: Self) {
    
    inline def setEventHandlers(value: OnGlobalMouseMove): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
