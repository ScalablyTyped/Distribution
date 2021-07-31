package typings.three.webXRMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRRenderState extends StObject {
  
  val baseLayer: js.UndefOr[XRWebGLLayer] = js.undefined
  
  val depthFar: Double
  
  val depthNear: Double
  
  val inlineVerticalFieldOfView: js.UndefOr[Double] = js.undefined
}
object XRRenderState {
  
  @scala.inline
  def apply(depthFar: Double, depthNear: Double): XRRenderState = {
    val __obj = js.Dynamic.literal(depthFar = depthFar.asInstanceOf[js.Any], depthNear = depthNear.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRRenderState]
  }
  
  @scala.inline
  implicit class XRRenderStateMutableBuilder[Self <: XRRenderState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseLayer(value: XRWebGLLayer): Self = StObject.set(x, "baseLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseLayerUndefined: Self = StObject.set(x, "baseLayer", js.undefined)
    
    @scala.inline
    def setDepthFar(value: Double): Self = StObject.set(x, "depthFar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthNear(value: Double): Self = StObject.set(x, "depthNear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineVerticalFieldOfView(value: Double): Self = StObject.set(x, "inlineVerticalFieldOfView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineVerticalFieldOfViewUndefined: Self = StObject.set(x, "inlineVerticalFieldOfView", js.undefined)
  }
}
