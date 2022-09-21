package typings.webxr

import typings.std.DOMPointReadOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A transform described by a position and orientation. When interpreting an
  * XRRigidTransform the orientation is always applied prior to the position.
  *
  * ref: https://immersive-web.github.io/webxr/#xrrigidtransform-interface
  */
trait XRRigidTransform extends StObject {
  
  val inverse: XRRigidTransform
  
  val matrix: js.typedarray.Float32Array
  
  val orientation: DOMPointReadOnly
  
  val position: DOMPointReadOnly
}
object XRRigidTransform {
  
  inline def apply(
    inverse: XRRigidTransform,
    matrix: js.typedarray.Float32Array,
    orientation: DOMPointReadOnly,
    position: DOMPointReadOnly
  ): XRRigidTransform = {
    val __obj = js.Dynamic.literal(inverse = inverse.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRRigidTransform]
  }
  
  extension [Self <: XRRigidTransform](x: Self) {
    
    inline def setInverse(value: XRRigidTransform): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def setMatrix(value: js.typedarray.Float32Array): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: DOMPointReadOnly): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: DOMPointReadOnly): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
