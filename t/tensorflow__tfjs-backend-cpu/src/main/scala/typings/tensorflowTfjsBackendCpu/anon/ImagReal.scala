package typings.tensorflowTfjsBackendCpu.anon

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagReal extends StObject {
  
  var imag: Float32Array
  
  var real: Float32Array
}
object ImagReal {
  
  inline def apply(imag: Float32Array, real: Float32Array): ImagReal = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagReal]
  }
  
  extension [Self <: ImagReal](x: Self) {
    
    inline def setImag(value: Float32Array): Self = StObject.set(x, "imag", value.asInstanceOf[js.Any])
    
    inline def setReal(value: Float32Array): Self = StObject.set(x, "real", value.asInstanceOf[js.Any])
  }
}
