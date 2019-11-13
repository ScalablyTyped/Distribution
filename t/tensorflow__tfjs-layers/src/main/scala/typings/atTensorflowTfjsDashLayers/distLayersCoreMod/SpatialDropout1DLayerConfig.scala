package typings.atTensorflowTfjsDashLayers.distLayersCoreMod

import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTopologyUnderscoreConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialDropout1DLayerConfig extends LayerConfig {
  /** Float between 0 and 1. Fraction of the input units to drop. */
  var rate: Double
  /** An integer to use as random seed. */
  var seed: js.UndefOr[Double] = js.undefined
}

object SpatialDropout1DLayerConfig {
  @scala.inline
  def apply(
    rate: Double,
    batch_input_shape: Shape = null,
    batch_size: Int | Double = null,
    dtype: DataType = null,
    input_dtype: DataType = null,
    input_shape: Shape = null,
    name: String = null,
    seed: Int | Double = null,
    trainable: js.UndefOr[Boolean] = js.undefined
  ): SpatialDropout1DLayerConfig = {
    val __obj = js.Dynamic.literal(rate = rate)
    if (batch_input_shape != null) __obj.updateDynamic("batch_input_shape")(batch_input_shape)
    if (batch_size != null) __obj.updateDynamic("batch_size")(batch_size.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (input_dtype != null) __obj.updateDynamic("input_dtype")(input_dtype)
    if (input_shape != null) __obj.updateDynamic("input_shape")(input_shape)
    if (name != null) __obj.updateDynamic("name")(name)
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable)
    __obj.asInstanceOf[SpatialDropout1DLayerConfig]
  }
}

