package typings.watsonDeveloperCloud.v3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TranslationResult. */
@js.native
trait TranslationResult extends StObject {
  
  /** Number of characters in the input text. */
  var character_count: Double = js.native
  
  /** List of translation output in UTF-8, corresponding to the input text entries. */
  var translations: js.Array[Translation] = js.native
  
  /** Number of words in the input text. */
  var word_count: Double = js.native
}
object TranslationResult {
  
  @scala.inline
  def apply(character_count: Double, translations: js.Array[Translation], word_count: Double): TranslationResult = {
    val __obj = js.Dynamic.literal(character_count = character_count.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], word_count = word_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslationResult]
  }
  
  @scala.inline
  implicit class TranslationResultMutableBuilder[Self <: TranslationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacter_count(value: Double): Self = StObject.set(x, "character_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslations(value: js.Array[Translation]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationsVarargs(value: Translation*): Self = StObject.set(x, "translations", js.Array(value :_*))
    
    @scala.inline
    def setWord_count(value: Double): Self = StObject.set(x, "word_count", value.asInstanceOf[js.Any])
  }
}
