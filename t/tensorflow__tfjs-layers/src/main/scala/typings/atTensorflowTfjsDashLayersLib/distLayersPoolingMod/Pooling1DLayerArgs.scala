package typings
package atTensorflowTfjsDashLayersLib.distLayersPoolingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pooling1DLayerArgs
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.LayerArgs {
  /** How to fill in data that's not an integer multiple of poolSize. */
  var padding: js.UndefOr[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.PaddingMode] = js.undefined
  /**
    * Size of the window to pool over, should be an integer.
    */
  var poolSize: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  /**
    * Period at which to sample the pooled values.
    *
    * If `null`, defaults to `poolSize`.
    */
  var strides: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
}

object Pooling1DLayerArgs {
  @scala.inline
  def apply(
    batchInputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    batchSize: scala.Int | scala.Double = null,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputDType: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    name: java.lang.String = null,
    padding: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.PaddingMode = null,
    poolSize: scala.Double | js.Array[scala.Double] = null,
    strides: scala.Double | js.Array[scala.Double] = null,
    trainable: js.UndefOr[scala.Boolean] = js.undefined,
    weights: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ] = null
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

