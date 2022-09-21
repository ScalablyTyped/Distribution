package typings.victoryBrushLine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventHandlers extends StObject {
  
  var eventHandlers: OnMouseDown
  
  var target: Any
}
object EventHandlers {
  
  inline def apply(eventHandlers: OnMouseDown, target: Any): EventHandlers = {
    val __obj = js.Dynamic.literal(eventHandlers = eventHandlers.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventHandlers]
  }
  
  extension [Self <: EventHandlers](x: Self) {
    
    inline def setEventHandlers(value: OnMouseDown): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
