package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.kernelRegistryMod.NamedTensorInfoMap
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FusedMatMulInputs extends NamedTensorInfoMap {
  
  var a: TensorInfo = js.native
  
  var b: TensorInfo = js.native
  
  var bias: js.UndefOr[TensorInfo] = js.native
  
  var preluActivationWeights: js.UndefOr[TensorInfo] = js.native
}
object FusedMatMulInputs {
  
  @scala.inline
  def apply(a: TensorInfo, b: TensorInfo): FusedMatMulInputs = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusedMatMulInputs]
  }
  
  @scala.inline
  implicit class FusedMatMulInputsOps[Self <: FusedMatMulInputs] (val x: Self) extends AnyVal {
    
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
    def setA(value: TensorInfo): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: TensorInfo): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBias(value: TensorInfo): Self = this.set("bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBias: Self = this.set("bias", js.undefined)
    
    @scala.inline
    def setPreluActivationWeights(value: TensorInfo): Self = this.set("preluActivationWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreluActivationWeights: Self = this.set("preluActivationWeights", js.undefined)
  }
}
