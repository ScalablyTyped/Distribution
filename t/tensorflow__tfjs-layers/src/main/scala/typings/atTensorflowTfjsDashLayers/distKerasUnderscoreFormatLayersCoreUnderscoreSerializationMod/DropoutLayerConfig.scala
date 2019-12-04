package typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatLayersCoreUnderscoreSerializationMod

import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTopologyUnderscoreConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropoutLayerConfig extends LayerConfig {
  var noise_shape: js.UndefOr[js.Array[Double]] = js.undefined
  var rate: Double
  var seed: js.UndefOr[Double] = js.undefined
}

object DropoutLayerConfig {
  @scala.inline
  def apply(
    rate: Double,
    batch_input_shape: Shape = null,
    batch_size: Int | Double = null,
    dtype: DataType = null,
    input_dtype: DataType = null,
    input_shape: Shape = null,
    name: String = null,
    noise_shape: js.Array[Double] = null,
    seed: Int | Double = null,
    trainable: js.UndefOr[Boolean] = js.undefined
  ): DropoutLayerConfig = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    if (batch_input_shape != null) __obj.updateDynamic("batch_input_shape")(batch_input_shape.asInstanceOf[js.Any])
    if (batch_size != null) __obj.updateDynamic("batch_size")(batch_size.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (input_dtype != null) __obj.updateDynamic("input_dtype")(input_dtype.asInstanceOf[js.Any])
    if (input_shape != null) __obj.updateDynamic("input_shape")(input_shape.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (noise_shape != null) __obj.updateDynamic("noise_shape")(noise_shape.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropoutLayerConfig]
  }
}

