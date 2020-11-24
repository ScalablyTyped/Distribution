package typings.tensorflowTfjsCore.typesMod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelArtifacts extends js.Object {
  
  /**
    * What library or tool is responsible for converting the original model
    * to this format, applicable only if the model is output by a converter.
    *
    * Used for debugging purposes.  E.g., 'TensorFlow.js Converter v1.0.0'.
    *
    * A value of `null` means the model artifacts are generated without any
    * conversion process (e.g., saved directly from a TensorFlow.js
    * `tf.LayersModel` instance.)
    */
  var convertedBy: js.UndefOr[String | Null] = js.native
  
  /**
    * Hard-coded format name for models saved from TensorFlow.js or converted
    * by TensorFlow.js Converter.
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * What library is responsible for originally generating this artifact.
    *
    * Used for debugging purposes. E.g., 'TensorFlow.js v1.0.0'.
    */
  var generatedBy: js.UndefOr[String] = js.native
  
  /**
    * Initializer for the model.
    */
  var modelInitializer: js.UndefOr[js.Object] = js.native
  
  /**
    * Model topology.
    *
    * For Keras-style `tf.Model`s, this is a JSON object.
    * For TensorFlow-style models (e.g., `SavedModel`), this is the JSON
    * encoding of the `GraphDef` protocol buffer.
    */
  var modelTopology: js.UndefOr[js.Object | ArrayBuffer] = js.native
  
  /**
    * Serialized configuration for the model's training.
    */
  var trainingConfig: js.UndefOr[TrainingConfig] = js.native
  
  /**
    * User-defined metadata about the model.
    */
  var userDefinedMetadata: js.UndefOr[js.Object] = js.native
  
  /**
    * Binary buffer for all weight values concatenated in the order specified
    * by `weightSpecs`.
    */
  var weightData: js.UndefOr[ArrayBuffer] = js.native
  
  /**
    * Weight specifications.
    *
    * This corresponds to the weightsData below.
    */
  var weightSpecs: js.UndefOr[js.Array[WeightsManifestEntry]] = js.native
}
object ModelArtifacts {
  
  @scala.inline
  def apply(): ModelArtifacts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelArtifacts]
  }
  
  @scala.inline
  implicit class ModelArtifactsOps[Self <: ModelArtifacts] (val x: Self) extends AnyVal {
    
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
    def setConvertedBy(value: String): Self = this.set("convertedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertedBy: Self = this.set("convertedBy", js.undefined)
    
    @scala.inline
    def setConvertedByNull: Self = this.set("convertedBy", null)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setGeneratedBy(value: String): Self = this.set("generatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneratedBy: Self = this.set("generatedBy", js.undefined)
    
    @scala.inline
    def setModelInitializer(value: js.Object): Self = this.set("modelInitializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelInitializer: Self = this.set("modelInitializer", js.undefined)
    
    @scala.inline
    def setModelTopology(value: js.Object | ArrayBuffer): Self = this.set("modelTopology", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelTopology: Self = this.set("modelTopology", js.undefined)
    
    @scala.inline
    def setTrainingConfig(value: TrainingConfig): Self = this.set("trainingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingConfig: Self = this.set("trainingConfig", js.undefined)
    
    @scala.inline
    def setUserDefinedMetadata(value: js.Object): Self = this.set("userDefinedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDefinedMetadata: Self = this.set("userDefinedMetadata", js.undefined)
    
    @scala.inline
    def setWeightData(value: ArrayBuffer): Self = this.set("weightData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeightData: Self = this.set("weightData", js.undefined)
    
    @scala.inline
    def setWeightSpecsVarargs(value: WeightsManifestEntry*): Self = this.set("weightSpecs", js.Array(value :_*))
    
    @scala.inline
    def setWeightSpecs(value: js.Array[WeightsManifestEntry]): Self = this.set("weightSpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeightSpecs: Self = this.set("weightSpecs", js.undefined)
  }
}
