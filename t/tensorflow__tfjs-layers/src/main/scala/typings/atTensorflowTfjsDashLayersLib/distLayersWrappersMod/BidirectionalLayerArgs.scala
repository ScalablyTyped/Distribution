package typings
package atTensorflowTfjsDashLayersLib.distLayersWrappersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BidirectionalLayerArgs extends WrapperLayerArgs {
  /**
    * The instance of an `RNN` layer to be wrapped.
    */
  @JSName("layer")
  var layer_BidirectionalLayerArgs: atTensorflowTfjsDashLayersLib.distLayersRecurrentMod.RNN
  /**
    * Mode by which outputs of the forward and backward RNNs are
    * combined. If `null` or `undefined`, the output will not be
    * combined, they will be returned as an `Array`.
    *
    * If `undefined` (i.e., not provided), defaults to `'concat'`.
    */
  var mergeMode: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.BidirectionalMergeMode
  ] = js.undefined
}

object BidirectionalLayerArgs {
  @scala.inline
  def apply(
    layer: atTensorflowTfjsDashLayersLib.distLayersRecurrentMod.RNN,
    batchInputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    batchSize: scala.Int | scala.Double = null,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputDType: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    mergeMode: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.BidirectionalMergeMode = null,
    name: java.lang.String = null,
    trainable: js.UndefOr[scala.Boolean] = js.undefined,
    weights: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ] = null
  ): BidirectionalLayerArgs = {
    val __obj = js.Dynamic.literal(layer = layer)
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType)
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape)
    if (mergeMode != null) __obj.updateDynamic("mergeMode")(mergeMode)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable)
    if (weights != null) __obj.updateDynamic("weights")(weights)
    __obj.asInstanceOf[BidirectionalLayerArgs]
  }
}

