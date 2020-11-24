package typings.winrtUwp.Windows.Graphics.Holographic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HolographicCamera extends js.Object {
  
  var id: js.Any = js.native
  
   /* unmapped type */ var isStereo: js.Any = js.native
  
   /* unmapped type */ var renderTargetSize: js.Any = js.native
  
   /* unmapped type */ var setFarPlaneDistance: js.Any = js.native
  
   /* unmapped type */ var setNearPlaneDistance: js.Any = js.native
  
   /* unmapped type */ var viewportScaleFactor: js.Any = js.native
}
object HolographicCamera {
  
  @scala.inline
  def apply(
    id: js.Any,
    isStereo: js.Any,
    renderTargetSize: js.Any,
    setFarPlaneDistance: js.Any,
    setNearPlaneDistance: js.Any,
    viewportScaleFactor: js.Any
  ): HolographicCamera = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isStereo = isStereo.asInstanceOf[js.Any], renderTargetSize = renderTargetSize.asInstanceOf[js.Any], setFarPlaneDistance = setFarPlaneDistance.asInstanceOf[js.Any], setNearPlaneDistance = setNearPlaneDistance.asInstanceOf[js.Any], viewportScaleFactor = viewportScaleFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[HolographicCamera]
  }
  
  @scala.inline
  implicit class HolographicCameraOps[Self <: HolographicCamera] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStereo(value: js.Any): Self = this.set("isStereo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderTargetSize(value: js.Any): Self = this.set("renderTargetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFarPlaneDistance(value: js.Any): Self = this.set("setFarPlaneDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetNearPlaneDistance(value: js.Any): Self = this.set("setNearPlaneDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportScaleFactor(value: js.Any): Self = this.set("viewportScaleFactor", value.asInstanceOf[js.Any])
  }
}
