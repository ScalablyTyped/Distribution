package typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage
import typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.ContentLanguage
import typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.ContentType
import typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.Tones
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * request interfaces
  ************************/
/** Parameters for the `tone` operation. */
trait ToneParams extends StObject {
  
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
  
  inline def apply(tone_input: ToneInput | String): ToneParams = {
    val __obj = js.Dynamic.literal(tone_input = tone_input.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToneParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToneParams] (val x: Self) extends AnyVal {
    
    inline def setAccept_language(value: AcceptLanguage | String): Self = StObject.set(x, "accept_language", value.asInstanceOf[js.Any])
    
    inline def setAccept_languageUndefined: Self = StObject.set(x, "accept_language", js.undefined)
    
    inline def setContent_language(value: ContentLanguage | String): Self = StObject.set(x, "content_language", value.asInstanceOf[js.Any])
    
    inline def setContent_languageUndefined: Self = StObject.set(x, "content_language", js.undefined)
    
    inline def setContent_type(value: ContentType | String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setSentences(value: Boolean): Self = StObject.set(x, "sentences", value.asInstanceOf[js.Any])
    
    inline def setSentencesUndefined: Self = StObject.set(x, "sentences", js.undefined)
    
    inline def setTone_input(value: ToneInput | String): Self = StObject.set(x, "tone_input", value.asInstanceOf[js.Any])
    
    inline def setTones(value: js.Array[String | Tones]): Self = StObject.set(x, "tones", value.asInstanceOf[js.Any])
    
    inline def setTonesUndefined: Self = StObject.set(x, "tones", js.undefined)
    
    inline def setTonesVarargs(value: (String | Tones)*): Self = StObject.set(x, "tones", js.Array(value*))
  }
}
