package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * request interfaces
  ************************/
/** Parameters for the `analyze` operation. */
trait AnalyzeParams extends js.Object {
  /** Set this to `false` to disable webpage cleaning. To learn more about webpage cleaning, see the [Analyzing webpages](https://cloud.ibm.com/docs/services/natural-language-understanding/analyzing-webpages.html) documentation. */
  var clean: js.UndefOr[Boolean] = js.undefined
  /** Whether to use raw HTML content if text cleaning fails. */
  var fallback_to_raw: js.UndefOr[Boolean] = js.undefined
  /** Specific features to analyze the document for. */
  var features: Features
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The HTML file to analyze. One of the `text`, `html`, or `url` parameters is required. */
  var html: js.UndefOr[String] = js.undefined
  /** ISO 639-1 code that specifies the language of your text. This overrides automatic language detection. Language support differs depending on the features you include in your analysis. See [Language support](https://www.bluemix.net/docs/services/natural-language-understanding/language-support.html) for more information. */
  var language: js.UndefOr[String] = js.undefined
  /** Sets the maximum number of characters that are processed by the service. */
  var limit_text_characters: js.UndefOr[Double] = js.undefined
  /** Whether or not to return the analyzed text. */
  var return_analyzed_text: js.UndefOr[Boolean] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** The plain text to analyze. One of the `text`, `html`, or `url` parameters is required. */
  var text: js.UndefOr[String] = js.undefined
  /** The webpage to analyze. One of the `text`, `html`, or `url` parameters is required. */
  var url: js.UndefOr[String] = js.undefined
  /** An [XPath query](https://cloud.ibm.com/docs/services/natural-language-understanding/analyzing-webpages.html#xpath) to perform on `html` or `url` input. Results of the query will be appended to the cleaned webpage text before it is analyzed. To analyze only the results of the XPath query, set the `clean` parameter to `false`. */
  var xpath: js.UndefOr[String] = js.undefined
}

object AnalyzeParams {
  @scala.inline
  def apply(
    features: Features,
    clean: js.UndefOr[Boolean] = js.undefined,
    fallback_to_raw: js.UndefOr[Boolean] = js.undefined,
    headers: js.Object = null,
    html: String = null,
    language: String = null,
    limit_text_characters: Int | Double = null,
    return_analyzed_text: js.UndefOr[Boolean] = js.undefined,
    return_response: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    url: String = null,
    xpath: String = null
  ): AnalyzeParams = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean.asInstanceOf[js.Any])
    if (!js.isUndefined(fallback_to_raw)) __obj.updateDynamic("fallback_to_raw")(fallback_to_raw.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (limit_text_characters != null) __obj.updateDynamic("limit_text_characters")(limit_text_characters.asInstanceOf[js.Any])
    if (!js.isUndefined(return_analyzed_text)) __obj.updateDynamic("return_analyzed_text")(return_analyzed_text.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (xpath != null) __obj.updateDynamic("xpath")(xpath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzeParams]
  }
}

