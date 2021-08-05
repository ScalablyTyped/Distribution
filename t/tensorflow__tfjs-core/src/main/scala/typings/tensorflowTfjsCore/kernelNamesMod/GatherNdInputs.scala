package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'params' | 'indices'> */
trait GatherNdInputs extends StObject {
  
  var indices: js.UndefOr[js.Any] = js.undefined
  
  var params: js.UndefOr[js.Any] = js.undefined
}
object GatherNdInputs {
  
  inline def apply(): GatherNdInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatherNdInputs]
  }
  
  extension [Self <: GatherNdInputs](x: Self) {
    
    inline def setIndices(value: js.Any): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
