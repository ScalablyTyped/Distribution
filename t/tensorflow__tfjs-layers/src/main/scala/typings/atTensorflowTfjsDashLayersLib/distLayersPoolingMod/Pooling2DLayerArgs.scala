package typings
package atTensorflowTfjsDashLayersLib.distLayersPoolingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pooling2DLayerArgs
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.LayerArgs {
  /** The data format to use for the pooling layer. */
  var dataFormat: js.UndefOr[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.DataFormat] = js.undefined
  /** The padding type to use for the pooling layer. */
  var padding: js.UndefOr[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.PaddingMode] = js.undefined
  /**
    * Factors by which to downscale in each dimension [vertical, horizontal].
    * Expects an integer or an array of 2 integers.
    *
    * For example, `[2, 2]` will halve the input in both spatial dimension.
    * If only one integer is specified, the same window length
    * will be used for both dimensions.
    */
  var poolSize: js.UndefOr[scala.Double | (js.Tuple2[scala.Double, scala.Double])] = js.undefined
  /**
    * The size of the stride in each dimension of the pooling window. Expects
    * an integer or an array of 2 integers. Integer, tuple of 2 integers, or
    * None.
    *
    * If `null`, defaults to `poolSize`.
    */
  var strides: js.UndefOr[scala.Double | (js.Tuple2[scala.Double, scala.Double])] = js.undefined
}

object Pooling2DLayerArgs {
  @scala.inline
  def apply(
    batchInputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    batchSize: scala.Int | scala.Double = null,
    dataFormat: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.DataFormat = null,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputDType: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    name: java.lang.String = null,
    padding: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.PaddingMode = null,
    poolSize: scala.Double | (js.Tuple2[scala.Double, scala.Double]) = null,
    strides: scala.Double | (js.Tuple2[scala.Double, scala.Double]) = null,
    trainable: js.UndefOr[scala.Boolean] = js.undefined,
    weights: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ] = null
  ): Pooling2DLayerArgs = {
    val __obj = js.Dynamic.literal()
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (dataFormat != null) __obj.updateDynamic("dataFormat")(dataFormat)
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType)
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape)
    if (name != null) __obj.updateDynamic("name")(name)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (poolSize != null) __obj.updateDynamic("poolSize")(poolSize.asInstanceOf[js.Any])
    if (strides != null) __obj.updateDynamic("strides")(strides.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable)
    if (weights != null) __obj.updateDynamic("weights")(weights)
    __obj.asInstanceOf[Pooling2DLayerArgs]
  }
}

