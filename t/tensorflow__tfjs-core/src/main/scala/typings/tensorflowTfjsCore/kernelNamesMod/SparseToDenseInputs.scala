package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'sparseIndices' | 'sparseValues' | 'defaultValue'> */
@js.native
trait SparseToDenseInputs extends StObject {
  
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  var sparseIndices: js.UndefOr[js.Any] = js.native
  
  var sparseValues: js.UndefOr[js.Any] = js.native
}
object SparseToDenseInputs {
  
  @scala.inline
  def apply(): SparseToDenseInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparseToDenseInputs]
  }
  
  @scala.inline
  implicit class SparseToDenseInputsMutableBuilder[Self <: SparseToDenseInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setSparseIndices(value: js.Any): Self = StObject.set(x, "sparseIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSparseIndicesUndefined: Self = StObject.set(x, "sparseIndices", js.undefined)
    
    @scala.inline
    def setSparseValues(value: js.Any): Self = StObject.set(x, "sparseValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSparseValuesUndefined: Self = StObject.set(x, "sparseValues", js.undefined)
  }
}
