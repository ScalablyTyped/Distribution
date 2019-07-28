package typings.atTensorflowTfjsDashCore.distIoTypesMod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /**
    * Model topology.
    *
    * For Keras-style `tf.Model`s, this is a JSON object.
    * For TensorFlow-style models (e.g., `SavedModel`), this is the JSON
    * encoding of the `GraphDef` protocol buffer.
    */
  var modelTopology: js.UndefOr[js.Object | ArrayBuffer] = js.undefined
  /**
    * Serialized configuration for the model's training.
    */
  var trainingConfig: js.UndefOr[TrainingConfig] = js.undefined
  /**
    * Binary buffer for all weight values concatenated in the order specified
    * by `weightSpecs`.
    */
  var weightData: js.UndefOr[ArrayBuffer] = js.undefined
  /**
    * Weight specifications.
    *
    * This corresponds to the weightsData below.
    */
  var weightSpecs: js.UndefOr[js.Array[WeightsManifestEntry]] = js.undefined
}

object ModelArtifacts {
  @scala.inline
  def apply(
    convertedBy: String = null,
    format: String = null,
    generatedBy: String = null,
    modelTopology: js.Object | ArrayBuffer = null,
    trainingConfig: TrainingConfig = null,
    weightData: ArrayBuffer = null,
    weightSpecs: js.Array[WeightsManifestEntry] = null
  ): ModelArtifacts = {
    val __obj = js.Dynamic.literal()
    if (convertedBy != null) __obj.updateDynamic("convertedBy")(convertedBy)
    if (format != null) __obj.updateDynamic("format")(format)
    if (generatedBy != null) __obj.updateDynamic("generatedBy")(generatedBy)
    if (modelTopology != null) __obj.updateDynamic("modelTopology")(modelTopology.asInstanceOf[js.Any])
    if (trainingConfig != null) __obj.updateDynamic("trainingConfig")(trainingConfig)
    if (weightData != null) __obj.updateDynamic("weightData")(weightData)
    if (weightSpecs != null) __obj.updateDynamic("weightSpecs")(weightSpecs)
    __obj.asInstanceOf[ModelArtifacts]
  }
}

