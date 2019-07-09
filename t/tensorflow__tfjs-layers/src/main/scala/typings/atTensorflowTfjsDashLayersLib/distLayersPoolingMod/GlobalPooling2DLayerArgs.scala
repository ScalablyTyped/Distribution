package typings
package atTensorflowTfjsDashLayersLib.distLayersPoolingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalPooling2DLayerArgs
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.LayerArgs {
  /**
    * One of `CHANNEL_LAST` (default) or `CHANNEL_FIRST`.
    *
    * The ordering of the dimensions in the inputs. `CHANNEL_LAST` corresponds
    * to inputs with shape `[batch, height, width, channels[` while
    * `CHANNEL_FIRST` corresponds to inputs with shape
    * `[batch, channels, height, width]`.
    */
  var dataFormat: js.UndefOr[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.DataFormat] = js.undefined
}

object GlobalPooling2DLayerArgs {
  @scala.inline
  def apply(
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
  ): GlobalPooling2DLayerArgs = {
    val __obj = js.Dynamic.literal()
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (dataFormat != null) __obj.updateDynamic("dataFormat")(dataFormat)
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType)
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable)
    if (weights != null) __obj.updateDynamic("weights")(weights)
    __obj.asInstanceOf[GlobalPooling2DLayerArgs]
  }
}

