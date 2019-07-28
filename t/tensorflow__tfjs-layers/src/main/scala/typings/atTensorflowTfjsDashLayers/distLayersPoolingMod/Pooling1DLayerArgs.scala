package typings.atTensorflowTfjsDashLayers.distLayersPoolingMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.LayerArgs
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.PaddingMode
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pooling1DLayerArgs extends LayerArgs {
  /** How to fill in data that's not an integer multiple of poolSize. */
  var padding: js.UndefOr[PaddingMode] = js.undefined
  /**
    * Size of the window to pool over, should be an integer.
    */
  var poolSize: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /**
    * Period at which to sample the pooled values.
    *
    * If `null`, defaults to `poolSize`.
    */
  var strides: js.UndefOr[Double | js.Array[Double]] = js.undefined
}

object Pooling1DLayerArgs {
  @scala.inline
  def apply(
    batchInputShape: Shape = null,
    batchSize: Int | Double = null,
    dtype: DataType = null,
    inputDType: DataType = null,
    inputShape: Shape = null,
    name: String = null,
    padding: PaddingMode = null,
    poolSize: Double | js.Array[Double] = null,
    strides: Double | js.Array[Double] = null,
    trainable: js.UndefOr[Boolean] = js.undefined,
    weights: js.Array[Tensor[Rank]] = null
  ): Pooling1DLayerArgs = {
    val __obj = js.Dynamic.literal()
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType)
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape)
    if (name != null) __obj.updateDynamic("name")(name)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (poolSize != null) __obj.updateDynamic("poolSize")(poolSize.asInstanceOf[js.Any])
    if (strides != null) __obj.updateDynamic("strides")(strides.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable)
    if (weights != null) __obj.updateDynamic("weights")(weights)
    __obj.asInstanceOf[Pooling1DLayerArgs]
  }
}

