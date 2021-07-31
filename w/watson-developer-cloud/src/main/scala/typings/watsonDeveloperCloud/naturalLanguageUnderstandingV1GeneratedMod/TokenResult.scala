package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TokenResult. */
trait TokenResult extends StObject {
  
  /** The [lemma](https://wikipedia.org/wiki/Lemma_%28morphology%29) of the token. */
  var lemma: js.UndefOr[String] = js.undefined
  
  /** Character offsets indicating the beginning and end of the token in the analyzed text. */
  var location: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** The part of speech of the token. For descriptions of the values, see [Universal Dependencies POS tags](https://universaldependencies.org/u/pos/). */
  var part_of_speech: js.UndefOr[String] = js.undefined
  
  /** The token as it appears in the analyzed text. */
  var text: js.UndefOr[String] = js.undefined
}
object TokenResult {
  
  @scala.inline
  def apply(): TokenResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenResult]
  }
  
  @scala.inline
  implicit class TokenResultMutableBuilder[Self <: TokenResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLemma(value: String): Self = StObject.set(x, "lemma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLemmaUndefined: Self = StObject.set(x, "lemma", js.undefined)
    
    @scala.inline
    def setLocation(value: js.Array[Double]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setLocationVarargs(value: Double*): Self = StObject.set(x, "location", js.Array(value :_*))
    
    @scala.inline
    def setPart_of_speech(value: String): Self = StObject.set(x, "part_of_speech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPart_of_speechUndefined: Self = StObject.set(x, "part_of_speech", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
