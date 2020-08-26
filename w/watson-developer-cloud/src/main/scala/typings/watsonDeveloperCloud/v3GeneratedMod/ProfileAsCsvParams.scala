package typings.watsonDeveloperCloud.v3GeneratedMod

import typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage
import typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.ContentLanguage
import typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.ContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `profileAsCsv` operation. */
@js.native
trait ProfileAsCsvParams extends js.Object {
  /** The desired language of the response. For two-character arguments, regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can specify any combination of languages for the input and response content. */
  var accept_language: js.UndefOr[AcceptLanguage | String] = js.native
  /** Indicates whether consumption preferences are returned with the results. By default, no consumption preferences are returned. */
  var consumption_preferences: js.UndefOr[Boolean] = js.native
  /** A maximum of 20 MB of content to analyze, though the service requires much less text; for more information, see [Providing sufficient input](https://cloud.ibm.com/docs/services/personality-insights/input.html#sufficient). For JSON input, provide an object of type `Content`. */
  var content: Content | String = js.native
  /** The language of the input text for the request: Arabic, English, Japanese, Korean, or Spanish. Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The effect of the **Content-Language** parameter depends on the **Content-Type** parameter. When **Content-Type** is `text/plain` or `text/html`, **Content-Language** is the only way to specify the language. When **Content-Type** is `application/json`, **Content-Language** overrides a language specified with the `language` parameter of a `ContentItem` object, and content items that specify a different language are ignored; omit this parameter to base the language on the specification of the content items. You can specify any combination of languages for **Content-Language** and **Accept-Language**. */
  var content_language: js.UndefOr[ContentLanguage | String] = js.native
  /** The type of the input. For more information, see **Content types** in the method description. Default: `text/plain`. */
  var content_type: js.UndefOr[ContentType | String] = js.native
  /** Indicates whether column labels are returned with a CSV response. By default, no column labels are returned. Applies only when the response type is CSV (`text/csv`). */
  var csv_headers: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** Indicates whether a raw score in addition to a normalized percentile is returned for each characteristic; raw scores are not compared with a sample population. By default, only normalized percentiles are returned. */
  var raw_scores: js.UndefOr[Boolean] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
}

object ProfileAsCsvParams {
  @scala.inline
  def apply(content: Content | String): ProfileAsCsvParams = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileAsCsvParams]
  }
  @scala.inline
  implicit class ProfileAsCsvParamsOps[Self <: ProfileAsCsvParams] (val x: Self) extends AnyVal {
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
    def setContent(value: Content | String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccept_language(value: AcceptLanguage | String): Self = this.set("accept_language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept_language: Self = this.set("accept_language", js.undefined)
    @scala.inline
    def setConsumption_preferences(value: Boolean): Self = this.set("consumption_preferences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumption_preferences: Self = this.set("consumption_preferences", js.undefined)
    @scala.inline
    def setContent_language(value: ContentLanguage | String): Self = this.set("content_language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent_language: Self = this.set("content_language", js.undefined)
    @scala.inline
    def setContent_type(value: ContentType | String): Self = this.set("content_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent_type: Self = this.set("content_type", js.undefined)
    @scala.inline
    def setCsv_headers(value: Boolean): Self = this.set("csv_headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsv_headers: Self = this.set("csv_headers", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setRaw_scores(value: Boolean): Self = this.set("raw_scores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw_scores: Self = this.set("raw_scores", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
  
}

