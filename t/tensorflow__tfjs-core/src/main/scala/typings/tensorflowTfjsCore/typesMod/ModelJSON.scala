package typings.tensorflowTfjsCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelJSON extends js.Object {
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
  /** Model training configuration. */
  var trainingConfig: js.UndefOr[TrainingConfig] = js.native
  /**
    * User-defined metadata about the model.
    */
  var userDefinedMetadata: js.UndefOr[js.Object] = js.native
  /**
    * Weights manifest.
    *
    * The weights manifest consists of an ordered list of weight-manifest
    * groups. Each weight-manifest group consists of a number of weight values
    * stored in a number of paths. See the documentation of
    * `WeightsManifestConfig` for more details.
    */
  var weightsManifest: WeightsManifestConfig = js.native
}

object ModelJSON {
  @scala.inline
  def apply(weightsManifest: WeightsManifestConfig): ModelJSON = {
    val __obj = js.Dynamic.literal(weightsManifest = weightsManifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelJSON]
  }
  @scala.inline
  implicit class ModelJSONOps[Self <: ModelJSON] (val x: Self) extends AnyVal {
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
    def setWeightsManifestVarargs(value: WeightsManifestGroupConfig*): Self = this.set("weightsManifest", js.Array(value :_*))
    @scala.inline
    def setWeightsManifest(value: WeightsManifestConfig): Self = this.set("weightsManifest", value.asInstanceOf[js.Any])
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
    def setTrainingConfig(value: TrainingConfig): Self = this.set("trainingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrainingConfig: Self = this.set("trainingConfig", js.undefined)
    @scala.inline
    def setUserDefinedMetadata(value: js.Object): Self = this.set("userDefinedMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserDefinedMetadata: Self = this.set("userDefinedMetadata", js.undefined)
  }
  
}

