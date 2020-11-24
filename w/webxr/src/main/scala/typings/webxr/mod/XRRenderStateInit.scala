package typings.webxr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRRenderStateInit extends XRRenderState {
  
  @JSName("baseLayer")
  var baseLayer_XRRenderStateInit: XRWebGLLayer = js.native
  
  var layers: js.UndefOr[js.Array[XRLayer]] = js.native
}
object XRRenderStateInit {
  
  @scala.inline
  def apply(baseLayer: XRWebGLLayer, depthFar: Double, depthNear: Double): XRRenderStateInit = {
    val __obj = js.Dynamic.literal(baseLayer = baseLayer.asInstanceOf[js.Any], depthFar = depthFar.asInstanceOf[js.Any], depthNear = depthNear.asInstanceOf[js.Any])
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
    def setLayersVarargs(value: XRLayer*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[XRLayer]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
  }
}
