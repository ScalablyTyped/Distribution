package typings.tensorflowTfjsCore.fusedUtilMod

import typings.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FusedConv2DConfig extends js.Object {
  var activation: js.UndefOr[Activation] = js.undefined
  var bias: js.UndefOr[Tensor[Rank]] = js.undefined
  var convInfo: Conv2DInfo
  var filter: Tensor4D
  var input: Tensor4D
  var preluActivationWeights: js.UndefOr[Tensor[Rank]] = js.undefined
}

object FusedConv2DConfig {
  @scala.inline
  def apply(
    convInfo: Conv2DInfo,
    filter: Tensor4D,
    input: Tensor4D,
    activation: Activation = null,
    bias: Tensor[Rank] = null,
    preluActivationWeights: Tensor[Rank] = null
  ): FusedConv2DConfig = {
    val __obj = js.Dynamic.literal(convInfo = convInfo.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
    if (activation != null) __obj.updateDynamic("activation")(activation.asInstanceOf[js.Any])
    if (bias != null) __obj.updateDynamic("bias")(bias.asInstanceOf[js.Any])
    if (preluActivationWeights != null) __obj.updateDynamic("preluActivationWeights")(preluActivationWeights.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusedConv2DConfig]
  }
}

