package typings.tensorflowTfjsLayers.advancedActivationSerializationMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typings.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PReLULayerConfig extends LayerConfig {
  var alpha_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
  var alpha_initializer: js.UndefOr[InitializerSerialization] = js.undefined
  var alpha_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
  var shared_axes: js.UndefOr[Double | js.Array[Double]] = js.undefined
}

object PReLULayerConfig {
  @scala.inline
  def apply(
    alpha_constraint: ConstraintSerialization = null,
    alpha_initializer: InitializerSerialization = null,
    alpha_regularizer: RegularizerSerialization = null,
    batch_input_shape: Shape = null,
    batch_size: Int | Double = null,
    dtype: DataType = null,
    input_dtype: DataType = null,
    input_shape: Shape = null,
    name: String = null,
    shared_axes: Double | js.Array[Double] = null,
    trainable: js.UndefOr[Boolean] = js.undefined
  ): PReLULayerConfig = {
    val __obj = js.Dynamic.literal()
    if (alpha_constraint != null) __obj.updateDynamic("alpha_constraint")(alpha_constraint.asInstanceOf[js.Any])
    if (alpha_initializer != null) __obj.updateDynamic("alpha_initializer")(alpha_initializer.asInstanceOf[js.Any])
    if (alpha_regularizer != null) __obj.updateDynamic("alpha_regularizer")(alpha_regularizer.asInstanceOf[js.Any])
    if (batch_input_shape != null) __obj.updateDynamic("batch_input_shape")(batch_input_shape.asInstanceOf[js.Any])
    if (batch_size != null) __obj.updateDynamic("batch_size")(batch_size.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (input_dtype != null) __obj.updateDynamic("input_dtype")(input_dtype.asInstanceOf[js.Any])
    if (input_shape != null) __obj.updateDynamic("input_shape")(input_shape.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (shared_axes != null) __obj.updateDynamic("shared_axes")(shared_axes.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PReLULayerConfig]
  }
}

