package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `synthesize` operation. */
trait SynthesizeParams extends js.Object {
  /** The requested format (MIME type) of the audio. You can use the `Accept` header or the `accept` parameter to specify the audio format. For more information about specifying an audio format, see **Audio formats (accept types)** in the method description. Default: `audio/ogg;codecs=opus`. */
  var accept: js.UndefOr[Accept | String] = js.undefined
  /** The customization ID (GUID) of a custom voice model to use for the synthesis. If a custom voice model is specified, it is guaranteed to work only if it matches the language of the indicated voice. You must make the request with service credentials created for the instance of the service that owns the custom model. Omit the parameter to use the specified voice with no customization. */
  var customization_id: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** The text to synthesize. */
  var text: String
  /** The voice to use for synthesis. */
  var voice: js.UndefOr[
    typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice | String
  ] = js.undefined
}

object SynthesizeParams {
  @scala.inline
  def apply(
    text: String,
    accept: Accept | String = null,
    customization_id: String = null,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    voice: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice | String = null
  ): SynthesizeParams = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (customization_id != null) __obj.updateDynamic("customization_id")(customization_id.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.get.asInstanceOf[js.Any])
    if (voice != null) __obj.updateDynamic("voice")(voice.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynthesizeParams]
  }
}

