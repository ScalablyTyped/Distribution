package typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage
import typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.ContentLanguage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `toneChat` operation. */
trait ToneChatParams extends StObject {
  
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
  
  inline def apply(utterances: js.Array[Utterance]): ToneChatParams = {
    val __obj = js.Dynamic.literal(utterances = utterances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToneChatParams]
  }
  
  extension [Self <: ToneChatParams](x: Self) {
    
    inline def setAccept_language(value: AcceptLanguage | String): Self = StObject.set(x, "accept_language", value.asInstanceOf[js.Any])
    
    inline def setAccept_languageUndefined: Self = StObject.set(x, "accept_language", js.undefined)
    
    inline def setContent_language(value: ContentLanguage | String): Self = StObject.set(x, "content_language", value.asInstanceOf[js.Any])
    
    inline def setContent_languageUndefined: Self = StObject.set(x, "content_language", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setUtterances(value: js.Array[Utterance]): Self = StObject.set(x, "utterances", value.asInstanceOf[js.Any])
    
    inline def setUtterancesVarargs(value: Utterance*): Self = StObject.set(x, "utterances", js.Array(value*))
  }
}
