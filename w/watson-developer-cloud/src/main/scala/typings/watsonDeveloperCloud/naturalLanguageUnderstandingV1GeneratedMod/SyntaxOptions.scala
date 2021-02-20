package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Returns tokens and sentences from the input text. */
@js.native
trait SyntaxOptions extends StObject {
  
  /** Set this to `true` to return sentence information. */
  var sentences: js.UndefOr[Boolean] = js.native
  
  /** Tokenization options. */
  var tokens: js.UndefOr[SyntaxOptionsTokens] = js.native
}
object SyntaxOptions {
  
  @scala.inline
  def apply(): SyntaxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyntaxOptions]
  }
  
  @scala.inline
  implicit class SyntaxOptionsMutableBuilder[Self <: SyntaxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSentences(value: Boolean): Self = StObject.set(x, "sentences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentencesUndefined: Self = StObject.set(x, "sentences", js.undefined)
    
    @scala.inline
    def setTokens(value: SyntaxOptionsTokens): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
  }
}
