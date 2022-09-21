package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'shape' | 'values' | 'defaultValue'> & {  rowPartitionTensors :std.Array<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.TensorInfo>} */
trait RaggedTensorToTensorInputs extends StObject {
  
  var defaultValue: js.UndefOr[scala.Any] = js.undefined
  
  var rowPartitionTensors: js.Array[TensorInfo]
  
  var shape: js.UndefOr[scala.Any] = js.undefined
  
  var values: js.UndefOr[scala.Any] = js.undefined
}
object RaggedTensorToTensorInputs {
  
  inline def apply(rowPartitionTensors: js.Array[TensorInfo]): RaggedTensorToTensorInputs = {
    val __obj = js.Dynamic.literal(rowPartitionTensors = rowPartitionTensors.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaggedTensorToTensorInputs]
  }
  
  extension [Self <: RaggedTensorToTensorInputs](x: Self) {
    
    inline def setDefaultValue(value: scala.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setRowPartitionTensors(value: js.Array[TensorInfo]): Self = StObject.set(x, "rowPartitionTensors", value.asInstanceOf[js.Any])
    
    inline def setRowPartitionTensorsVarargs(value: TensorInfo*): Self = StObject.set(x, "rowPartitionTensors", js.Array(value*))
    
    inline def setShape(value: scala.Any): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setValues(value: scala.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
