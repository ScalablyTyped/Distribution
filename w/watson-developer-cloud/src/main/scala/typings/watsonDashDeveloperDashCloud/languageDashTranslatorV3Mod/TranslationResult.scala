package typings.watsonDashDeveloperDashCloud.languageDashTranslatorV3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TranslationResult. */
trait TranslationResult extends js.Object {
  /** Number of characters in the input text. */
  var character_count: Double
  /** List of translation output in UTF-8, corresponding to the input text entries. */
  var translations: js.Array[Translation]
  /** Number of words in the input text. */
  var word_count: Double
}

object TranslationResult {
  @scala.inline
  def apply(character_count: Double, translations: js.Array[Translation], word_count: Double): TranslationResult = {
    val __obj = js.Dynamic.literal(character_count = character_count.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], word_count = word_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TranslationResult]
  }
}

