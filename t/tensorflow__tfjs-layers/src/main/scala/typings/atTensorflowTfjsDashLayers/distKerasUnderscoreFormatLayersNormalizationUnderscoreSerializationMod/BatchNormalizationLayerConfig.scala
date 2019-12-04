package typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatLayersNormalizationUnderscoreSerializationMod

import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatConstraintUnderscoreConfigMod.ConstraintSerialization
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatInitializerUnderscoreConfigMod.InitializerSerialization
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatRegularizerUnderscoreConfigMod.RegularizerSerialization
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTopologyUnderscoreConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchNormalizationLayerConfig extends LayerConfig {
  var axis: js.UndefOr[Double] = js.undefined
  var beta_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
  var beta_initializer: js.UndefOr[InitializerSerialization] = js.undefined
  var beta_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
  var center: js.UndefOr[Boolean] = js.undefined
  var epsilon: js.UndefOr[Double] = js.undefined
  var gamma_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
  var gamma_initializer: js.UndefOr[InitializerSerialization] = js.undefined
  var gamma_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
  var momentum: js.UndefOr[Double] = js.undefined
  var moving_mean_initializer: js.UndefOr[InitializerSerialization] = js.undefined
  var moving_variance_initializer: js.UndefOr[InitializerSerialization] = js.undefined
  var scale: js.UndefOr[Boolean] = js.undefined
}

object BatchNormalizationLayerConfig {
  @scala.inline
  def apply(
    axis: Int | Double = null,
    batch_input_shape: Shape = null,
    batch_size: Int | Double = null,
    beta_constraint: ConstraintSerialization = null,
    beta_initializer: InitializerSerialization = null,
    beta_regularizer: RegularizerSerialization = null,
    center: js.UndefOr[Boolean] = js.undefined,
    dtype: DataType = null,
    epsilon: Int | Double = null,
    gamma_constraint: ConstraintSerialization = null,
    gamma_initializer: InitializerSerialization = null,
    gamma_regularizer: RegularizerSerialization = null,
    input_dtype: DataType = null,
    input_shape: Shape = null,
    momentum: Int | Double = null,
    moving_mean_initializer: InitializerSerialization = null,
    moving_variance_initializer: InitializerSerialization = null,
    name: String = null,
    scale: js.UndefOr[Boolean] = js.undefined,
    trainable: js.UndefOr[Boolean] = js.undefined
  ): BatchNormalizationLayerConfig = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (batch_input_shape != null) __obj.updateDynamic("batch_input_shape")(batch_input_shape.asInstanceOf[js.Any])
    if (batch_size != null) __obj.updateDynamic("batch_size")(batch_size.asInstanceOf[js.Any])
    if (beta_constraint != null) __obj.updateDynamic("beta_constraint")(beta_constraint.asInstanceOf[js.Any])
    if (beta_initializer != null) __obj.updateDynamic("beta_initializer")(beta_initializer.asInstanceOf[js.Any])
    if (beta_regularizer != null) __obj.updateDynamic("beta_regularizer")(beta_regularizer.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (epsilon != null) __obj.updateDynamic("epsilon")(epsilon.asInstanceOf[js.Any])
    if (gamma_constraint != null) __obj.updateDynamic("gamma_constraint")(gamma_constraint.asInstanceOf[js.Any])
    if (gamma_initializer != null) __obj.updateDynamic("gamma_initializer")(gamma_initializer.asInstanceOf[js.Any])
    if (gamma_regularizer != null) __obj.updateDynamic("gamma_regularizer")(gamma_regularizer.asInstanceOf[js.Any])
    if (input_dtype != null) __obj.updateDynamic("input_dtype")(input_dtype.asInstanceOf[js.Any])
    if (input_shape != null) __obj.updateDynamic("input_shape")(input_shape.asInstanceOf[js.Any])
    if (momentum != null) __obj.updateDynamic("momentum")(momentum.asInstanceOf[js.Any])
    if (moving_mean_initializer != null) __obj.updateDynamic("moving_mean_initializer")(moving_mean_initializer.asInstanceOf[js.Any])
    if (moving_variance_initializer != null) __obj.updateDynamic("moving_variance_initializer")(moving_variance_initializer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchNormalizationLayerConfig]
  }
}

