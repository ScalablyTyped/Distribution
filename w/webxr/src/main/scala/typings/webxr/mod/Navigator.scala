package typings.webxr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  var xr: XRSystem
}
object Navigator {
  
  inline def apply(xr: XRSystem): Navigator = {
    val __obj = js.Dynamic.literal(xr = xr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  extension [Self <: Navigator](x: Self) {
    
    inline def setXr(value: XRSystem): Self = StObject.set(x, "xr", value.asInstanceOf[js.Any])
  }
}
