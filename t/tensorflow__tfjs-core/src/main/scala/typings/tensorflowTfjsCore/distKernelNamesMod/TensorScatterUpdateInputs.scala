package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'tensor' | 'indices' | 'updates'> */
trait TensorScatterUpdateInputs extends StObject {
  
  var indices: js.UndefOr[scala.Any] = js.undefined
  
  var tensor: js.UndefOr[scala.Any] = js.undefined
  
  var updates: js.UndefOr[scala.Any] = js.undefined
}
object TensorScatterUpdateInputs {
  
  inline def apply(): TensorScatterUpdateInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TensorScatterUpdateInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TensorScatterUpdateInputs] (val x: Self) extends AnyVal {
    
    inline def setIndices(value: scala.Any): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setTensor(value: scala.Any): Self = StObject.set(x, "tensor", value.asInstanceOf[js.Any])
    
    inline def setTensorUndefined: Self = StObject.set(x, "tensor", js.undefined)
    
    inline def setUpdates(value: scala.Any): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesUndefined: Self = StObject.set(x, "updates", js.undefined)
  }
}
