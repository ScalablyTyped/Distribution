package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * request interfaces
  ************************/
/** Parameters for the `analyze` operation. */
@js.native
trait AnalyzeParams extends js.Object {
  /** Set this to `false` to disable webpage cleaning. To learn more about webpage cleaning, see the [Analyzing webpages](https://cloud.ibm.com/docs/services/natural-language-understanding/analyzing-webpages.html) documentation. */
  var clean: js.UndefOr[Boolean] = js.native
  /** Whether to use raw HTML content if text cleaning fails. */
  var fallback_to_raw: js.UndefOr[Boolean] = js.native
  /** Specific features to analyze the document for. */
  var features: Features = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** The HTML file to analyze. One of the `text`, `html`, or `url` parameters is required. */
  var html: js.UndefOr[String] = js.native
  /** ISO 639-1 code that specifies the language of your text. This overrides automatic language detection. Language support differs depending on the features you include in your analysis. See [Language support](https://www.bluemix.net/docs/services/natural-language-understanding/language-support.html) for more information. */
  var language: js.UndefOr[String] = js.native
  /** Sets the maximum number of characters that are processed by the service. */
  var limit_text_characters: js.UndefOr[Double] = js.native
  /** Whether or not to return the analyzed text. */
  var return_analyzed_text: js.UndefOr[Boolean] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** The plain text to analyze. One of the `text`, `html`, or `url` parameters is required. */
  var text: js.UndefOr[String] = js.native
  /** The webpage to analyze. One of the `text`, `html`, or `url` parameters is required. */
  var url: js.UndefOr[String] = js.native
  /** An [XPath query](https://cloud.ibm.com/docs/services/natural-language-understanding/analyzing-webpages.html#xpath) to perform on `html` or `url` input. Results of the query will be appended to the cleaned webpage text before it is analyzed. To analyze only the results of the XPath query, set the `clean` parameter to `false`. */
  var xpath: js.UndefOr[String] = js.native
}

object AnalyzeParams {
  @scala.inline
  def apply(features: Features): AnalyzeParams = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzeParams]
  }
  @scala.inline
  implicit class AnalyzeParamsOps[Self <: AnalyzeParams] (val x: Self) extends AnyVal {
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
    def setFeatures(value: Features): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def setClean(value: Boolean): Self = this.set("clean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClean: Self = this.set("clean", js.undefined)
    @scala.inline
    def setFallback_to_raw(value: Boolean): Self = this.set("fallback_to_raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallback_to_raw: Self = this.set("fallback_to_raw", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLimit_text_characters(value: Double): Self = this.set("limit_text_characters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit_text_characters: Self = this.set("limit_text_characters", js.undefined)
    @scala.inline
    def setReturn_analyzed_text(value: Boolean): Self = this.set("return_analyzed_text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_analyzed_text: Self = this.set("return_analyzed_text", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setXpath(value: String): Self = this.set("xpath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXpath: Self = this.set("xpath", js.undefined)
  }
  
}

