package typings.atTensorflowTfjsDashLayers.distLayersWrappersMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.BidirectionalMergeMode
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import typings.atTensorflowTfjsDashLayers.distLayersRecurrentMod.RNN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BidirectionalLayerArgs extends WrapperLayerArgs {
  /**
    * The instance of an `RNN` layer to be wrapped.
    */
  @JSName("layer")
  var layer_BidirectionalLayerArgs: RNN
  /**
    * Mode by which outputs of the forward and backward RNNs are
    * combined. If `null` or `undefined`, the output will not be
    * combined, they will be returned as an `Array`.
    *
    * If `undefined` (i.e., not provided), defaults to `'concat'`.
    */
  var mergeMode: js.UndefOr[BidirectionalMergeMode] = js.undefined
}

object BidirectionalLayerArgs {
  @scala.inline
  def apply(
    layer: RNN,
    batchInputShape: Shape = null,
    batchSize: Int | Double = null,
    dtype: DataType = null,
    inputDType: DataType = null,
    inputShape: Shape = null,
    mergeMode: BidirectionalMergeMode = null,
    name: String = null,
    trainable: js.UndefOr[Boolean] = js.undefined,
    weights: js.Array[Tensor[Rank]] = null
  ): BidirectionalLayerArgs = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape.asInstanceOf[js.Any])
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType.asInstanceOf[js.Any])
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape.asInstanceOf[js.Any])
    if (mergeMode != null) __obj.updateDynamic("mergeMode")(mergeMode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.asInstanceOf[js.Any])
    if (weights != null) __obj.updateDynamic("weights")(weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[BidirectionalLayerArgs]
  }
}

