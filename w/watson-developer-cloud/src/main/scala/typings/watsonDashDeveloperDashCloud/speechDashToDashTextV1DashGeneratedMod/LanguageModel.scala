package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** LanguageModel. */
trait LanguageModel extends js.Object {
  /** The name of the language model for which the custom language model was created. */
  var base_model_name: js.UndefOr[String] = js.undefined
  /** The date and time in Coordinated Universal Time (UTC) at which the custom language model was created. The value is provided in full ISO 8601 format (`YYYY-MM-DDThh:mm:ss.sTZD`). */
  var created: js.UndefOr[String] = js.undefined
  /** The customization ID (GUID) of the custom language model. The **Create a custom language model** method returns only this field of the object; it does not return the other fields. */
  var customization_id: String
  /** The description of the custom language model. */
  var description: js.UndefOr[String] = js.undefined
  /** The dialect of the language for the custom language model. By default, the dialect matches the language of the base model; for example, `en-US` for either of the US English language models. For Spanish models, the field indicates the dialect for which the model was created: * `es-ES` for Castilian Spanish (the default) * `es-LA` for Latin American Spanish * `es-US` for North American (Mexican) Spanish. */
  var dialect: js.UndefOr[String] = js.undefined
  /** If an error occurred while adding a grammar file to the custom language model, a message that describes an `Internal Server Error` and includes the string `Cannot compile grammar`. The status of the custom model is not affected by the error, but the grammar cannot be used with the model. */
  var error: js.UndefOr[String] = js.undefined
  /** The language identifier of the custom language model (for example, `en-US`). */
  var language: js.UndefOr[String] = js.undefined
  /** The name of the custom language model. */
  var name: js.UndefOr[String] = js.undefined
  /** The GUID of the credentials for the instance of the service that owns the custom language model. */
  var owner: js.UndefOr[String] = js.undefined
  /** A percentage that indicates the progress of the custom language model's current training. A value of `100` means that the model is fully trained. **Note:** The `progress` field does not currently reflect the progress of the training. The field changes from `0` to `100` when training is complete. */
  var progress: js.UndefOr[Double] = js.undefined
  /** The current status of the custom language model: * `pending`: The model was created but is waiting either for training data to be added or for the service to finish analyzing added data. * `ready`: The model contains data and is ready to be trained. * `training`: The model is currently being trained. * `available`: The model is trained and ready to use. * `upgrading`: The model is currently being upgraded. * `failed`: Training of the model failed. */
  var status: js.UndefOr[String] = js.undefined
  /** A list of the available versions of the custom language model. Each element of the array indicates a version of the base model with which the custom model can be used. Multiple versions exist only if the custom model has been upgraded; otherwise, only a single version is shown. */
  var versions: js.UndefOr[js.Array[String]] = js.undefined
  /** If the request included unknown parameters, the following message: `Unexpected query parameter(s) ['parameters'] detected`, where `parameters` is a list that includes a quoted string for each unknown parameter. */
  var warnings: js.UndefOr[String] = js.undefined
}

object LanguageModel {
  @scala.inline
  def apply(
    customization_id: String,
    base_model_name: String = null,
    created: String = null,
    description: String = null,
    dialect: String = null,
    error: String = null,
    language: String = null,
    name: String = null,
    owner: String = null,
    progress: Int | Double = null,
    status: String = null,
    versions: js.Array[String] = null,
    warnings: String = null
  ): LanguageModel = {
    val __obj = js.Dynamic.literal(customization_id = customization_id)
    if (base_model_name != null) __obj.updateDynamic("base_model_name")(base_model_name)
    if (created != null) __obj.updateDynamic("created")(created)
    if (description != null) __obj.updateDynamic("description")(description)
    if (dialect != null) __obj.updateDynamic("dialect")(dialect)
    if (error != null) __obj.updateDynamic("error")(error)
    if (language != null) __obj.updateDynamic("language")(language)
    if (name != null) __obj.updateDynamic("name")(name)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status)
    if (versions != null) __obj.updateDynamic("versions")(versions)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[LanguageModel]
  }
}

