package typings.webxr

import typings.std.DOMPointReadOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// AR Hit testing
trait XRRay extends StObject {
  
  val direction: DOMPointReadOnly
  
  val matrix: js.typedarray.Float32Array
  
  val origin: DOMPointReadOnly
}
object XRRay {
  
  inline def apply(direction: DOMPointReadOnly, matrix: js.typedarray.Float32Array, origin: DOMPointReadOnly): XRRay = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRRay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRRay] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: DOMPointReadOnly): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setMatrix(value: js.typedarray.Float32Array): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: DOMPointReadOnly): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
