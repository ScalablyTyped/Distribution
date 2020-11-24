package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'indices' | 'updates'> */
@js.native
trait ScatterNdInputs extends js.Object {
  
  var indices: js.UndefOr[js.Any] = js.native
  
  var updates: js.UndefOr[js.Any] = js.native
}
object ScatterNdInputs {
  
  @scala.inline
  def apply(): ScatterNdInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScatterNdInputs]
  }
  
  @scala.inline
  implicit class ScatterNdInputsOps[Self <: ScatterNdInputs] (val x: Self) extends AnyVal {
    
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
    def setIndices(value: js.Any): Self = this.set("indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndices: Self = this.set("indices", js.undefined)
    
    @scala.inline
    def setUpdates(value: js.Any): Self = this.set("updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdates: Self = this.set("updates", js.undefined)
  }
}
