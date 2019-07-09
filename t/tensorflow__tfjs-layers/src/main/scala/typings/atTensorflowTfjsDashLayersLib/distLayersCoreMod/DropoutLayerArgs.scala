package typings
package atTensorflowTfjsDashLayersLib.distLayersCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropoutLayerArgs
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.LayerArgs {
  /**
    * Integer array representing the shape of the binary dropout mask that will
    * be multiplied with the input.
    *
    * For instance, if your inputs have shape `(batchSize, timesteps, features)`
    * and you want the dropout mask to be the same for all timesteps, you can use
    * `noise_shape=(batch_size, 1, features)`.
    */
  var noiseShape: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** Float between 0 and 1. Fraction of the input units to drop. */
  var rate: scala.Double
  /** An integer to use as random seed. */
  var seed: js.UndefOr[scala.Double] = js.undefined
}

object DropoutLayerArgs {
  @scala.inline
  def apply(
    rate: scala.Double,
    batchInputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    batchSize: scala.Int | scala.Double = null,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputDType: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    name: java.lang.String = null,
    noiseShape: js.Array[scala.Double] = null,
    seed: scala.Int | scala.Double = null,
    trainable: js.UndefOr[scala.Boolean] = js.undefined,
    weights: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ] = null
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

