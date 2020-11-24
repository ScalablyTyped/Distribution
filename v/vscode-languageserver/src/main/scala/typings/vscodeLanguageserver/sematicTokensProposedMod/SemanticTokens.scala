package typings.vscodeLanguageserver.sematicTokensProposedMod

import typings.vscodeLanguageserver.anon.On
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SemanticTokens extends js.Object {
  
  var semanticTokens: On = js.native
}
object SemanticTokens {
  
  @scala.inline
  def apply(semanticTokens: On): SemanticTokens = {
    val __obj = js.Dynamic.literal(semanticTokens = semanticTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokens]
  }
  
  @scala.inline
  implicit class SemanticTokensOps[Self <: SemanticTokens] (val x: Self) extends AnyVal {
    
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
    def setSemanticTokens(value: On): Self = this.set("semanticTokens", value.asInstanceOf[js.Any])
  }
}
