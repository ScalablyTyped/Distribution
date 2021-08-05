package typings.three.webXRMod

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRView extends StObject {
  
  val eye: XREye
  
  val projectionMatrix: Float32Array
  
  val transform: XRRigidTransform
  
  val viewMatrix: Float32Array
}
object XRView {
  
  inline def apply(eye: XREye, projectionMatrix: Float32Array, transform: XRRigidTransform, viewMatrix: Float32Array): XRView = {
    val __obj = js.Dynamic.literal(eye = eye.asInstanceOf[js.Any], projectionMatrix = projectionMatrix.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], viewMatrix = viewMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRView]
  }
  
  extension [Self <: XRView](x: Self) {
    
    inline def setEye(value: XREye): Self = StObject.set(x, "eye", value.asInstanceOf[js.Any])
    
    inline def setProjectionMatrix(value: Float32Array): Self = StObject.set(x, "projectionMatrix", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: XRRigidTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setViewMatrix(value: Float32Array): Self = StObject.set(x, "viewMatrix", value.asInstanceOf[js.Any])
  }
}
