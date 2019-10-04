package typings.atTensorflowTfjsDashCore.distOpsFusedUnderscoreUtilMod

import typings.atTensorflowTfjsDashCore.distOpsConvUnderscoreUtilMod.Conv2DInfo
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
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
    val __obj = js.Dynamic.literal(convInfo = convInfo, filter = filter, input = input)
    if (activation != null) __obj.updateDynamic("activation")(activation)
    if (bias != null) __obj.updateDynamic("bias")(bias)
    if (preluActivationWeights != null) __obj.updateDynamic("preluActivationWeights")(preluActivationWeights)
    __obj.asInstanceOf[FusedConv2DConfig]
  }
}

