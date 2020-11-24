package typings.winrtUwp.Windows.Graphics.Holographic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HolographicCameraPose extends js.Object {
  
  var farPlaneDistance: js.Any = js.native
  
   /* unmapped type */ var holographicCamera: js.Any = js.native
  
   /* unmapped type */ var nearPlaneDistance: js.Any = js.native
  
   /* unmapped type */ var projectionTransform: js.Any = js.native
  
   /* unmapped type */ var tryGetCullingFrustum: js.Any = js.native
  
   /* unmapped type */ var tryGetViewTransform: js.Any = js.native
  
   /* unmapped type */ var tryGetVisibleFrustum: js.Any = js.native
  
   /* unmapped type */ var viewport: js.Any = js.native
}
object HolographicCameraPose {
  
  @scala.inline
  def apply(
    farPlaneDistance: js.Any,
    holographicCamera: js.Any,
    nearPlaneDistance: js.Any,
    projectionTransform: js.Any,
    tryGetCullingFrustum: js.Any,
    tryGetViewTransform: js.Any,
    tryGetVisibleFrustum: js.Any,
    viewport: js.Any
  ): HolographicCameraPose = {
    val __obj = js.Dynamic.literal(farPlaneDistance = farPlaneDistance.asInstanceOf[js.Any], holographicCamera = holographicCamera.asInstanceOf[js.Any], nearPlaneDistance = nearPlaneDistance.asInstanceOf[js.Any], projectionTransform = projectionTransform.asInstanceOf[js.Any], tryGetCullingFrustum = tryGetCullingFrustum.asInstanceOf[js.Any], tryGetViewTransform = tryGetViewTransform.asInstanceOf[js.Any], tryGetVisibleFrustum = tryGetVisibleFrustum.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[HolographicCameraPose]
  }
  
  @scala.inline
  implicit class HolographicCameraPoseOps[Self <: HolographicCameraPose] (val x: Self) extends AnyVal {
    
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
    def setFarPlaneDistance(value: js.Any): Self = this.set("farPlaneDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHolographicCamera(value: js.Any): Self = this.set("holographicCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearPlaneDistance(value: js.Any): Self = this.set("nearPlaneDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionTransform(value: js.Any): Self = this.set("projectionTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryGetCullingFrustum(value: js.Any): Self = this.set("tryGetCullingFrustum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryGetViewTransform(value: js.Any): Self = this.set("tryGetViewTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryGetVisibleFrustum(value: js.Any): Self = this.set("tryGetVisibleFrustum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewport(value: js.Any): Self = this.set("viewport", value.asInstanceOf[js.Any])
  }
}
