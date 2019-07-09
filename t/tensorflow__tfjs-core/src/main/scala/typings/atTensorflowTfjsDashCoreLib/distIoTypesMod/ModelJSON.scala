package typings
package atTensorflowTfjsDashCoreLib.distIoTypesMod

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
  var convertedBy: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Hard-coded format name for models saved from TensorFlow.js or converted
    * by TensorFlow.js Converter.
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    * What library is responsible for originally generating this artifact.
    *
    * Used for debugging purposes. E.g., 'TensorFlow.js v1.0.0'.
    */
  var generatedBy: js.UndefOr[java.lang.String] = js.undefined
  /** Model training configuration. */
  var trainingConfig: js.UndefOr[TrainingConfig] = js.undefined
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
    convertedBy: java.lang.String = null,
    format: java.lang.String = null,
    generatedBy: java.lang.String = null,
    trainingConfig: TrainingConfig = null
  ): ModelJSON = {
    val __obj = js.Dynamic.literal(weightsManifest = weightsManifest)
    if (convertedBy != null) __obj.updateDynamic("convertedBy")(convertedBy)
    if (format != null) __obj.updateDynamic("format")(format)
    if (generatedBy != null) __obj.updateDynamic("generatedBy")(generatedBy)
    if (trainingConfig != null) __obj.updateDynamic("trainingConfig")(trainingConfig)
    __obj.asInstanceOf[ModelJSON]
  }
}

