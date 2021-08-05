package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'real' | 'imag'> */
trait ComplexInputs extends StObject {
  
  var imag: js.UndefOr[js.Any] = js.undefined
  
  var real: js.UndefOr[js.Any] = js.undefined
}
object ComplexInputs {
  
  inline def apply(): ComplexInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplexInputs]
  }
  
  extension [Self <: ComplexInputs](x: Self) {
    
    inline def setImag(value: js.Any): Self = StObject.set(x, "imag", value.asInstanceOf[js.Any])
    
    inline def setImagUndefined: Self = StObject.set(x, "imag", js.undefined)
    
    inline def setReal(value: js.Any): Self = StObject.set(x, "real", value.asInstanceOf[js.Any])
    
    inline def setRealUndefined: Self = StObject.set(x, "real", js.undefined)
  }
}
