package typings.tensorflowTfjsBackendCpu.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagReal extends StObject {
  
  var imag: js.typedarray.Float32Array
  
  var real: js.typedarray.Float32Array
}
object ImagReal {
  
  inline def apply(imag: js.typedarray.Float32Array, real: js.typedarray.Float32Array): ImagReal = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagReal]
  }
  
  extension [Self <: ImagReal](x: Self) {
    
    inline def setImag(value: js.typedarray.Float32Array): Self = StObject.set(x, "imag", value.asInstanceOf[js.Any])
    
    inline def setReal(value: js.typedarray.Float32Array): Self = StObject.set(x, "real", value.asInstanceOf[js.Any])
  }
}
