package typings.webxr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRRenderState extends js.Object {
  
  val baseLayer: js.UndefOr[XRWebGLLayer] = js.native
  
  val depthFar: Double = js.native
  
  val depthNear: Double = js.native
  
  val inlineVerticalFieldOfView: js.UndefOr[Double] = js.native
}
object XRRenderState {
  
  @scala.inline
  def apply(depthFar: Double, depthNear: Double): XRRenderState = {
    val __obj = js.Dynamic.literal(depthFar = depthFar.asInstanceOf[js.Any], depthNear = depthNear.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRRenderState]
  }
  
  @scala.inline
  implicit class XRRenderStateOps[Self <: XRRenderState] (val x: Self) extends AnyVal {
    
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
    def setDepthFar(value: Double): Self = this.set("depthFar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthNear(value: Double): Self = this.set("depthNear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseLayer(value: XRWebGLLayer): Self = this.set("baseLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseLayer: Self = this.set("baseLayer", js.undefined)
    
    @scala.inline
    def setInlineVerticalFieldOfView(value: Double): Self = this.set("inlineVerticalFieldOfView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineVerticalFieldOfView: Self = this.set("inlineVerticalFieldOfView", js.undefined)
  }
}
