package typings.atTensorflowTfjsDashLayers.distLayersConvolutionalMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.LayerArgs
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.DataFormat
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpSampling2DLayerArgs extends LayerArgs {
  /**
    * Format of the data, which determines the ordering of the dimensions in
    * the inputs.
    *
    * `"channelsLast"` corresponds to inputs with shape
    *   `[batch, ..., channels]`
    *
    *  `"channelsFirst"` corresponds to inputs with shape `[batch, channels,
    * ...]`.
    *
    * Defaults to `"channelsLast"`.
    */
  var dataFormat: js.UndefOr[DataFormat] = js.undefined
  /**
    * The upsampling factors for rows and columns.
    *
    * Defaults to `[2, 2]`.
    */
  var size: js.UndefOr[js.Array[Double]] = js.undefined
}

object UpSampling2DLayerArgs {
  @scala.inline
  def apply(
    batchInputShape: Shape = null,
    batchSize: Int | Double = null,
    dataFormat: DataFormat = null,
    dtype: DataType = null,
    inputDType: DataType = null,
    inputShape: Shape = null,
    name: String = null,
    size: js.Array[Double] = null,
    trainable: js.UndefOr[Boolean] = js.undefined,
    weights: js.Array[Tensor[Rank]] = null
  ): UpSampling2DLayerArgs = {
    val __obj = js.Dynamic.literal()
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (dataFormat != null) __obj.updateDynamic("dataFormat")(dataFormat)
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType)
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape)
    if (name != null) __obj.updateDynamic("name")(name)
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable)
    if (weights != null) __obj.updateDynamic("weights")(weights)
    __obj.asInstanceOf[UpSampling2DLayerArgs]
  }
}

