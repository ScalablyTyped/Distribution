package typings.tensorflowTfjsCore.distKernelNamesMod

import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  paramsNestedSplits :std.Array<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/tensor_info.TensorInfo>} & std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'paramsDenseValues' | 'indices'> */
trait RaggedGatherInputs extends StObject {
  
  var indices: js.UndefOr[scala.Any] = js.undefined
  
  var paramsDenseValues: js.UndefOr[scala.Any] = js.undefined
  
  var paramsNestedSplits: js.Array[TensorInfo]
}
object RaggedGatherInputs {
  
  inline def apply(paramsNestedSplits: js.Array[TensorInfo]): RaggedGatherInputs = {
    val __obj = js.Dynamic.literal(paramsNestedSplits = paramsNestedSplits.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaggedGatherInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RaggedGatherInputs] (val x: Self) extends AnyVal {
    
    inline def setIndices(value: scala.Any): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setParamsDenseValues(value: scala.Any): Self = StObject.set(x, "paramsDenseValues", value.asInstanceOf[js.Any])
    
    inline def setParamsDenseValuesUndefined: Self = StObject.set(x, "paramsDenseValues", js.undefined)
    
    inline def setParamsNestedSplits(value: js.Array[TensorInfo]): Self = StObject.set(x, "paramsNestedSplits", value.asInstanceOf[js.Any])
    
    inline def setParamsNestedSplitsVarargs(value: TensorInfo*): Self = StObject.set(x, "paramsNestedSplits", js.Array(value*))
  }
}
