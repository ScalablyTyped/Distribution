package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * request interfaces
  ************************/
/** Parameters for the `analyze` operation. */
trait AnalyzeParams extends StObject {
  
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
  
  inline def apply(features: Features): AnalyzeParams = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzeParams]
  }
  
  extension [Self <: AnalyzeParams](x: Self) {
    
    inline def setClean(value: Boolean): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
    
    inline def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
    
    inline def setFallback_to_raw(value: Boolean): Self = StObject.set(x, "fallback_to_raw", value.asInstanceOf[js.Any])
    
    inline def setFallback_to_rawUndefined: Self = StObject.set(x, "fallback_to_raw", js.undefined)
    
    inline def setFeatures(value: Features): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLimit_text_characters(value: Double): Self = StObject.set(x, "limit_text_characters", value.asInstanceOf[js.Any])
    
    inline def setLimit_text_charactersUndefined: Self = StObject.set(x, "limit_text_characters", js.undefined)
    
    inline def setReturn_analyzed_text(value: Boolean): Self = StObject.set(x, "return_analyzed_text", value.asInstanceOf[js.Any])
    
    inline def setReturn_analyzed_textUndefined: Self = StObject.set(x, "return_analyzed_text", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setXpath(value: String): Self = StObject.set(x, "xpath", value.asInstanceOf[js.Any])
    
    inline def setXpathUndefined: Self = StObject.set(x, "xpath", js.undefined)
  }
}
