package typings.tensorflowTfjsLayers.coreSerializationMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsLayers.activationConfigMod.ActivationSerialization
import typings.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typings.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DenseLayerConfig extends LayerConfig {
  var activation: js.UndefOr[ActivationSerialization] = js.undefined
  var activity_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
  var bias_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
  var bias_initializer: js.UndefOr[InitializerSerialization] = js.undefined
  var bias_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
  var input_dim: js.UndefOr[Double] = js.undefined
  var kernel_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
  var kernel_initializer: js.UndefOr[InitializerSerialization] = js.undefined
  var kernel_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
  var units: Double
  var use_bias: js.UndefOr[Boolean] = js.undefined
}

object DenseLayerConfig {
  @scala.inline
  def apply(
    units: Double,
    activation: ActivationSerialization = null,
    activity_regularizer: RegularizerSerialization = null,
    batch_input_shape: Shape = null,
    batch_size: js.UndefOr[Double] = js.undefined,
    bias_constraint: ConstraintSerialization = null,
    bias_initializer: InitializerSerialization = null,
    bias_regularizer: RegularizerSerialization = null,
    dtype: DataType = null,
    input_dim: js.UndefOr[Double] = js.undefined,
    input_dtype: DataType = null,
    input_shape: Shape = null,
    kernel_constraint: ConstraintSerialization = null,
    kernel_initializer: InitializerSerialization = null,
    kernel_regularizer: RegularizerSerialization = null,
    name: String = null,
    trainable: js.UndefOr[Boolean] = js.undefined,
    use_bias: js.UndefOr[Boolean] = js.undefined
  ): DenseLayerConfig = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    if (activation != null) __obj.updateDynamic("activation")(activation.asInstanceOf[js.Any])
    if (activity_regularizer != null) __obj.updateDynamic("activity_regularizer")(activity_regularizer.asInstanceOf[js.Any])
    if (batch_input_shape != null) __obj.updateDynamic("batch_input_shape")(batch_input_shape.asInstanceOf[js.Any])
    if (!js.isUndefined(batch_size)) __obj.updateDynamic("batch_size")(batch_size.get.asInstanceOf[js.Any])
    if (bias_constraint != null) __obj.updateDynamic("bias_constraint")(bias_constraint.asInstanceOf[js.Any])
    if (bias_initializer != null) __obj.updateDynamic("bias_initializer")(bias_initializer.asInstanceOf[js.Any])
    if (bias_regularizer != null) __obj.updateDynamic("bias_regularizer")(bias_regularizer.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (!js.isUndefined(input_dim)) __obj.updateDynamic("input_dim")(input_dim.get.asInstanceOf[js.Any])
    if (input_dtype != null) __obj.updateDynamic("input_dtype")(input_dtype.asInstanceOf[js.Any])
    if (input_shape != null) __obj.updateDynamic("input_shape")(input_shape.asInstanceOf[js.Any])
    if (kernel_constraint != null) __obj.updateDynamic("kernel_constraint")(kernel_constraint.asInstanceOf[js.Any])
    if (kernel_initializer != null) __obj.updateDynamic("kernel_initializer")(kernel_initializer.asInstanceOf[js.Any])
    if (kernel_regularizer != null) __obj.updateDynamic("kernel_regularizer")(kernel_regularizer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(use_bias)) __obj.updateDynamic("use_bias")(use_bias.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DenseLayerConfig]
  }
}

