package typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage
import typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.ContentLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `toneChat` operation. */
trait ToneChatParams extends js.Object {
  /** The desired language of the response. For two-character arguments, regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can use different languages for **Content-Language** and **Accept-Language**. */
  var accept_language: js.UndefOr[AcceptLanguage | String] = js.undefined
  /** The language of the input text for the request: English or French. Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The input content must match the specified language. Do not submit content that contains both languages. You can use different languages for **Content-Language** and **Accept-Language**. * **`2017-09-21`:** Accepts `en` or `fr`. * **`2016-05-19`:** Accepts only `en`. */
  var content_language: js.UndefOr[ContentLanguage | String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** An array of `Utterance` objects that provides the input content that the service is to analyze. */
  var utterances: js.Array[Utterance]
}

object ToneChatParams {
  @scala.inline
  def apply(
    utterances: js.Array[Utterance],
    accept_language: AcceptLanguage | String = null,
    content_language: ContentLanguage | String = null,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): ToneChatParams = {
    val __obj = js.Dynamic.literal(utterances = utterances.asInstanceOf[js.Any])
    if (accept_language != null) __obj.updateDynamic("accept_language")(accept_language.asInstanceOf[js.Any])
    if (content_language != null) __obj.updateDynamic("content_language")(content_language.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToneChatParams]
  }
}

