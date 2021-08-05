package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'a' | 'b'> */
trait BatchMatMulInputs extends StObject {
  
  var a: js.UndefOr[js.Any] = js.undefined
  
  var b: js.UndefOr[js.Any] = js.undefined
}
object BatchMatMulInputs {
  
  inline def apply(): BatchMatMulInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchMatMulInputs]
  }
  
  extension [Self <: BatchMatMulInputs](x: Self) {
    
    inline def setA(value: js.Any): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
    
    inline def setB(value: js.Any): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
  }
}
