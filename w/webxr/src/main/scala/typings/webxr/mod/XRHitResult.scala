package typings.webxr.mod

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRHitResult extends StObject {
  
  var hitMatrix: Float32Array
}
object XRHitResult {
  
  @scala.inline
  def apply(hitMatrix: Float32Array): XRHitResult = {
    val __obj = js.Dynamic.literal(hitMatrix = hitMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRHitResult]
  }
  
  @scala.inline
  implicit class XRHitResultMutableBuilder[Self <: XRHitResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHitMatrix(value: Float32Array): Self = StObject.set(x, "hitMatrix", value.asInstanceOf[js.Any])
  }
}
