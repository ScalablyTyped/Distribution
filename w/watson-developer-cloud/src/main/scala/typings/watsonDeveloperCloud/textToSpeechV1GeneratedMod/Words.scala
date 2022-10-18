package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Words. */
trait Words extends StObject {
  
  /** The **Add custom words** method accepts an array of `Word` objects. Each object provides a word that is to be added or updated for the custom voice model and the word's translation. The **List custom words** method returns an array of `Word` objects. Each object shows a word and its translation from the custom voice model. The words are listed in alphabetical order, with uppercase letters listed before lowercase letters. The array is empty if the custom model contains no words. */
  var words: js.Array[Word]
}
object Words {
  
  inline def apply(words: js.Array[Word]): Words = {
    val __obj = js.Dynamic.literal(words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Words]
  }
  
  extension [Self <: Words](x: Self) {
    
    inline def setWords(value: js.Array[Word]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    inline def setWordsVarargs(value: Word*): Self = StObject.set(x, "words", js.Array(value*))
  }
}
