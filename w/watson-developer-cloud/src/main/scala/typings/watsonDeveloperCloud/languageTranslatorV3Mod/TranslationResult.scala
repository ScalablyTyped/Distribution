package typings.watsonDeveloperCloud.languageTranslatorV3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TranslationResult. */
trait TranslationResult extends StObject {
  
  /** Number of characters in the input text. */
  var character_count: Double
  
  /** List of translation output in UTF-8, corresponding to the input text entries. */
  var translations: js.Array[Translation]
  
  /** Number of words in the input text. */
  var word_count: Double
}
object TranslationResult {
  
  inline def apply(character_count: Double, translations: js.Array[Translation], word_count: Double): TranslationResult = {
    val __obj = js.Dynamic.literal(character_count = character_count.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], word_count = word_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TranslationResult] (val x: Self) extends AnyVal {
    
    inline def setCharacter_count(value: Double): Self = StObject.set(x, "character_count", value.asInstanceOf[js.Any])
    
    inline def setTranslations(value: js.Array[Translation]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setTranslationsVarargs(value: Translation*): Self = StObject.set(x, "translations", js.Array(value*))
    
    inline def setWord_count(value: Double): Self = StObject.set(x, "word_count", value.asInstanceOf[js.Any])
  }
}
