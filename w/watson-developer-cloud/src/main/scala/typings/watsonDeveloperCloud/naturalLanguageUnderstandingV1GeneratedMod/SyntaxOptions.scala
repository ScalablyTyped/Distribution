package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Returns tokens and sentences from the input text. */
@js.native
trait SyntaxOptions extends js.Object {
  
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
  implicit class SyntaxOptionsOps[Self <: SyntaxOptions] (val x: Self) extends AnyVal {
    
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
    def setSentences(value: Boolean): Self = this.set("sentences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentences: Self = this.set("sentences", js.undefined)
    
    @scala.inline
    def setTokens(value: SyntaxOptionsTokens): Self = this.set("tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokens: Self = this.set("tokens", js.undefined)
  }
}
