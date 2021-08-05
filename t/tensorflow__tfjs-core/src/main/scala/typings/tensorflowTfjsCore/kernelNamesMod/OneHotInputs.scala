package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'indices'> */
trait OneHotInputs extends StObject {
  
  var indices: js.UndefOr[js.Any] = js.undefined
}
object OneHotInputs {
  
  inline def apply(): OneHotInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OneHotInputs]
  }
  
  extension [Self <: OneHotInputs](x: Self) {
    
    inline def setIndices(value: js.Any): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
  }
}
