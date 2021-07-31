package typings.tensorflowTfjsCore.anon

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Imag extends StObject {
  
  var imag: Float32Array
  
  var real: Float32Array
}
object Imag {
  
  @scala.inline
  def apply(imag: Float32Array, real: Float32Array): Imag = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imag]
  }
  
  @scala.inline
  implicit class ImagMutableBuilder[Self <: Imag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImag(value: Float32Array): Self = StObject.set(x, "imag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReal(value: Float32Array): Self = StObject.set(x, "real", value.asInstanceOf[js.Any])
  }
}
