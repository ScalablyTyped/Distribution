package typings.three.webXRMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRRenderStateInit extends StObject {
  
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
  implicit class XRRenderStateInitMutableBuilder[Self <: XRRenderStateInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseLayer(value: XRWebGLLayer): Self = StObject.set(x, "baseLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseLayerUndefined: Self = StObject.set(x, "baseLayer", js.undefined)
    
    @scala.inline
    def setDepthFar(value: Double): Self = StObject.set(x, "depthFar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthFarUndefined: Self = StObject.set(x, "depthFar", js.undefined)
    
    @scala.inline
    def setDepthNear(value: Double): Self = StObject.set(x, "depthNear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthNearUndefined: Self = StObject.set(x, "depthNear", js.undefined)
    
    @scala.inline
    def setInlineVerticalFieldOfView(value: Double): Self = StObject.set(x, "inlineVerticalFieldOfView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineVerticalFieldOfViewUndefined: Self = StObject.set(x, "inlineVerticalFieldOfView", js.undefined)
  }
}
