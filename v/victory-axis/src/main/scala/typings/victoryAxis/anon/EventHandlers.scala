package typings.victoryAxis.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventHandlers extends StObject {
  
  var eventHandlers: Requireable[js.Object]
  
  var eventKey: Requireable[String | Double | js.Array[Any]]
  
  var target: Requireable[String]
}
object EventHandlers {
  
  inline def apply(
    eventHandlers: Requireable[js.Object],
    eventKey: Requireable[String | Double | js.Array[Any]],
    target: Requireable[String]
  ): EventHandlers = {
    val __obj = js.Dynamic.literal(eventHandlers = eventHandlers.asInstanceOf[js.Any], eventKey = eventKey.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventHandlers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventHandlers] (val x: Self) extends AnyVal {
    
    inline def setEventHandlers(value: Requireable[js.Object]): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
    
    inline def setEventKey(value: Requireable[String | Double | js.Array[Any]]): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Requireable[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
