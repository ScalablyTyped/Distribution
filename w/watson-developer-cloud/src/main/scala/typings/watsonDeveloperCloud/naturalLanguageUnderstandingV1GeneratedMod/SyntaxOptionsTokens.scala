package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Tokenization options. */
trait SyntaxOptionsTokens extends StObject {
  
  /** Set this to `true` to return the lemma for each token. */
  var lemma: js.UndefOr[Boolean] = js.undefined
  
  /** Set this to `true` to return the part of speech for each token. */
  var part_of_speech: js.UndefOr[Boolean] = js.undefined
}
object SyntaxOptionsTokens {
  
  inline def apply(): SyntaxOptionsTokens = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyntaxOptionsTokens]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyntaxOptionsTokens] (val x: Self) extends AnyVal {
    
    inline def setLemma(value: Boolean): Self = StObject.set(x, "lemma", value.asInstanceOf[js.Any])
    
    inline def setLemmaUndefined: Self = StObject.set(x, "lemma", js.undefined)
    
    inline def setPart_of_speech(value: Boolean): Self = StObject.set(x, "part_of_speech", value.asInstanceOf[js.Any])
    
    inline def setPart_of_speechUndefined: Self = StObject.set(x, "part_of_speech", js.undefined)
  }
}
