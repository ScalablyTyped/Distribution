package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * request interfaces
  ************************/
/** Parameters for the `analyze` operation. */
@js.native
trait AnalyzeParams extends StObject {
  
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
  implicit class AnalyzeParamsMutableBuilder[Self <: AnalyzeParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClean(value: Boolean): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
    
    @scala.inline
    def setFallback_to_raw(value: Boolean): Self = StObject.set(x, "fallback_to_raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallback_to_rawUndefined: Self = StObject.set(x, "fallback_to_raw", js.undefined)
    
    @scala.inline
    def setFeatures(value: Features): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLimit_text_characters(value: Double): Self = StObject.set(x, "limit_text_characters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit_text_charactersUndefined: Self = StObject.set(x, "limit_text_characters", js.undefined)
    
    @scala.inline
    def setReturn_analyzed_text(value: Boolean): Self = StObject.set(x, "return_analyzed_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_analyzed_textUndefined: Self = StObject.set(x, "return_analyzed_text", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setXpath(value: String): Self = StObject.set(x, "xpath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXpathUndefined: Self = StObject.set(x, "xpath", js.undefined)
  }
}
