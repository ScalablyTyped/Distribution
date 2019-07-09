package typings
package atTensorflowTfjsDashLayersLib.distLayersNoiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlphaDropoutArgs
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.LayerArgs {
  /**
    * A 1-D `Tensor` of type `int32`, representing the
    * shape for randomly generated keep/drop flags.
    */
  var noiseShape: js.UndefOr[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape] = js.undefined
  /** drop probability.  */
  var rate: scala.Double
}

object AlphaDropoutArgs {
  @scala.inline
  def apply(
    rate: scala.Double,
    batchInputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    batchSize: scala.Int | scala.Double = null,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputDType: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    name: java.lang.String = null,
    noiseShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    trainable: js.UndefOr[scala.Boolean] = js.undefined,
    weights: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ] = null
  ): AlphaDropoutArgs = {
    val __obj = js.Dynamic.literal(rate = rate)
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType)
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape)
    if (name != null) __obj.updateDynamic("name")(name)
    if (noiseShape != null) __obj.updateDynamic("noiseShape")(noiseShape)
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable)
    if (weights != null) __obj.updateDynamic("weights")(weights)
    __obj.asInstanceOf[AlphaDropoutArgs]
  }
}

