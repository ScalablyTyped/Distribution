package typings.atTensorflowTfjsDashLayers.distLayersCoreMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.LayerArgs
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropoutLayerArgs extends LayerArgs {
  /**
    * Integer array representing the shape of the binary dropout mask that will
    * be multiplied with the input.
    *
    * For instance, if your inputs have shape `(batchSize, timesteps, features)`
    * and you want the dropout mask to be the same for all timesteps, you can use
    * `noise_shape=(batch_size, 1, features)`.
    */
  var noiseShape: js.UndefOr[js.Array[Double]] = js.undefined
  /** Float between 0 and 1. Fraction of the input units to drop. */
  var rate: Double
  /** An integer to use as random seed. */
  var seed: js.UndefOr[Double] = js.undefined
}

object DropoutLayerArgs {
  @scala.inline
  def apply(
    rate: Double,
    batchInputShape: Shape = null,
    batchSize: Int | Double = null,
    dtype: DataType = null,
    inputDType: DataType = null,
    inputShape: Shape = null,
    name: String = null,
    noiseShape: js.Array[Double] = null,
    seed: Int | Double = null,
    trainable: js.UndefOr[Boolean] = js.undefined,
    weights: js.Array[Tensor[Rank]] = null
  ): DropoutLayerArgs = {
    val __obj = js.Dynamic.literal(rate = rate)
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType)
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape)
    if (name != null) __obj.updateDynamic("name")(name)
    if (noiseShape != null) __obj.updateDynamic("noiseShape")(noiseShape)
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable)
    if (weights != null) __obj.updateDynamic("weights")(weights)
    __obj.asInstanceOf[DropoutLayerArgs]
  }
}

