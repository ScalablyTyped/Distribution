package typings.webxr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRWebGLLayerInit extends StObject {
  
  var alpha: js.UndefOr[Boolean] = js.undefined
  
  var antialias: js.UndefOr[Boolean] = js.undefined
  
  var depth: js.UndefOr[Boolean] = js.undefined
  
  var framebufferScaleFactor: js.UndefOr[Double] = js.undefined
  
  var multiview: js.UndefOr[Boolean] = js.undefined
  
  var stencil: js.UndefOr[Boolean] = js.undefined
}
object XRWebGLLayerInit {
  
  @scala.inline
  def apply(): XRWebGLLayerInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XRWebGLLayerInit]
  }
  
  @scala.inline
  implicit class XRWebGLLayerInitMutableBuilder[Self <: XRWebGLLayerInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
    
    @scala.inline
    def setDepth(value: Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    @scala.inline
    def setFramebufferScaleFactor(value: Double): Self = StObject.set(x, "framebufferScaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramebufferScaleFactorUndefined: Self = StObject.set(x, "framebufferScaleFactor", js.undefined)
    
    @scala.inline
    def setMultiview(value: Boolean): Self = StObject.set(x, "multiview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiviewUndefined: Self = StObject.set(x, "multiview", js.undefined)
    
    @scala.inline
    def setStencil(value: Boolean): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStencilUndefined: Self = StObject.set(x, "stencil", js.undefined)
  }
}
