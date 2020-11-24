package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.kernelRegistryMod.NamedTensorInfoMap
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FusedDepthwiseConv2DInputs extends NamedTensorInfoMap {
  
  var bias: js.UndefOr[TensorInfo] = js.native
  
  var filter: TensorInfo = js.native
  
  var preluActivationWeights: js.UndefOr[TensorInfo] = js.native
  
  var x: TensorInfo = js.native
}
object FusedDepthwiseConv2DInputs {
  
  @scala.inline
  def apply(filter: TensorInfo, x: TensorInfo): FusedDepthwiseConv2DInputs = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusedDepthwiseConv2DInputs]
  }
  
  @scala.inline
  implicit class FusedDepthwiseConv2DInputsOps[Self <: FusedDepthwiseConv2DInputs] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: TensorInfo): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: TensorInfo): Self = this.set("x", value.asInstanceOf[js.Any])
    
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
