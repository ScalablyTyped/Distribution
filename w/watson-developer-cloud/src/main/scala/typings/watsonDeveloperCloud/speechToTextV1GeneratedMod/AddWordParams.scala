package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `addWord` operation. */
trait AddWordParams extends StObject {
  
  /** The customization ID (GUID) of the custom language model that is to be used for the request. You must make the request with credentials for the instance of the service that owns the custom model. */
  var customization_id: String
  
  /** An alternative spelling for the custom word when it appears in a transcript. Use the parameter when you want the word to have a spelling that is different from its usual representation or from its spelling in corpora training data. */
  var display_as: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** An array of sounds-like pronunciations for the custom word. Specify how words that are difficult to pronounce, foreign words, acronyms, and so on can be pronounced by users. * For a word that is not in the service's base vocabulary, omit the parameter to have the service automatically generate a sounds-like pronunciation for the word. * For a word that is in the service's base vocabulary, use the parameter to specify additional pronunciations for the word. You cannot override the default pronunciation of a word; pronunciations you add augment the pronunciation from the base vocabulary. A word can have at most five sounds-like pronunciations. A pronunciation can include at most 40 characters not including spaces. */
  var sounds_like: js.UndefOr[js.Array[String]] = js.undefined
  
  /** For the **Add custom words** method, you must specify the custom word that is to be added to or updated in the custom model. Do not include spaces in the word. Use a `-` (dash) or `_` (underscore) to connect the tokens of compound words. Omit this parameter for the **Add a custom word** method. */
  var word: js.UndefOr[String] = js.undefined
  
  /** The custom word that is to be added to or updated in the custom language model. Do not include spaces in the word. Use a `-` (dash) or `_` (underscore) to connect the tokens of compound words. URL-encode the word if it includes non-ASCII characters. For more information, see [Character encoding](https://cloud.ibm.com/docs/services/speech-to-text/language-resource.html#charEncoding). */
  var word_name: String
}
object AddWordParams {
  
  inline def apply(customization_id: String, word_name: String): AddWordParams = {
    val __obj = js.Dynamic.literal(customization_id = customization_id.asInstanceOf[js.Any], word_name = word_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddWordParams]
  }
  
  extension [Self <: AddWordParams](x: Self) {
    
    inline def setCustomization_id(value: String): Self = StObject.set(x, "customization_id", value.asInstanceOf[js.Any])
    
    inline def setDisplay_as(value: String): Self = StObject.set(x, "display_as", value.asInstanceOf[js.Any])
    
    inline def setDisplay_asUndefined: Self = StObject.set(x, "display_as", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setSounds_like(value: js.Array[String]): Self = StObject.set(x, "sounds_like", value.asInstanceOf[js.Any])
    
    inline def setSounds_likeUndefined: Self = StObject.set(x, "sounds_like", js.undefined)
    
    inline def setSounds_likeVarargs(value: String*): Self = StObject.set(x, "sounds_like", js.Array(value :_*))
    
    inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
    
    inline def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
    
    inline def setWord_name(value: String): Self = StObject.set(x, "word_name", value.asInstanceOf[js.Any])
  }
}
