package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.CreateVoiceModelConstants.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createVoiceModel` operation. */
trait CreateVoiceModelParams extends js.Object {
  /** A description of the new custom voice model. Specifying a description is recommended. */
  var description: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The language of the new custom voice model. Omit the parameter to use the the default language, `en-US`. */
  var language: js.UndefOr[Language | String] = js.undefined
  /** The name of the new custom voice model. */
  var name: String
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object CreateVoiceModelParams {
  @scala.inline
  def apply(
    name: String,
    description: String = null,
    headers: js.Object = null,
    language: Language | String = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): CreateVoiceModelParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVoiceModelParams]
  }
}

