package typings
package atTensorflowTfjsDashLayersLib.distLayersRecurrentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNNLayerArgs extends BaseRNNLayerArgs {
  @JSName("cell")
  var cell_RNNLayerArgs: RNNCell | js.Array[RNNCell]
}

object RNNLayerArgs {
  @scala.inline
  def apply(
    cell: RNNCell | js.Array[RNNCell],
    batchInputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    batchSize: scala.Int | scala.Double = null,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    goBackwards: js.UndefOr[scala.Boolean] = js.undefined,
    inputDType: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputDim: scala.Int | scala.Double = null,
    inputLength: scala.Int | scala.Double = null,
    inputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    name: java.lang.String = null,
    returnSequences: js.UndefOr[scala.Boolean] = js.undefined,
    returnState: js.UndefOr[scala.Boolean] = js.undefined,
    stateful: js.UndefOr[scala.Boolean] = js.undefined,
    trainable: js.UndefOr[scala.Boolean] = js.undefined,
    unroll: js.UndefOr[scala.Boolean] = js.undefined,
    weights: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ] = null
  ): RNNLayerArgs = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any])
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (!js.isUndefined(goBackwards)) __obj.updateDynamic("goBackwards")(goBackwards)
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType)
    if (inputDim != null) __obj.updateDynamic("inputDim")(inputDim.asInstanceOf[js.Any])
    if (inputLength != null) __obj.updateDynamic("inputLength")(inputLength.asInstanceOf[js.Any])
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(returnSequences)) __obj.updateDynamic("returnSequences")(returnSequences)
    if (!js.isUndefined(returnState)) __obj.updateDynamic("returnState")(returnState)
    if (!js.isUndefined(stateful)) __obj.updateDynamic("stateful")(stateful)
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable)
    if (!js.isUndefined(unroll)) __obj.updateDynamic("unroll")(unroll)
    if (weights != null) __obj.updateDynamic("weights")(weights)
    __obj.asInstanceOf[RNNLayerArgs]
  }
}

