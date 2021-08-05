package typings.three.webXRMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var XR: js.UndefOr[Constructor[typings.three.webXRMod.XR]] = js.undefined
  
  var XRSession: js.UndefOr[Constructor[typings.three.webXRMod.XRSession]] = js.undefined
}
object Window {
  
  inline def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setXR(value: Constructor[XR]): Self = StObject.set(x, "XR", value.asInstanceOf[js.Any])
    
    inline def setXRSession(value: Constructor[XRSession]): Self = StObject.set(x, "XRSession", value.asInstanceOf[js.Any])
    
    inline def setXRSessionUndefined: Self = StObject.set(x, "XRSession", js.undefined)
    
    inline def setXRUndefined: Self = StObject.set(x, "XR", js.undefined)
  }
}
