package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `upgradeAcousticModel` operation. */
trait UpgradeAcousticModelParams extends js.Object {
  /** If the custom acoustic model was trained with a custom language model, the customization ID (GUID) of that custom language model. The custom language model must be upgraded before the custom acoustic model can be upgraded. The credentials specified with the request must own both custom models. */
  var custom_language_model_id: js.UndefOr[String] = js.undefined
  /** The customization ID (GUID) of the custom acoustic model that is to be used for the request. You must make the request with credentials for the instance of the service that owns the custom model. */
  var customization_id: String
  /** If `true`, forces the upgrade of a custom acoustic model for which no input data has been modified since it was last trained. Use this parameter only to force the upgrade of a custom acoustic model that is trained with a custom language model, and only if you receive a 400 response code and the message `No input data modified since last training`. See [Upgrading a custom acoustic model](https://cloud.ibm.com/docs/services/speech-to-text/custom-upgrade.html#upgradeAcoustic). */
  var force: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object UpgradeAcousticModelParams {
  @scala.inline
  def apply(
    customization_id: String,
    custom_language_model_id: String = null,
    force: js.UndefOr[Boolean] = js.undefined,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): UpgradeAcousticModelParams = {
    val __obj = js.Dynamic.literal(customization_id = customization_id)
    if (custom_language_model_id != null) __obj.updateDynamic("custom_language_model_id")(custom_language_model_id)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[UpgradeAcousticModelParams]
  }
}

