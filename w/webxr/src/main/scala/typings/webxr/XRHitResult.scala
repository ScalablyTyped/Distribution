package typings.webxr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Legacy
trait XRHitResult extends StObject {
  
  var hitMatrix: js.typedarray.Float32Array
}
object XRHitResult {
  
  inline def apply(hitMatrix: js.typedarray.Float32Array): XRHitResult = {
    val __obj = js.Dynamic.literal(hitMatrix = hitMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRHitResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRHitResult] (val x: Self) extends AnyVal {
    
    inline def setHitMatrix(value: js.typedarray.Float32Array): Self = StObject.set(x, "hitMatrix", value.asInstanceOf[js.Any])
  }
}
