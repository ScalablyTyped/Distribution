package typings.tensorflowTfjsLayers.inputConfigMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputLayerConfig extends js.Object {
  var batch_input_shape: js.UndefOr[Shape] = js.undefined
  var batch_size: js.UndefOr[Double] = js.undefined
  var dtype: js.UndefOr[DataType] = js.undefined
  var input_shape: js.UndefOr[Shape] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var sparse: js.UndefOr[Boolean] = js.undefined
}

object InputLayerConfig {
  @scala.inline
  def apply(
    batch_input_shape: Shape = null,
    batch_size: Int | Double = null,
    dtype: DataType = null,
    input_shape: Shape = null,
    name: String = null,
    sparse: js.UndefOr[Boolean] = js.undefined
  ): InputLayerConfig = {
    val __obj = js.Dynamic.literal()
    if (batch_input_shape != null) __obj.updateDynamic("batch_input_shape")(batch_input_shape.asInstanceOf[js.Any])
    if (batch_size != null) __obj.updateDynamic("batch_size")(batch_size.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (input_shape != null) __obj.updateDynamic("input_shape")(input_shape.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(sparse)) __obj.updateDynamic("sparse")(sparse.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputLayerConfig]
  }
}

