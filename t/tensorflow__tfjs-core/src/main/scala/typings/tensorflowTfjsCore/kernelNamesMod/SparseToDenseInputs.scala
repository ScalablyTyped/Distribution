package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'sparseIndices' | 'sparseValues' | 'defaultValue'> */
@js.native
trait SparseToDenseInputs extends js.Object {
  
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
  implicit class SparseToDenseInputsOps[Self <: SparseToDenseInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setSparseIndices(value: js.Any): Self = this.set("sparseIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSparseIndices: Self = this.set("sparseIndices", js.undefined)
    
    @scala.inline
    def setSparseValues(value: js.Any): Self = this.set("sparseValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSparseValues: Self = this.set("sparseValues", js.undefined)
  }
}
