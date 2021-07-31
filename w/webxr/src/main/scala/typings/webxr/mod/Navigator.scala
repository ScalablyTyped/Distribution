package typings.webxr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  var xr: XRSystem
}
object Navigator {
  
  @scala.inline
  def apply(xr: XRSystem): Navigator = {
    val __obj = js.Dynamic.literal(xr = xr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit class NavigatorMutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setXr(value: XRSystem): Self = StObject.set(x, "xr", value.asInstanceOf[js.Any])
  }
}
