package typings.webxr.mod

import org.scalablytyped.runtime.StObject
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
  implicit class XRRenderStateInitMutableBuilder[Self <: XRRenderStateInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseLayer(value: XRWebGLLayer): Self = StObject.set(x, "baseLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayers(value: js.Array[XRLayer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: XRLayer*): Self = StObject.set(x, "layers", js.Array(value :_*))
  }
}
