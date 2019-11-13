package typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTopologyUnderscoreConfigMod

import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.PyJsonDict
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
    batch_size: Int | Double = null,
    dtype: DataType = null,
    input_dtype: DataType = null,
    input_shape: Shape = null,
    name: String = null,
    trainable: js.UndefOr[Boolean] = js.undefined
  ): LayerConfig = {
    val __obj = js.Dynamic.literal()
    if (batch_input_shape != null) __obj.updateDynamic("batch_input_shape")(batch_input_shape)
    if (batch_size != null) __obj.updateDynamic("batch_size")(batch_size.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (input_dtype != null) __obj.updateDynamic("input_dtype")(input_dtype)
    if (input_shape != null) __obj.updateDynamic("input_shape")(input_shape)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable)
    __obj.asInstanceOf[LayerConfig]
  }
}

