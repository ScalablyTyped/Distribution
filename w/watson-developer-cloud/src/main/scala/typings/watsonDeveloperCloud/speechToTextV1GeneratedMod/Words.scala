package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Words. */
trait Words extends StObject {
  
  /** An array of `Word` objects that provides information about each word in the custom model's words resource. The array is empty if the custom model has no words. */
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
