package typings.tensorflowTfjsLayers.topologyConfigMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.typesMod.PyJsonDict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerConfig extends PyJsonDict {
  var batch_input_shape: js.UndefOr[Shape] = js.undefined
  var batch_size: js.UndefOr[Double] = js.undefined
  var dtype: js.UndefOr[DataType] = js.undefined
  var input_dtype: js.UndefOr[DataType] = js.undefined
  var input_shape: js.UndefOr[Shape] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var trainable: js.UndefOr[Boolean] = js.undefined
}

object LayerConfig {
  @scala.inline
  def apply(
    batch_input_shape: Shape = null,
    batch_size: js.UndefOr[Double] = js.undefined,
    dtype: DataType = null,
    input_dtype: DataType = null,
    input_shape: Shape = null,
    name: String = null,
    trainable: js.UndefOr[Boolean] = js.undefined
  ): LayerConfig = {
    val __obj = js.Dynamic.literal()
    if (batch_input_shape != null) __obj.updateDynamic("batch_input_shape")(batch_input_shape.asInstanceOf[js.Any])
    if (!js.isUndefined(batch_size)) __obj.updateDynamic("batch_size")(batch_size.get.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (input_dtype != null) __obj.updateDynamic("input_dtype")(input_dtype.asInstanceOf[js.Any])
    if (input_shape != null) __obj.updateDynamic("input_shape")(input_shape.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerConfig]
  }
}

