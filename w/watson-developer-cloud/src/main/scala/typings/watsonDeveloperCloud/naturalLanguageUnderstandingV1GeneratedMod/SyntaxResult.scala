package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Tokens and sentences returned from syntax analysis. */
@js.native
trait SyntaxResult extends StObject {
  
  var sentences: js.UndefOr[js.Array[SentenceResult]] = js.native
  
  var tokens: js.UndefOr[js.Array[TokenResult]] = js.native
}
object SyntaxResult {
  
  @scala.inline
  def apply(): SyntaxResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyntaxResult]
  }
  
  @scala.inline
  implicit class SyntaxResultMutableBuilder[Self <: SyntaxResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSentences(value: js.Array[SentenceResult]): Self = StObject.set(x, "sentences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentencesUndefined: Self = StObject.set(x, "sentences", js.undefined)
    
    @scala.inline
    def setSentencesVarargs(value: SentenceResult*): Self = StObject.set(x, "sentences", js.Array(value :_*))
    
    @scala.inline
    def setTokens(value: js.Array[TokenResult]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    
    @scala.inline
    def setTokensVarargs(value: TokenResult*): Self = StObject.set(x, "tokens", js.Array(value :_*))
  }
}
