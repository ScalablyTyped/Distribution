package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `upgradeAcousticModel` operation. */
@js.native
trait UpgradeAcousticModelParams extends js.Object {
  /** If the custom acoustic model was trained with a custom language model, the customization ID (GUID) of that custom language model. The custom language model must be upgraded before the custom acoustic model can be upgraded. The credentials specified with the request must own both custom models. */
  var custom_language_model_id: js.UndefOr[String] = js.native
  /** The customization ID (GUID) of the custom acoustic model that is to be used for the request. You must make the request with credentials for the instance of the service that owns the custom model. */
  var customization_id: String = js.native
  /** If `true`, forces the upgrade of a custom acoustic model for which no input data has been modified since it was last trained. Use this parameter only to force the upgrade of a custom acoustic model that is trained with a custom language model, and only if you receive a 400 response code and the message `No input data modified since last training`. See [Upgrading a custom acoustic model](https://cloud.ibm.com/docs/services/speech-to-text/custom-upgrade.html#upgradeAcoustic). */
  var force: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
}

object UpgradeAcousticModelParams {
  @scala.inline
  def apply(customization_id: String): UpgradeAcousticModelParams = {
    val __obj = js.Dynamic.literal(customization_id = customization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradeAcousticModelParams]
  }
  @scala.inline
  implicit class UpgradeAcousticModelParamsOps[Self <: UpgradeAcousticModelParams] (val x: Self) extends AnyVal {
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
    def setCustomization_id(value: String): Self = this.set("customization_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom_language_model_id(value: String): Self = this.set("custom_language_model_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom_language_model_id: Self = this.set("custom_language_model_id", js.undefined)
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
  
}

