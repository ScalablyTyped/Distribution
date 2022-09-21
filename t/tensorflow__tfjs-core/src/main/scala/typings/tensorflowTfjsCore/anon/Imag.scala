package typings.tensorflowTfjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Imag extends StObject {
  
  var imag: js.typedarray.Float32Array
  
  var real: js.typedarray.Float32Array
}
object Imag {
  
  inline def apply(imag: js.typedarray.Float32Array, real: js.typedarray.Float32Array): Imag = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imag]
  }
  
  extension [Self <: Imag](x: Self) {
    
    inline def setImag(value: js.typedarray.Float32Array): Self = StObject.set(x, "imag", value.asInstanceOf[js.Any])
    
    inline def setReal(value: js.typedarray.Float32Array): Self = StObject.set(x, "real", value.asInstanceOf[js.Any])
  }
}
