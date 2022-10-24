package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerEvents extends StObject {
  
  var pointerEvents: js.UndefOr[String] = js.undefined
  
  var transform: js.UndefOr[String] = js.undefined
  
  var transition: js.UndefOr[String] = js.undefined
  
  var willChange: js.UndefOr[String] = js.undefined
}
object PointerEvents {
  
  inline def apply(): PointerEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointerEvents]
  }
  
  extension [Self <: PointerEvents](x: Self) {
    
    inline def setPointerEvents(value: String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setWillChange(value: String): Self = StObject.set(x, "willChange", value.asInstanceOf[js.Any])
    
    inline def setWillChangeUndefined: Self = StObject.set(x, "willChange", js.undefined)
  }
}
