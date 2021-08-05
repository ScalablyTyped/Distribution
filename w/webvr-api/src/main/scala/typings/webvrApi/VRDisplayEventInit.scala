package typings.webvrApi

import typings.std.EventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VRDisplayEventInit
  extends StObject
     with EventInit {
  
  var display: VRDisplay
  
  var reason: js.UndefOr[VRDisplayEventReasonDtAlias] = js.undefined
}
object VRDisplayEventInit {
  
  inline def apply(display: VRDisplay): VRDisplayEventInit = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRDisplayEventInit]
  }
  
  extension [Self <: VRDisplayEventInit](x: Self) {
    
    inline def setDisplay(value: VRDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setReason(value: VRDisplayEventReasonDtAlias): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
