package typings.tensorflowTfjsLayers.embeddingsMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.constraintsMod.ConstraintIdentifier
import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import typings.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddingLayerArgs extends LayerArgs {
  /**
    * Regularizer function applied to the activation.
    */
  var activityRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
  /**
    * Constraint function applied to the `embeddings` matrix.
    */
  var embeddingsConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
  /**
    * Initializer for the `embeddings` matrix.
    */
  var embeddingsInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
  /**
    * Regularizer function applied to the `embeddings` matrix.
    */
  var embeddingsRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
  /**
    * Integer > 0. Size of the vocabulary, i.e. maximum integer index + 1.
    */
  var inputDim: Double
  /**
    * Length of input sequences, when it is constant.
    *
    * This argument is required if you are going to connect `flatten` then
    * `dense` layers upstream (without it, the shape of the dense outputs cannot
    * be computed).
    */
  var inputLength: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /**
    * Whether the input value 0 is a special "padding" value that should be
    * masked out. This is useful when using recurrent layers which may take
    * variable length input.
    *
    * If this is `True` then all subsequent layers in the model need to support
    * masking or an exception will be raised. If maskZero is set to `True`, as a
    * consequence, index 0 cannot be used in the vocabulary (inputDim should
    * equal size of vocabulary + 1).
    */
  var maskZero: js.UndefOr[Boolean] = js.undefined
  /**
    * Integer >= 0. Dimension of the dense embedding.
    */
  var outputDim: Double
}

object EmbeddingLayerArgs {
  @scala.inline
  def apply(
    inputDim: Double,
    outputDim: Double,
    activityRegularizer: RegularizerIdentifier | Regularizer = null,
    batchInputShape: Shape = null,
    batchSize: Int | Double = null,
    dtype: DataType = null,
    embeddingsConstraint: ConstraintIdentifier | Constraint = null,
    embeddingsInitializer: InitializerIdentifier | Initializer = null,
    embeddingsRegularizer: RegularizerIdentifier | Regularizer = null,
    inputDType: DataType = null,
    inputLength: Double | js.Array[Double] = null,
    inputShape: Shape = null,
    maskZero: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    trainable: js.UndefOr[Boolean] = js.undefined,
    weights: js.Array[Tensor_[Rank]] = null
  ): EmbeddingLayerArgs = {
    val __obj = js.Dynamic.literal(inputDim = inputDim.asInstanceOf[js.Any], outputDim = outputDim.asInstanceOf[js.Any])
    if (activityRegularizer != null) __obj.updateDynamic("activityRegularizer")(activityRegularizer.asInstanceOf[js.Any])
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape.asInstanceOf[js.Any])
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (embeddingsConstraint != null) __obj.updateDynamic("embeddingsConstraint")(embeddingsConstraint.asInstanceOf[js.Any])
    if (embeddingsInitializer != null) __obj.updateDynamic("embeddingsInitializer")(embeddingsInitializer.asInstanceOf[js.Any])
    if (embeddingsRegularizer != null) __obj.updateDynamic("embeddingsRegularizer")(embeddingsRegularizer.asInstanceOf[js.Any])
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType.asInstanceOf[js.Any])
    if (inputLength != null) __obj.updateDynamic("inputLength")(inputLength.asInstanceOf[js.Any])
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape.asInstanceOf[js.Any])
    if (!js.isUndefined(maskZero)) __obj.updateDynamic("maskZero")(maskZero.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.asInstanceOf[js.Any])
    if (weights != null) __obj.updateDynamic("weights")(weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddingLayerArgs]
  }
}

