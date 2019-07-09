package typings
package atTensorflowTfjsDashLayersLib.distLayersWrappersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapperLayerArgs
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.LayerArgs {
  /**
    * The layer to be wrapped.
    */
  var layer: atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer
}

object WrapperLayerArgs {
  @scala.inline
  def apply(
    layer: atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer,
    batchInputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    batchSize: scala.Int | scala.Double = null,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputDType: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    name: java.lang.String = null,
    trainable: js.UndefOr[scala.Boolean] = js.undefined,
    weights: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ] = null
  ): WrapperLayerArgs = {
    val __obj = js.Dynamic.literal(layer = layer)
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType)
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable)
    if (weights != null) __obj.updateDynamic("weights")(weights)
    __obj.asInstanceOf[WrapperLayerArgs]
  }
}

