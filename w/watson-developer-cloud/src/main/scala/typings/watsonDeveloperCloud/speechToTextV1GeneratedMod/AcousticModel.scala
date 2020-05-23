package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * model interfaces
  ************************/
/** AcousticModel. */
trait AcousticModel extends js.Object {
  /** The name of the language model for which the custom acoustic model was created. */
  var base_model_name: js.UndefOr[String] = js.undefined
  /** The date and time in Coordinated Universal Time (UTC) at which the custom acoustic model was created. The value is provided in full ISO 8601 format (`YYYY-MM-DDThh:mm:ss.sTZD`). */
  var created: js.UndefOr[String] = js.undefined
  /** The customization ID (GUID) of the custom acoustic model. The **Create a custom acoustic model** method returns only this field of the object; it does not return the other fields. */
  var customization_id: String
  /** The description of the custom acoustic model. */
  var description: js.UndefOr[String] = js.undefined
  /** The language identifier of the custom acoustic model (for example, `en-US`). */
  var language: js.UndefOr[String] = js.undefined
  /** The name of the custom acoustic model. */
  var name: js.UndefOr[String] = js.undefined
  /** The GUID of the credentials for the instance of the service that owns the custom acoustic model. */
  var owner: js.UndefOr[String] = js.undefined
  /** A percentage that indicates the progress of the custom acoustic model's current training. A value of `100` means that the model is fully trained. **Note:** The `progress` field does not currently reflect the progress of the training. The field changes from `0` to `100` when training is complete. */
  var progress: js.UndefOr[Double] = js.undefined
  /** The current status of the custom acoustic model: * `pending`: The model was created but is waiting either for training data to be added or for the service to finish analyzing added data. * `ready`: The model contains data and is ready to be trained. * `training`: The model is currently being trained. * `available`: The model is trained and ready to use. * `upgrading`: The model is currently being upgraded. * `failed`: Training of the model failed. */
  var status: js.UndefOr[String] = js.undefined
  /** A list of the available versions of the custom acoustic model. Each element of the array indicates a version of the base model with which the custom model can be used. Multiple versions exist only if the custom model has been upgraded; otherwise, only a single version is shown. */
  var versions: js.UndefOr[js.Array[String]] = js.undefined
  /** If the request included unknown parameters, the following message: `Unexpected query parameter(s) ['parameters'] detected`, where `parameters` is a list that includes a quoted string for each unknown parameter. */
  var warnings: js.UndefOr[String] = js.undefined
}

object AcousticModel {
  @scala.inline
  def apply(
    customization_id: String,
    base_model_name: String = null,
    created: String = null,
    description: String = null,
    language: String = null,
    name: String = null,
    owner: String = null,
    progress: js.UndefOr[Double] = js.undefined,
    status: String = null,
    versions: js.Array[String] = null,
    warnings: String = null
  ): AcousticModel = {
    val __obj = js.Dynamic.literal(customization_id = customization_id.asInstanceOf[js.Any])
    if (base_model_name != null) __obj.updateDynamic("base_model_name")(base_model_name.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (!js.isUndefined(progress)) __obj.updateDynamic("progress")(progress.get.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcousticModel]
  }
}

