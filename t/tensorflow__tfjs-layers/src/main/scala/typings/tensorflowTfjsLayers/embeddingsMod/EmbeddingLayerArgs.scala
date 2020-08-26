package typings.tensorflowTfjsLayers.embeddingsMod

import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.constraintsMod.ConstraintIdentifier
import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import typings.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmbeddingLayerArgs extends LayerArgs {
  /**
    * Regularizer function applied to the activation.
    */
  var activityRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  /**
    * Constraint function applied to the `embeddings` matrix.
    */
  var embeddingsConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
  /**
    * Initializer for the `embeddings` matrix.
    */
  var embeddingsInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  /**
    * Regularizer function applied to the `embeddings` matrix.
    */
  var embeddingsRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  /**
    * Integer > 0. Size of the vocabulary, i.e. maximum integer index + 1.
    */
  var inputDim: Double = js.native
  /**
    * Length of input sequences, when it is constant.
    *
    * This argument is required if you are going to connect `flatten` then
    * `dense` layers upstream (without it, the shape of the dense outputs cannot
    * be computed).
    */
  var inputLength: js.UndefOr[Double | js.Array[Double]] = js.native
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
  var maskZero: js.UndefOr[Boolean] = js.native
  /**
    * Integer >= 0. Dimension of the dense embedding.
    */
  var outputDim: Double = js.native
}

object EmbeddingLayerArgs {
  @scala.inline
  def apply(inputDim: Double, outputDim: Double): EmbeddingLayerArgs = {
    val __obj = js.Dynamic.literal(inputDim = inputDim.asInstanceOf[js.Any], outputDim = outputDim.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddingLayerArgs]
  }
  @scala.inline
  implicit class EmbeddingLayerArgsOps[Self <: EmbeddingLayerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInputDim(value: Double): Self = this.set("inputDim", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputDim(value: Double): Self = this.set("outputDim", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivityRegularizer(value: RegularizerIdentifier | Regularizer): Self = this.set("activityRegularizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityRegularizer: Self = this.set("activityRegularizer", js.undefined)
    @scala.inline
    def setEmbeddingsConstraint(value: ConstraintIdentifier | Constraint): Self = this.set("embeddingsConstraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbeddingsConstraint: Self = this.set("embeddingsConstraint", js.undefined)
    @scala.inline
    def setEmbeddingsInitializer(value: InitializerIdentifier | Initializer): Self = this.set("embeddingsInitializer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbeddingsInitializer: Self = this.set("embeddingsInitializer", js.undefined)
    @scala.inline
    def setEmbeddingsRegularizer(value: RegularizerIdentifier | Regularizer): Self = this.set("embeddingsRegularizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbeddingsRegularizer: Self = this.set("embeddingsRegularizer", js.undefined)
    @scala.inline
    def setInputLengthVarargs(value: Double*): Self = this.set("inputLength", js.Array(value :_*))
    @scala.inline
    def setInputLength(value: Double | js.Array[Double]): Self = this.set("inputLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputLength: Self = this.set("inputLength", js.undefined)
    @scala.inline
    def setMaskZero(value: Boolean): Self = this.set("maskZero", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskZero: Self = this.set("maskZero", js.undefined)
  }
  
}

