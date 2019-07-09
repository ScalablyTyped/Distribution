package typings
package atTensorflowTfjsDashLayersLib.distLayersConvolutionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cropping2DLayerArgs
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.LayerArgs {
  /**
    * Dimension of the cropping along the width and the height.
    * - If integer: the same symmetric cropping
    *  is applied to width and height.
    * - If list of 2 integers:
    *   interpreted as two different
    *   symmetric cropping values for height and width:
    *   `[symmetric_height_crop, symmetric_width_crop]`.
    * - If a list of 2 list of 2 integers:
    *   interpreted as
    *   `[[top_crop, bottom_crop], [left_crop, right_crop]]`
    */
  var cropping: scala.Double | (js.Tuple2[
    scala.Double | (js.Tuple2[scala.Double, scala.Double]), 
    scala.Double | (js.Tuple2[scala.Double, scala.Double])
  ])
  /**
    * Format of the data, which determines the ordering of the dimensions in
    * the inputs.
    *
    * `channels_last` corresponds to inputs with shape
    *   `(batch, ..., channels)`
    *
    *  `channels_first` corresponds to inputs with shape `(batch, channels,
    * ...)`.
    *
    * Defaults to `channels_last`.
    */
  var dataFormat: js.UndefOr[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.DataFormat] = js.undefined
}

object Cropping2DLayerArgs {
  @scala.inline
  def apply(
    cropping: scala.Double | (js.Tuple2[
      scala.Double | (js.Tuple2[scala.Double, scala.Double]), 
      scala.Double | (js.Tuple2[scala.Double, scala.Double])
    ]),
    batchInputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    batchSize: scala.Int | scala.Double = null,
    dataFormat: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.DataFormat = null,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputDType: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    name: java.lang.String = null,
    trainable: js.UndefOr[scala.Boolean] = js.undefined,
    weights: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ] = null
  ): Cropping2DLayerArgs = {
    val __obj = js.Dynamic.literal(cropping = cropping.asInstanceOf[js.Any])
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (dataFormat != null) __obj.updateDynamic("dataFormat")(dataFormat)
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType)
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable)
    if (weights != null) __obj.updateDynamic("weights")(weights)
    __obj.asInstanceOf[Cropping2DLayerArgs]
  }
}

