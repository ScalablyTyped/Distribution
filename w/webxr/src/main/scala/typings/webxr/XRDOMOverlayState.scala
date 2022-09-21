package typings.webxr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRDOMOverlayState extends StObject {
  
  var `type`: XRDOMOverlayType
}
object XRDOMOverlayState {
  
  inline def apply(`type`: XRDOMOverlayType): XRDOMOverlayState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRDOMOverlayState]
  }
  
  extension [Self <: XRDOMOverlayState](x: Self) {
    
    inline def setType(value: XRDOMOverlayType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
