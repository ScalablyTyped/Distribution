package typings.tensorflowTfjsLayers.convolutionalSerializationMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typings.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormatSerialization
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeparableConvLayerConfig extends ConvLayerConfig {
  var depth_multiplier: js.UndefOr[Double] = js.undefined
  var depthwise_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
  var depthwise_initializer: js.UndefOr[InitializerSerialization] = js.undefined
  var depthwise_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
  var pointwise_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
  var pointwise_initializer: js.UndefOr[InitializerSerialization] = js.undefined
  var pointwise_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
}

object SeparableConvLayerConfig {
  @scala.inline
  def apply(
    filters: Double,
    kernel_size: Double | js.Array[Double],
    activation: String = null,
    activity_regularizer: RegularizerSerialization = null,
    batch_input_shape: Shape = null,
    batch_size: Int | Double = null,
    bias_constraint: ConstraintSerialization = null,
    bias_initializer: InitializerSerialization = null,
    bias_regularizer: RegularizerSerialization = null,
    data_format: DataFormatSerialization = null,
    depth_multiplier: Int | Double = null,
    depthwise_constraint: ConstraintSerialization = null,
    depthwise_initializer: InitializerSerialization = null,
    depthwise_regularizer: RegularizerSerialization = null,
    dilation_rate: Double | js.Array[Double] | (js.Tuple2[Double, Double]) = null,
    dtype: DataType = null,
    input_dtype: DataType = null,
    input_shape: Shape = null,
    kernel_constraint: ConstraintSerialization = null,
    kernel_initializer: InitializerSerialization = null,
    kernel_regularizer: RegularizerSerialization = null,
    name: String = null,
    padding: PaddingMode = null,
    pointwise_constraint: ConstraintSerialization = null,
    pointwise_initializer: InitializerSerialization = null,
    pointwise_regularizer: RegularizerSerialization = null,
    strides: Double | js.Array[Double] = null,
    trainable: js.UndefOr[Boolean] = js.undefined,
    use_bias: js.UndefOr[Boolean] = js.undefined
  ): SeparableConvLayerConfig = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], kernel_size = kernel_size.asInstanceOf[js.Any])
    if (activation != null) __obj.updateDynamic("activation")(activation.asInstanceOf[js.Any])
    if (activity_regularizer != null) __obj.updateDynamic("activity_regularizer")(activity_regularizer.asInstanceOf[js.Any])
    if (batch_input_shape != null) __obj.updateDynamic("batch_input_shape")(batch_input_shape.asInstanceOf[js.Any])
    if (batch_size != null) __obj.updateDynamic("batch_size")(batch_size.asInstanceOf[js.Any])
    if (bias_constraint != null) __obj.updateDynamic("bias_constraint")(bias_constraint.asInstanceOf[js.Any])
    if (bias_initializer != null) __obj.updateDynamic("bias_initializer")(bias_initializer.asInstanceOf[js.Any])
    if (bias_regularizer != null) __obj.updateDynamic("bias_regularizer")(bias_regularizer.asInstanceOf[js.Any])
    if (data_format != null) __obj.updateDynamic("data_format")(data_format.asInstanceOf[js.Any])
    if (depth_multiplier != null) __obj.updateDynamic("depth_multiplier")(depth_multiplier.asInstanceOf[js.Any])
    if (depthwise_constraint != null) __obj.updateDynamic("depthwise_constraint")(depthwise_constraint.asInstanceOf[js.Any])
    if (depthwise_initializer != null) __obj.updateDynamic("depthwise_initializer")(depthwise_initializer.asInstanceOf[js.Any])
    if (depthwise_regularizer != null) __obj.updateDynamic("depthwise_regularizer")(depthwise_regularizer.asInstanceOf[js.Any])
    if (dilation_rate != null) __obj.updateDynamic("dilation_rate")(dilation_rate.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (input_dtype != null) __obj.updateDynamic("input_dtype")(input_dtype.asInstanceOf[js.Any])
    if (input_shape != null) __obj.updateDynamic("input_shape")(input_shape.asInstanceOf[js.Any])
    if (kernel_constraint != null) __obj.updateDynamic("kernel_constraint")(kernel_constraint.asInstanceOf[js.Any])
    if (kernel_initializer != null) __obj.updateDynamic("kernel_initializer")(kernel_initializer.asInstanceOf[js.Any])
    if (kernel_regularizer != null) __obj.updateDynamic("kernel_regularizer")(kernel_regularizer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pointwise_constraint != null) __obj.updateDynamic("pointwise_constraint")(pointwise_constraint.asInstanceOf[js.Any])
    if (pointwise_initializer != null) __obj.updateDynamic("pointwise_initializer")(pointwise_initializer.asInstanceOf[js.Any])
    if (pointwise_regularizer != null) __obj.updateDynamic("pointwise_regularizer")(pointwise_regularizer.asInstanceOf[js.Any])
    if (strides != null) __obj.updateDynamic("strides")(strides.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.asInstanceOf[js.Any])
    if (!js.isUndefined(use_bias)) __obj.updateDynamic("use_bias")(use_bias.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeparableConvLayerConfig]
  }
}

