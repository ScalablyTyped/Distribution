package typings.tensorflowTfjsCore.fusedUtilMod

import typings.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FusedConv2DConfig extends js.Object {
  var activation: js.UndefOr[Activation] = js.native
  var bias: js.UndefOr[Tensor[Rank]] = js.native
  var convInfo: Conv2DInfo = js.native
  var filter: Tensor4D = js.native
  var input: Tensor4D = js.native
  var preluActivationWeights: js.UndefOr[Tensor[Rank]] = js.native
}

object FusedConv2DConfig {
  @scala.inline
  def apply(convInfo: Conv2DInfo, filter: Tensor4D, input: Tensor4D): FusedConv2DConfig = {
    val __obj = js.Dynamic.literal(convInfo = convInfo.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusedConv2DConfig]
  }
  @scala.inline
  implicit class FusedConv2DConfigOps[Self <: FusedConv2DConfig] (val x: Self) extends AnyVal {
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
    def setConvInfo(value: Conv2DInfo): Self = this.set("convInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: Tensor4D): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: Tensor4D): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivation(value: Activation): Self = this.set("activation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivation: Self = this.set("activation", js.undefined)
    @scala.inline
    def setBias(value: Tensor[Rank]): Self = this.set("bias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBias: Self = this.set("bias", js.undefined)
    @scala.inline
    def setPreluActivationWeights(value: Tensor[Rank]): Self = this.set("preluActivationWeights", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreluActivationWeights: Self = this.set("preluActivationWeights", js.undefined)
  }
  
}

