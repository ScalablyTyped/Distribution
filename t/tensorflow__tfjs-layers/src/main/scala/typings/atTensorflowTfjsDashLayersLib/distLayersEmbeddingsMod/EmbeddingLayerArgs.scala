package typings
package atTensorflowTfjsDashLayersLib.distLayersEmbeddingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddingLayerArgs
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.LayerArgs {
  /**
    * Regularizer function applied to the activation.
    */
  var activityRegularizer: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer
  ] = js.undefined
  /**
    * Constraint function applied to the `embeddings` matrix.
    */
  var embeddingsConstraint: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distConstraintsMod.ConstraintIdentifier | atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint
  ] = js.undefined
  /**
    * Initializer for the `embeddings` matrix.
    */
  var embeddingsInitializer: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer
  ] = js.undefined
  /**
    * Regularizer function applied to the `embeddings` matrix.
    */
  var embeddingsRegularizer: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer
  ] = js.undefined
  /**
    * Integer > 0. Size of the vocabulary, i.e. maximum integer index + 1.
    */
  var inputDim: scala.Double
  /**
    * Length of input sequences, when it is constant.
    *
    * This argument is required if you are going to connect `flatten` then
    * `dense` layers upstream (without it, the shape of the dense outputs cannot
    * be computed).
    */
  var inputLength: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
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
  var maskZero: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Integer >= 0. Dimension of the dense embedding.
    */
  var outputDim: scala.Double
}

object EmbeddingLayerArgs {
  @scala.inline
  def apply(
    inputDim: scala.Double,
    outputDim: scala.Double,
    activityRegularizer: atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer = null,
    batchInputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    batchSize: scala.Int | scala.Double = null,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    embeddingsConstraint: atTensorflowTfjsDashLayersLib.distConstraintsMod.ConstraintIdentifier | atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint = null,
    embeddingsInitializer: atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer = null,
    embeddingsRegularizer: atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer = null,
    inputDType: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputLength: scala.Double | js.Array[scala.Double] = null,
    inputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    maskZero: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    trainable: js.UndefOr[scala.Boolean] = js.undefined,
    weights: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ] = null
  ): EmbeddingLayerArgs = {
    val __obj = js.Dynamic.literal(inputDim = inputDim, outputDim = outputDim)
    if (activityRegularizer != null) __obj.updateDynamic("activityRegularizer")(activityRegularizer.asInstanceOf[js.Any])
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (embeddingsConstraint != null) __obj.updateDynamic("embeddingsConstraint")(embeddingsConstraint.asInstanceOf[js.Any])
    if (embeddingsInitializer != null) __obj.updateDynamic("embeddingsInitializer")(embeddingsInitializer.asInstanceOf[js.Any])
    if (embeddingsRegularizer != null) __obj.updateDynamic("embeddingsRegularizer")(embeddingsRegularizer.asInstanceOf[js.Any])
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType)
    if (inputLength != null) __obj.updateDynamic("inputLength")(inputLength.asInstanceOf[js.Any])
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape)
    if (!js.isUndefined(maskZero)) __obj.updateDynamic("maskZero")(maskZero)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable)
    if (weights != null) __obj.updateDynamic("weights")(weights)
    __obj.asInstanceOf[EmbeddingLayerArgs]
  }
}

