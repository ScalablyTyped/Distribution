package typings.tensorflowTfjsLayers.wrappersSerializationMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.BidirectionalMergeMode
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.recurrentSerializationMod.RecurrentLayerSerialization
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BidirectionalLayerConfig extends LayerConfig {
  var layer: RecurrentLayerSerialization
  var merge_mode: js.UndefOr[BidirectionalMergeMode] = js.undefined
}

object BidirectionalLayerConfig {
  @scala.inline
  def apply(
    layer: RecurrentLayerSerialization,
    batch_input_shape: Shape = null,
    batch_size: Int | Double = null,
    dtype: DataType = null,
    input_dtype: DataType = null,
    input_shape: Shape = null,
    merge_mode: BidirectionalMergeMode = null,
    name: String = null,
    trainable: js.UndefOr[Boolean] = js.undefined
  ): BidirectionalLayerConfig = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    if (batch_input_shape != null) __obj.updateDynamic("batch_input_shape")(batch_input_shape.asInstanceOf[js.Any])
    if (batch_size != null) __obj.updateDynamic("batch_size")(batch_size.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (input_dtype != null) __obj.updateDynamic("input_dtype")(input_dtype.asInstanceOf[js.Any])
    if (input_shape != null) __obj.updateDynamic("input_shape")(input_shape.asInstanceOf[js.Any])
    if (merge_mode != null) __obj.updateDynamic("merge_mode")(merge_mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.asInstanceOf[js.Any])
    __obj.asInstanceOf[BidirectionalLayerConfig]
  }
}

