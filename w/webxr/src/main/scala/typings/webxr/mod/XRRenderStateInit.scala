package typings.webxr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRRenderStateInit
  extends StObject
     with XRRenderState {
  
  @JSName("baseLayer")
  var baseLayer_XRRenderStateInit: XRWebGLLayer
  
  var layers: js.UndefOr[js.Array[XRLayer]] = js.undefined
}
object XRRenderStateInit {
  
  inline def apply(baseLayer: XRWebGLLayer, depthFar: Double, depthNear: Double): XRRenderStateInit = {
    val __obj = js.Dynamic.literal(baseLayer = baseLayer.asInstanceOf[js.Any], depthFar = depthFar.asInstanceOf[js.Any], depthNear = depthNear.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRRenderStateInit]
  }
  
  extension [Self <: XRRenderStateInit](x: Self) {
    
    inline def setBaseLayer(value: XRWebGLLayer): Self = StObject.set(x, "baseLayer", value.asInstanceOf[js.Any])
    
    inline def setLayers(value: js.Array[XRLayer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: XRLayer*): Self = StObject.set(x, "layers", js.Array(value :_*))
  }
}
