package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Tokenization options. */
@js.native
trait SyntaxOptionsTokens extends js.Object {
  
  /** Set this to `true` to return the lemma for each token. */
  var lemma: js.UndefOr[Boolean] = js.native
  
  /** Set this to `true` to return the part of speech for each token. */
  var part_of_speech: js.UndefOr[Boolean] = js.native
}
object SyntaxOptionsTokens {
  
  @scala.inline
  def apply(): SyntaxOptionsTokens = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyntaxOptionsTokens]
  }
  
  @scala.inline
  implicit class SyntaxOptionsTokensOps[Self <: SyntaxOptionsTokens] (val x: Self) extends AnyVal {
    
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
    def setLemma(value: Boolean): Self = this.set("lemma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLemma: Self = this.set("lemma", js.undefined)
    
    @scala.inline
    def setPart_of_speech(value: Boolean): Self = this.set("part_of_speech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePart_of_speech: Self = this.set("part_of_speech", js.undefined)
  }
}
