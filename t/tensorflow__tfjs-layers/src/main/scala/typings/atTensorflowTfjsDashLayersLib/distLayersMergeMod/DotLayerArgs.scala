package typings
package atTensorflowTfjsDashLayersLib.distLayersMergeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotLayerArgs
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.LayerArgs {
  /**
    * Axis or axes along which the dot product will be taken.
    *
    * Integer or an Array of integers.
    */
  var axes: scala.Double | (js.Tuple2[scala.Double, scala.Double])
  /**
    * Whether to L2-normalize samples along the dot product axis
    * before taking the dot product.
    *
    * If set to `true`, the output of the dot product isthe cosine
    * proximity between the two samples.
    */
  var normalize: js.UndefOr[scala.Boolean] = js.undefined
}

object DotLayerArgs {
  @scala.inline
  def apply(
    axes: scala.Double | (js.Tuple2[scala.Double, scala.Double]),
    batchInputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    batchSize: scala.Int | scala.Double = null,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputDType: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    name: java.lang.String = null,
    normalize: js.UndefOr[scala.Boolean] = js.undefined,
    trainable: js.UndefOr[scala.Boolean] = js.undefined,
    weights: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ] = null
  ): DotLayerArgs = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any])
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType)
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize)
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable)
    if (weights != null) __obj.updateDynamic("weights")(weights)
    __obj.asInstanceOf[DotLayerArgs]
  }
}

