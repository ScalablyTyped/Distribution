package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** CustomWord. */
trait CustomWord extends StObject {
  
  /** An alternative spelling for the custom word when it appears in a transcript. Use the parameter when you want the word to have a spelling that is different from its usual representation or from its spelling in corpora training data. */
  var display_as: js.UndefOr[String] = js.undefined
  
  /** An array of sounds-like pronunciations for the custom word. Specify how words that are difficult to pronounce, foreign words, acronyms, and so on can be pronounced by users. * For a word that is not in the service's base vocabulary, omit the parameter to have the service automatically generate a sounds-like pronunciation for the word. * For a word that is in the service's base vocabulary, use the parameter to specify additional pronunciations for the word. You cannot override the default pronunciation of a word; pronunciations you add augment the pronunciation from the base vocabulary. A word can have at most five sounds-like pronunciations. A pronunciation can include at most 40 characters not including spaces. */
  var sounds_like: js.UndefOr[js.Array[String]] = js.undefined
  
  /** For the **Add custom words** method, you must specify the custom word that is to be added to or updated in the custom model. Do not include spaces in the word. Use a `-` (dash) or `_` (underscore) to connect the tokens of compound words. Omit this parameter for the **Add a custom word** method. */
  var word: js.UndefOr[String] = js.undefined
}
object CustomWord {
  
  inline def apply(): CustomWord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomWord]
  }
  
  extension [Self <: CustomWord](x: Self) {
    
    inline def setDisplay_as(value: String): Self = StObject.set(x, "display_as", value.asInstanceOf[js.Any])
    
    inline def setDisplay_asUndefined: Self = StObject.set(x, "display_as", js.undefined)
    
    inline def setSounds_like(value: js.Array[String]): Self = StObject.set(x, "sounds_like", value.asInstanceOf[js.Any])
    
    inline def setSounds_likeUndefined: Self = StObject.set(x, "sounds_like", js.undefined)
    
    inline def setSounds_likeVarargs(value: String*): Self = StObject.set(x, "sounds_like", js.Array(value :_*))
    
    inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
    
    inline def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
  }
}
