package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * request interfaces
  ************************/
/** Parameters for the `getVoice` operation. */
trait GetVoiceParams extends js.Object {
  /** The customization ID (GUID) of a custom voice model for which information is to be returned. You must make the request with service credentials created for the instance of the service that owns the custom model. Omit the parameter to see information about the specified voice with no customization. */
  var customization_id: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** The voice for which information is to be returned. */
  var voice: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetVoiceConstants.Voice | String
}

object GetVoiceParams {
  @scala.inline
  def apply(
    voice: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetVoiceConstants.Voice | String,
    customization_id: String = null,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): GetVoiceParams = {
    val __obj = js.Dynamic.literal(voice = voice.asInstanceOf[js.Any])
    if (customization_id != null) __obj.updateDynamic("customization_id")(customization_id.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceParams]
  }
}

