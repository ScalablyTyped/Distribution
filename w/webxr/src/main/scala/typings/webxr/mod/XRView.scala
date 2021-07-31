package typings.webxr.mod

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRView extends StObject {
  
  val eye: XREye
  
  val projectionMatrix: Float32Array
  
  val recommendedViewportScale: js.UndefOr[Double] = js.undefined
  
  def requestViewportScale(scale: Double): Unit
  
  val transform: XRRigidTransform
}
object XRView {
  
  @scala.inline
  def apply(
    eye: XREye,
    projectionMatrix: Float32Array,
    requestViewportScale: Double => Unit,
    transform: XRRigidTransform
  ): XRView = {
    val __obj = js.Dynamic.literal(eye = eye.asInstanceOf[js.Any], projectionMatrix = projectionMatrix.asInstanceOf[js.Any], requestViewportScale = js.Any.fromFunction1(requestViewportScale), transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRView]
  }
  
  @scala.inline
  implicit class XRViewMutableBuilder[Self <: XRView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEye(value: XREye): Self = StObject.set(x, "eye", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionMatrix(value: Float32Array): Self = StObject.set(x, "projectionMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendedViewportScale(value: Double): Self = StObject.set(x, "recommendedViewportScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendedViewportScaleUndefined: Self = StObject.set(x, "recommendedViewportScale", js.undefined)
    
    @scala.inline
    def setRequestViewportScale(value: Double => Unit): Self = StObject.set(x, "requestViewportScale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransform(value: XRRigidTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
