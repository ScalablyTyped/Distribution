package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'sparseIndices' | 'sparseValues' | 'defaultValue'> */
trait SparseToDenseInputs extends StObject {
  
  var defaultValue: js.UndefOr[scala.Any] = js.undefined
  
  var sparseIndices: js.UndefOr[scala.Any] = js.undefined
  
  var sparseValues: js.UndefOr[scala.Any] = js.undefined
}
object SparseToDenseInputs {
  
  inline def apply(): SparseToDenseInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparseToDenseInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SparseToDenseInputs] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: scala.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setSparseIndices(value: scala.Any): Self = StObject.set(x, "sparseIndices", value.asInstanceOf[js.Any])
    
    inline def setSparseIndicesUndefined: Self = StObject.set(x, "sparseIndices", js.undefined)
    
    inline def setSparseValues(value: scala.Any): Self = StObject.set(x, "sparseValues", value.asInstanceOf[js.Any])
    
    inline def setSparseValuesUndefined: Self = StObject.set(x, "sparseValues", js.undefined)
  }
}
