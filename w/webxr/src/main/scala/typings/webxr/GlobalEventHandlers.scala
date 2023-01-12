package typings.webxr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalEventHandlers extends StObject {
  
  /**
    * An XRSessionEvent of type beforexrselect is dispatched on the DOM overlay
    * element before generating a WebXR selectstart input event if the -Z axis
    * of the input source's targetRaySpace intersects the DOM overlay element
    * at the time the input device's primary action is triggered.
    */
  var onbeforexrselect: (js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any]) | Null
}
object GlobalEventHandlers {
  
  inline def apply(): GlobalEventHandlers = {
    val __obj = js.Dynamic.literal(onbeforexrselect = null)
    __obj.asInstanceOf[GlobalEventHandlers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalEventHandlers] (val x: Self) extends AnyVal {
    
    inline def setOnbeforexrselect(value: js.ThisFunction1[GlobalEventHandlers, /* ev */ XRSessionEvent, Any]): Self = StObject.set(x, "onbeforexrselect", value.asInstanceOf[js.Any])
    
    inline def setOnbeforexrselectNull: Self = StObject.set(x, "onbeforexrselect", null)
  }
}
