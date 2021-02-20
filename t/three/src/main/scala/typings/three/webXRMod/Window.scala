package typings.three.webXRMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  var XR: js.UndefOr[Constructor[typings.three.webXRMod.XR]] = js.native
  
  var XRSession: js.UndefOr[Constructor[typings.three.webXRMod.XRSession]] = js.native
}
object Window {
  
  @scala.inline
  def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setXR(value: Constructor[XR]): Self = StObject.set(x, "XR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXRSession(value: Constructor[XRSession]): Self = StObject.set(x, "XRSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXRSessionUndefined: Self = StObject.set(x, "XRSession", js.undefined)
    
    @scala.inline
    def setXRUndefined: Self = StObject.set(x, "XR", js.undefined)
  }
}
