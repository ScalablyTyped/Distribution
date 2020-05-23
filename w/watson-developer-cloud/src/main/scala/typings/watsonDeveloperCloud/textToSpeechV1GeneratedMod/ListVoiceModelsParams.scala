package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.ListVoiceModelsConstants.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `listVoiceModels` operation. */
trait ListVoiceModelsParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The language for which custom voice models that are owned by the requesting service credentials are to be returned. Omit the parameter to see all custom voice models that are owned by the requester. */
  var language: js.UndefOr[Language | String] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object ListVoiceModelsParams {
  @scala.inline
  def apply(
    headers: js.Object = null,
    language: Language | String = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): ListVoiceModelsParams = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVoiceModelsParams]
  }
}

