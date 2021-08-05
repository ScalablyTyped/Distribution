package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'indices' | 'updates'> */
trait ScatterNdInputs extends StObject {
  
  var indices: js.UndefOr[js.Any] = js.undefined
  
  var updates: js.UndefOr[js.Any] = js.undefined
}
object ScatterNdInputs {
  
  inline def apply(): ScatterNdInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScatterNdInputs]
  }
  
  extension [Self <: ScatterNdInputs](x: Self) {
    
    inline def setIndices(value: js.Any): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setUpdates(value: js.Any): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesUndefined: Self = StObject.set(x, "updates", js.undefined)
  }
}
