package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Words. */
@js.native
trait Words extends StObject {
  
  /** An array of `Word` objects that provides information about each word in the custom model's words resource. The array is empty if the custom model has no words. */
  var words: js.Array[Word] = js.native
}
object Words {
  
  @scala.inline
  def apply(words: js.Array[Word]): Words = {
    val __obj = js.Dynamic.literal(words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Words]
  }
  
  @scala.inline
  implicit class WordsMutableBuilder[Self <: Words] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWords(value: js.Array[Word]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordsVarargs(value: Word*): Self = StObject.set(x, "words", js.Array(value :_*))
  }
}
