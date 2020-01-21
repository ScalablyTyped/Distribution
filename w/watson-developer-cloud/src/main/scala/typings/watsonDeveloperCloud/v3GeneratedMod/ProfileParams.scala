package typings.watsonDeveloperCloud.v3GeneratedMod

import typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.AcceptLanguage
import typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.ContentLanguage
import typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.ContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * request interfaces
  ************************/
/** Parameters for the `profile` operation. */
trait ProfileParams extends js.Object {
  /** The desired language of the response. For two-character arguments, regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can specify any combination of languages for the input and response content. */
  var accept_language: js.UndefOr[AcceptLanguage | String] = js.undefined
  /** Indicates whether consumption preferences are returned with the results. By default, no consumption preferences are returned. */
  var consumption_preferences: js.UndefOr[Boolean] = js.undefined
  /** A maximum of 20 MB of content to analyze, though the service requires much less text; for more information, see [Providing sufficient input](https://cloud.ibm.com/docs/services/personality-insights/input.html#sufficient). For JSON input, provide an object of type `Content`. */
  var content: Content | String
  /** The language of the input text for the request: Arabic, English, Japanese, Korean, or Spanish. Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The effect of the **Content-Language** parameter depends on the **Content-Type** parameter. When **Content-Type** is `text/plain` or `text/html`, **Content-Language** is the only way to specify the language. When **Content-Type** is `application/json`, **Content-Language** overrides a language specified with the `language` parameter of a `ContentItem` object, and content items that specify a different language are ignored; omit this parameter to base the language on the specification of the content items. You can specify any combination of languages for **Content-Language** and **Accept-Language**. */
  var content_language: js.UndefOr[ContentLanguage | String] = js.undefined
  /** The type of the input. For more information, see **Content types** in the method description. Default: `text/plain`. */
  var content_type: js.UndefOr[ContentType | String] = js.undefined
  /** Indicates whether column labels are returned with a CSV response. By default, no column labels are returned. Applies only when the response type is CSV (`text/csv`). */
  var csv_headers: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  /** Indicates whether a raw score in addition to a normalized percentile is returned for each characteristic; raw scores are not compared with a sample population. By default, only normalized percentiles are returned. */
  var raw_scores: js.UndefOr[Boolean] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object ProfileParams {
  @scala.inline
  def apply(
    content: Content | String,
    accept_language: AcceptLanguage | String = null,
    consumption_preferences: js.UndefOr[Boolean] = js.undefined,
    content_language: ContentLanguage | String = null,
    content_type: ContentType | String = null,
    csv_headers: js.UndefOr[Boolean] = js.undefined,
    headers: js.Object = null,
    raw_scores: js.UndefOr[Boolean] = js.undefined,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): ProfileParams = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (accept_language != null) __obj.updateDynamic("accept_language")(accept_language.asInstanceOf[js.Any])
    if (!js.isUndefined(consumption_preferences)) __obj.updateDynamic("consumption_preferences")(consumption_preferences.asInstanceOf[js.Any])
    if (content_language != null) __obj.updateDynamic("content_language")(content_language.asInstanceOf[js.Any])
    if (content_type != null) __obj.updateDynamic("content_type")(content_type.asInstanceOf[js.Any])
    if (!js.isUndefined(csv_headers)) __obj.updateDynamic("csv_headers")(csv_headers.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(raw_scores)) __obj.updateDynamic("raw_scores")(raw_scores.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileParams]
  }
}

