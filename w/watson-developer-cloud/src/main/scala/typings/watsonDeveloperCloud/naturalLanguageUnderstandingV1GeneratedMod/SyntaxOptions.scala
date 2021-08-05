package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Returns tokens and sentences from the input text. */
trait SyntaxOptions extends StObject {
  
  /** Set this to `true` to return sentence information. */
  var sentences: js.UndefOr[Boolean] = js.undefined
  
  /** Tokenization options. */
  var tokens: js.UndefOr[SyntaxOptionsTokens] = js.undefined
}
object SyntaxOptions {
  
  inline def apply(): SyntaxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyntaxOptions]
  }
  
  extension [Self <: SyntaxOptions](x: Self) {
    
    inline def setSentences(value: Boolean): Self = StObject.set(x, "sentences", value.asInstanceOf[js.Any])
    
    inline def setSentencesUndefined: Self = StObject.set(x, "sentences", js.undefined)
    
    inline def setTokens(value: SyntaxOptionsTokens): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
  }
}
