package typings.tensorflowTfjsLayers.advancedActivationSerializationMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReLULayerConfig extends LayerConfig {
  var max_value: js.UndefOr[Double] = js.undefined
}

object ReLULayerConfig {
  @scala.inline
  def apply(
    batch_input_shape: Shape = null,
    batch_size: js.UndefOr[Double] = js.undefined,
    dtype: DataType = null,
    input_dtype: DataType = null,
    input_shape: Shape = null,
    max_value: js.UndefOr[Double] = js.undefined,
    name: String = null,
    trainable: js.UndefOr[Boolean] = js.undefined
  ): ReLULayerConfig = {
    val __obj = js.Dynamic.literal()
    if (batch_input_shape != null) __obj.updateDynamic("batch_input_shape")(batch_input_shape.asInstanceOf[js.Any])
    if (!js.isUndefined(batch_size)) __obj.updateDynamic("batch_size")(batch_size.get.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (input_dtype != null) __obj.updateDynamic("input_dtype")(input_dtype.asInstanceOf[js.Any])
    if (input_shape != null) __obj.updateDynamic("input_shape")(input_shape.asInstanceOf[js.Any])
    if (!js.isUndefined(max_value)) __obj.updateDynamic("max_value")(max_value.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReLULayerConfig]
  }
}

