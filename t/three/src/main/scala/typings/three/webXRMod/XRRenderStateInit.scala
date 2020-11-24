package typings.three.webXRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRRenderStateInit extends js.Object {
  
  var baseLayer: js.UndefOr[XRWebGLLayer] = js.native
  
  var depthFar: js.UndefOr[Double] = js.native
  
  var depthNear: js.UndefOr[Double] = js.native
  
  var inlineVerticalFieldOfView: js.UndefOr[Double] = js.native
}
object XRRenderStateInit {
  
  @scala.inline
  def apply(): XRRenderStateInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XRRenderStateInit]
  }
  
  @scala.inline
  implicit class XRRenderStateInitOps[Self <: XRRenderStateInit] (val x: Self) extends AnyVal {
    
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
    def setBaseLayer(value: XRWebGLLayer): Self = this.set("baseLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseLayer: Self = this.set("baseLayer", js.undefined)
    
    @scala.inline
    def setDepthFar(value: Double): Self = this.set("depthFar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepthFar: Self = this.set("depthFar", js.undefined)
    
    @scala.inline
    def setDepthNear(value: Double): Self = this.set("depthNear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepthNear: Self = this.set("depthNear", js.undefined)
    
    @scala.inline
    def setInlineVerticalFieldOfView(value: Double): Self = this.set("inlineVerticalFieldOfView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineVerticalFieldOfView: Self = this.set("inlineVerticalFieldOfView", js.undefined)
  }
}
