package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Tokens and sentences returned from syntax analysis. */
@js.native
trait SyntaxResult extends js.Object {
  
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
  implicit class SyntaxResultOps[Self <: SyntaxResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSentencesVarargs(value: SentenceResult*): Self = this.set("sentences", js.Array(value :_*))
    
    @scala.inline
    def setSentences(value: js.Array[SentenceResult]): Self = this.set("sentences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentences: Self = this.set("sentences", js.undefined)
    
    @scala.inline
    def setTokensVarargs(value: TokenResult*): Self = this.set("tokens", js.Array(value :_*))
    
    @scala.inline
    def setTokens(value: js.Array[TokenResult]): Self = this.set("tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokens: Self = this.set("tokens", js.undefined)
  }
}
