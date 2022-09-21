package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'indices' | 'values' | 'denseShape' | 'defaultValue'> */
trait SparseFillEmptyRowsInputs extends StObject {
  
  var defaultValue: js.UndefOr[scala.Any] = js.undefined
  
  var denseShape: js.UndefOr[scala.Any] = js.undefined
  
  var indices: js.UndefOr[scala.Any] = js.undefined
  
  var values: js.UndefOr[scala.Any] = js.undefined
}
object SparseFillEmptyRowsInputs {
  
  inline def apply(): SparseFillEmptyRowsInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparseFillEmptyRowsInputs]
  }
  
  extension [Self <: SparseFillEmptyRowsInputs](x: Self) {
    
    inline def setDefaultValue(value: scala.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDenseShape(value: scala.Any): Self = StObject.set(x, "denseShape", value.asInstanceOf[js.Any])
    
    inline def setDenseShapeUndefined: Self = StObject.set(x, "denseShape", js.undefined)
    
    inline def setIndices(value: scala.Any): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setValues(value: scala.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
