package typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod

import typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.AcceptLanguage
import typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.ContentLanguage
import typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.ContentType
import typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.Tones
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * request interfaces
  ************************/
/** Parameters for the `tone` operation. */
trait ToneParams extends js.Object {
  /** The desired language of the response. For two-character arguments, regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can use different languages for **Content-Language** and **Accept-Language**. */
  var accept_language: js.UndefOr[AcceptLanguage | String] = js.undefined
  /** The language of the input text for the request: English or French. Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The input content must match the specified language. Do not submit content that contains both languages. You can use different languages for **Content-Language** and **Accept-Language**. * **`2017-09-21`:** Accepts `en` or `fr`. * **`2016-05-19`:** Accepts only `en`. */
  var content_language: js.UndefOr[ContentLanguage | String] = js.undefined
  /** The type of the input. A character encoding can be specified by including a `charset` parameter. For example, 'text/plain;charset=utf-8'. */
  var content_type: js.UndefOr[ContentType | String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether the service is to return an analysis of each individual sentence in addition to its analysis of the full document. If `true` (the default), the service returns results for each sentence. */
  var sentences: js.UndefOr[Boolean] = js.undefined
  /** JSON, plain text, or HTML input that contains the content to be analyzed. For JSON input, provide an object of type `ToneInput`. */
  var tone_input: ToneInput | String
  /** **`2017-09-21`:** Deprecated. The service continues to accept the parameter for backward-compatibility, but the parameter no longer affects the response. **`2016-05-19`:** A comma-separated list of tones for which the service is to return its analysis of the input; the indicated tones apply both to the full document and to individual sentences of the document. You can specify one or more of the valid values. Omit the parameter to request results for all three tones. */
  var tones: js.UndefOr[js.Array[String | Tones]] = js.undefined
}

object ToneParams {
  @scala.inline
  def apply(
    tone_input: ToneInput | String,
    accept_language: AcceptLanguage | String = null,
    content_language: ContentLanguage | String = null,
    content_type: ContentType | String = null,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    sentences: js.UndefOr[Boolean] = js.undefined,
    tones: js.Array[String | Tones] = null
  ): ToneParams = {
    val __obj = js.Dynamic.literal(tone_input = tone_input.asInstanceOf[js.Any])
    if (accept_language != null) __obj.updateDynamic("accept_language")(accept_language.asInstanceOf[js.Any])
    if (content_language != null) __obj.updateDynamic("content_language")(content_language.asInstanceOf[js.Any])
    if (content_type != null) __obj.updateDynamic("content_type")(content_type.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    if (!js.isUndefined(sentences)) __obj.updateDynamic("sentences")(sentences)
    if (tones != null) __obj.updateDynamic("tones")(tones)
    __obj.asInstanceOf[ToneParams]
  }
}

