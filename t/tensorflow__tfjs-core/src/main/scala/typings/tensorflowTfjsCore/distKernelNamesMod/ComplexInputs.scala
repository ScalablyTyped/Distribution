package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'real' | 'imag'> */
trait ComplexInputs extends StObject {
  
  var imag: js.UndefOr[scala.Any] = js.undefined
  
  var real: js.UndefOr[scala.Any] = js.undefined
}
object ComplexInputs {
  
  inline def apply(): ComplexInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplexInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComplexInputs] (val x: Self) extends AnyVal {
    
    inline def setImag(value: scala.Any): Self = StObject.set(x, "imag", value.asInstanceOf[js.Any])
    
    inline def setImagUndefined: Self = StObject.set(x, "imag", js.undefined)
    
    inline def setReal(value: scala.Any): Self = StObject.set(x, "real", value.asInstanceOf[js.Any])
    
    inline def setRealUndefined: Self = StObject.set(x, "real", js.undefined)
  }
}
