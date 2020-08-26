package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `getPronunciation` operation. */
@js.native
trait GetPronunciationParams extends js.Object {
  /** The customization ID (GUID) of a custom voice model for which the pronunciation is to be returned. The language of a specified custom model must match the language of the specified voice. If the word is not defined in the specified custom model, the service returns the default translation for the custom model's language. You must make the request with service credentials created for the instance of the service that owns the custom model. Omit the parameter to see the translation for the specified voice with no customization. */
  var customization_id: js.UndefOr[String] = js.native
  /** The phoneme format in which to return the pronunciation. Omit the parameter to obtain the pronunciation in the default format. */
  var format: js.UndefOr[Format | String] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** The word for which the pronunciation is requested. */
  var text: String = js.native
  /** A voice that specifies the language in which the pronunciation is to be returned. All voices for the same language (for example, `en-US`) return the same translation. */
  var voice: js.UndefOr[
    typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice | String
  ] = js.native
}

object GetPronunciationParams {
  @scala.inline
  def apply(text: String): GetPronunciationParams = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPronunciationParams]
  }
  @scala.inline
  implicit class GetPronunciationParamsOps[Self <: GetPronunciationParams] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomization_id(value: String): Self = this.set("customization_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomization_id: Self = this.set("customization_id", js.undefined)
    @scala.inline
    def setFormat(value: Format | String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
    @scala.inline
    def setVoice(
      value: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice | String
    ): Self = this.set("voice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoice: Self = this.set("voice", js.undefined)
  }
  
}

