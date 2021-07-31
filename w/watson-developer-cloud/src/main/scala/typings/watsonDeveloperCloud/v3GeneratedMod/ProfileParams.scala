package typings.watsonDeveloperCloud.v3GeneratedMod

import typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.AcceptLanguage
import typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.ContentLanguage
import typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.ContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * request interfaces
  ************************/
/** Parameters for the `profile` operation. */
trait ProfileParams extends StObject {
  
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
  def apply(content: Content | String): ProfileParams = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileParams]
  }
  
  @scala.inline
  implicit class ProfileParamsMutableBuilder[Self <: ProfileParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept_language(value: AcceptLanguage | String): Self = StObject.set(x, "accept_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccept_languageUndefined: Self = StObject.set(x, "accept_language", js.undefined)
    
    @scala.inline
    def setConsumption_preferences(value: Boolean): Self = StObject.set(x, "consumption_preferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumption_preferencesUndefined: Self = StObject.set(x, "consumption_preferences", js.undefined)
    
    @scala.inline
    def setContent(value: Content | String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_language(value: ContentLanguage | String): Self = StObject.set(x, "content_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_languageUndefined: Self = StObject.set(x, "content_language", js.undefined)
    
    @scala.inline
    def setContent_type(value: ContentType | String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
    
    @scala.inline
    def setCsv_headers(value: Boolean): Self = StObject.set(x, "csv_headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsv_headersUndefined: Self = StObject.set(x, "csv_headers", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setRaw_scores(value: Boolean): Self = StObject.set(x, "raw_scores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw_scoresUndefined: Self = StObject.set(x, "raw_scores", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
