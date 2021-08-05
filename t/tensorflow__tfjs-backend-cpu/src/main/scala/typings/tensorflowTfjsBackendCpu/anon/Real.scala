package typings.tensorflowTfjsBackendCpu.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Real extends StObject {
  
  var imag: Double
  
  var real: Double
}
object Real {
  
  inline def apply(imag: Double, real: Double): Real = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
    __obj.asInstanceOf[Real]
  }
  
  extension [Self <: Real](x: Self) {
    
    inline def setImag(value: Double): Self = StObject.set(x, "imag", value.asInstanceOf[js.Any])
    
    inline def setReal(value: Double): Self = StObject.set(x, "real", value.asInstanceOf[js.Any])
  }
}
