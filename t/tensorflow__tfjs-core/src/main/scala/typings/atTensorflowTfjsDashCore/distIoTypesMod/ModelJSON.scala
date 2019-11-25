package typings.atTensorflowTfjsDashCore.distIoTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var convertedBy: js.UndefOr[String | Null] = js.undefined
  /**
    * Hard-coded format name for models saved from TensorFlow.js or converted
    * by TensorFlow.js Converter.
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * What library is responsible for originally generating this artifact.
    *
    * Used for debugging purposes. E.g., 'TensorFlow.js v1.0.0'.
    */
  var generatedBy: js.UndefOr[String] = js.undefined
  /** Model training configuration. */
  var trainingConfig: js.UndefOr[TrainingConfig] = js.undefined
  /**
    * User-defined metadata about the model.
    */
  var userDefinedMetadata: js.UndefOr[js.Object] = js.undefined
  /**
    * Weights manifest.
    *
    * The weights manifest consists of an ordered list of weight-manifest
    * groups. Each weight-manifest group consists of a number of weight values
    * stored in a number of paths. See the documentation of
    * `WeightsManifestConfig` for more details.
    */
  var weightsManifest: WeightsManifestConfig
}

object ModelJSON {
  @scala.inline
  def apply(
    weightsManifest: WeightsManifestConfig,
    convertedBy: String = null,
    format: String = null,
    generatedBy: String = null,
    trainingConfig: TrainingConfig = null,
    userDefinedMetadata: js.Object = null
  ): ModelJSON = {
    val __obj = js.Dynamic.literal(weightsManifest = weightsManifest.asInstanceOf[js.Any])
    if (convertedBy != null) __obj.updateDynamic("convertedBy")(convertedBy.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (generatedBy != null) __obj.updateDynamic("generatedBy")(generatedBy.asInstanceOf[js.Any])
    if (trainingConfig != null) __obj.updateDynamic("trainingConfig")(trainingConfig.asInstanceOf[js.Any])
    if (userDefinedMetadata != null) __obj.updateDynamic("userDefinedMetadata")(userDefinedMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelJSON]
  }
}

