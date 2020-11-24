package typings.vscodeLanguageclient.semanticTokensProposedMod

import typings.vscode.mod.DocumentRangeSemanticTokensProvider
import typings.vscode.mod.DocumentSemanticTokensProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SemanticTokensProviders extends js.Object {
  
  var document: DocumentSemanticTokensProvider = js.native
  
  var range: js.UndefOr[DocumentRangeSemanticTokensProvider] = js.native
}
object SemanticTokensProviders {
  
  @scala.inline
  def apply(document: DocumentSemanticTokensProvider): SemanticTokensProviders = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensProviders]
  }
  
  @scala.inline
  implicit class SemanticTokensProvidersOps[Self <: SemanticTokensProviders] (val x: Self) extends AnyVal {
    
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
    def setDocument(value: DocumentSemanticTokensProvider): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: DocumentRangeSemanticTokensProvider): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
