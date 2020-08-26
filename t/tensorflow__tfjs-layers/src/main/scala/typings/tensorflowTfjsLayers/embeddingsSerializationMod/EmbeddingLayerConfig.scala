package typings.tensorflowTfjsLayers.embeddingsSerializationMod

import typings.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typings.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typings.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmbeddingLayerConfig extends LayerConfig {
  var activity_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  var embeddings_constraint: js.UndefOr[ConstraintSerialization] = js.native
  var embeddings_initializer: js.UndefOr[InitializerSerialization] = js.native
  var embeddings_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  var input_dim: Double = js.native
  var input_length: js.UndefOr[Double | js.Array[Double]] = js.native
  var mask_zero: js.UndefOr[Boolean] = js.native
  var output_dim: Double = js.native
}

object EmbeddingLayerConfig {
  @scala.inline
  def apply(input_dim: Double, output_dim: Double): EmbeddingLayerConfig = {
    val __obj = js.Dynamic.literal(input_dim = input_dim.asInstanceOf[js.Any], output_dim = output_dim.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddingLayerConfig]
  }
  @scala.inline
  implicit class EmbeddingLayerConfigOps[Self <: EmbeddingLayerConfig] (val x: Self) extends AnyVal {
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
    def setInput_dim(value: Double): Self = this.set("input_dim", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput_dim(value: Double): Self = this.set("output_dim", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivity_regularizer(value: RegularizerSerialization): Self = this.set("activity_regularizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivity_regularizer: Self = this.set("activity_regularizer", js.undefined)
    @scala.inline
    def setEmbeddings_constraint(value: ConstraintSerialization): Self = this.set("embeddings_constraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbeddings_constraint: Self = this.set("embeddings_constraint", js.undefined)
    @scala.inline
    def setEmbeddings_initializer(value: InitializerSerialization): Self = this.set("embeddings_initializer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbeddings_initializer: Self = this.set("embeddings_initializer", js.undefined)
    @scala.inline
    def setEmbeddings_regularizer(value: RegularizerSerialization): Self = this.set("embeddings_regularizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbeddings_regularizer: Self = this.set("embeddings_regularizer", js.undefined)
    @scala.inline
    def setInput_lengthVarargs(value: Double*): Self = this.set("input_length", js.Array(value :_*))
    @scala.inline
    def setInput_length(value: Double | js.Array[Double]): Self = this.set("input_length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput_length: Self = this.set("input_length", js.undefined)
    @scala.inline
    def setMask_zero(value: Boolean): Self = this.set("mask_zero", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask_zero: Self = this.set("mask_zero", js.undefined)
  }
  
}

