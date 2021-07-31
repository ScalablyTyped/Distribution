package typings.three.webXRMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  var xr: js.UndefOr[XR] = js.undefined
}
object Navigator {
  
  @scala.inline
  def apply(): Navigator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit class NavigatorMutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setXr(value: XR): Self = StObject.set(x, "xr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXrUndefined: Self = StObject.set(x, "xr", js.undefined)
  }
}
