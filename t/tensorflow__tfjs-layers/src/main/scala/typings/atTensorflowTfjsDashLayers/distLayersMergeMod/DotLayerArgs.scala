package typings.atTensorflowTfjsDashLayers.distLayersMergeMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.LayerArgs
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotLayerArgs extends LayerArgs {
  /**
    * Axis or axes along which the dot product will be taken.
    *
    * Integer or an Array of integers.
    */
  var axes: Double | (js.Tuple2[Double, Double])
  /**
    * Whether to L2-normalize samples along the dot product axis
    * before taking the dot product.
    *
    * If set to `true`, the output of the dot product isthe cosine
    * proximity between the two samples.
    */
  var normalize: js.UndefOr[Boolean] = js.undefined
}

object DotLayerArgs {
  @scala.inline
  def apply(
    axes: Double | (js.Tuple2[Double, Double]),
    batchInputShape: Shape = null,
    batchSize: Int | Double = null,
    dtype: DataType = null,
    inputDType: DataType = null,
    inputShape: Shape = null,
    name: String = null,
    normalize: js.UndefOr[Boolean] = js.undefined,
    trainable: js.UndefOr[Boolean] = js.undefined,
    weights: js.Array[Tensor[Rank]] = null
  ): DotLayerArgs = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any])
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType)
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize)
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable)
    if (weights != null) __obj.updateDynamic("weights")(weights)
    __obj.asInstanceOf[DotLayerArgs]
  }
}

