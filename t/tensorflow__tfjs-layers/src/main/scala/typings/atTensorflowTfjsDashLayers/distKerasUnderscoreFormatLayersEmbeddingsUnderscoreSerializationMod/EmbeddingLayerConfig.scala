package typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatLayersEmbeddingsUnderscoreSerializationMod

import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatConstraintUnderscoreConfigMod.ConstraintSerialization
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatInitializerUnderscoreConfigMod.InitializerSerialization
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatRegularizerUnderscoreConfigMod.RegularizerSerialization
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTopologyUnderscoreConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddingLayerConfig extends LayerConfig {
  var activity_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
  var embeddings_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
  var embeddings_initializer: js.UndefOr[InitializerSerialization] = js.undefined
  var embeddings_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
  var input_dim: Double
  var input_length: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var mask_zero: js.UndefOr[Boolean] = js.undefined
  var output_dim: Double
}

object EmbeddingLayerConfig {
  @scala.inline
  def apply(
    input_dim: Double,
    output_dim: Double,
    activity_regularizer: RegularizerSerialization = null,
    batch_input_shape: Shape = null,
    batch_size: Int | Double = null,
    dtype: DataType = null,
    embeddings_constraint: ConstraintSerialization = null,
    embeddings_initializer: InitializerSerialization = null,
    embeddings_regularizer: RegularizerSerialization = null,
    input_dtype: DataType = null,
    input_length: Double | js.Array[Double] = null,
    input_shape: Shape = null,
    mask_zero: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    trainable: js.UndefOr[Boolean] = js.undefined
  ): EmbeddingLayerConfig = {
    val __obj = js.Dynamic.literal(input_dim = input_dim.asInstanceOf[js.Any], output_dim = output_dim.asInstanceOf[js.Any])
    if (activity_regularizer != null) __obj.updateDynamic("activity_regularizer")(activity_regularizer.asInstanceOf[js.Any])
    if (batch_input_shape != null) __obj.updateDynamic("batch_input_shape")(batch_input_shape.asInstanceOf[js.Any])
    if (batch_size != null) __obj.updateDynamic("batch_size")(batch_size.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (embeddings_constraint != null) __obj.updateDynamic("embeddings_constraint")(embeddings_constraint.asInstanceOf[js.Any])
    if (embeddings_initializer != null) __obj.updateDynamic("embeddings_initializer")(embeddings_initializer.asInstanceOf[js.Any])
    if (embeddings_regularizer != null) __obj.updateDynamic("embeddings_regularizer")(embeddings_regularizer.asInstanceOf[js.Any])
    if (input_dtype != null) __obj.updateDynamic("input_dtype")(input_dtype.asInstanceOf[js.Any])
    if (input_length != null) __obj.updateDynamic("input_length")(input_length.asInstanceOf[js.Any])
    if (input_shape != null) __obj.updateDynamic("input_shape")(input_shape.asInstanceOf[js.Any])
    if (!js.isUndefined(mask_zero)) __obj.updateDynamic("mask_zero")(mask_zero.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddingLayerConfig]
  }
}

