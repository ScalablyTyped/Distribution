package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `getPronunciation` operation. */
trait GetPronunciationParams extends js.Object {
  /** The customization ID (GUID) of a custom voice model for which the pronunciation is to be returned. The language of a specified custom model must match the language of the specified voice. If the word is not defined in the specified custom model, the service returns the default translation for the custom model's language. You must make the request with service credentials created for the instance of the service that owns the custom model. Omit the parameter to see the translation for the specified voice with no customization. */
  var customization_id: js.UndefOr[String] = js.undefined
  /** The phoneme format in which to return the pronunciation. Omit the parameter to obtain the pronunciation in the default format. */
  var format: js.UndefOr[Format | String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** The word for which the pronunciation is requested. */
  var text: String
  /** A voice that specifies the language in which the pronunciation is to be returned. All voices for the same language (for example, `en-US`) return the same translation. */
  var voice: js.UndefOr[
    typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice | String
  ] = js.undefined
}

object GetPronunciationParams {
  @scala.inline
  def apply(
    text: String,
    customization_id: String = null,
    format: Format | String = null,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    voice: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice | String = null
  ): GetPronunciationParams = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (customization_id != null) __obj.updateDynamic("customization_id")(customization_id.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.get.asInstanceOf[js.Any])
    if (voice != null) __obj.updateDynamic("voice")(voice.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPronunciationParams]
  }
}

