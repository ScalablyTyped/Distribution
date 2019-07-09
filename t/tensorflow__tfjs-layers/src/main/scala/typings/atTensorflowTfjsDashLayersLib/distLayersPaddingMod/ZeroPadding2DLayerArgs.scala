package typings
package atTensorflowTfjsDashLayersLib.distLayersPaddingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeroPadding2DLayerArgs
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.LayerArgs {
  /**
    * One of `'channelsLast'` (default) and `'channelsFirst'`.
    *
    * The ordering of the dimensions in the inputs.
    * `channelsLast` corresponds to inputs with shape
    * `[batch, height, width, channels]` while `channelsFirst`
    * corresponds to inputs with shape
    * `[batch, channels, height, width]`.
    */
  var dataFormat: js.UndefOr[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.DataFormat] = js.undefined
  /**
    * Integer, or `Array` of 2 integers, or `Array` of 2 `Array`s, each of
    * which is an `Array` of 2 integers.
    * - If integer, the same symmetric padding is applied to width and height.
    * - If Array` of 2 integers, interpreted as two different symmetric values
    *   for height and width:
    *   `[symmetricHeightPad, symmetricWidthPad]`.
    * - If `Array` of 2 `Array`s, interpreted as:
    *   `[[topPad, bottomPad], [leftPad, rightPad]]`.
    */
  var padding: js.UndefOr[
    scala.Double | (js.Tuple2[
      scala.Double | (js.Tuple2[scala.Double, scala.Double]), 
      scala.Double | (js.Tuple2[scala.Double, scala.Double])
    ])
  ] = js.undefined
}

object ZeroPadding2DLayerArgs {
  @scala.inline
  def apply(
    batchInputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    batchSize: scala.Int | scala.Double = null,
    dataFormat: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.DataFormat = null,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputDType: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    name: java.lang.String = null,
    padding: scala.Double | (js.Tuple2[
      scala.Double | (js.Tuple2[scala.Double, scala.Double]), 
      scala.Double | (js.Tuple2[scala.Double, scala.Double])
    ]) = null,
    trainable: js.UndefOr[scala.Boolean] = js.undefined,
    weights: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ] = null
  ): ZeroPadding2DLayerArgs = {
    val __obj = js.Dynamic.literal()
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (dataFormat != null) __obj.updateDynamic("dataFormat")(dataFormat)
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType)
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape)
    if (name != null) __obj.updateDynamic("name")(name)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable)
    if (weights != null) __obj.updateDynamic("weights")(weights)
    __obj.asInstanceOf[ZeroPadding2DLayerArgs]
  }
}

