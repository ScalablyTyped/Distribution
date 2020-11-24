package typings.vscodeLanguageclient.semanticTokensProposedMod

import typings.vscode.mod.CancellationToken
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.Range
import typings.vscode.mod.SemanticTokens
import typings.vscode.mod.SemanticTokensEdits
import typings.vscode.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SemanticTokensMiddleware extends js.Object {
  
  var provideDocumentRangeSemanticTokens: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* range */ Range, 
      /* token */ CancellationToken, 
      /* next */ DocumentRangeSemanticTokensSignature, 
      ProviderResult[SemanticTokens]
    ]
  ] = js.native
  
  var provideDocumentSemanticTokens: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* token */ CancellationToken, 
      /* next */ DocumentSemanticsTokensSignature, 
      ProviderResult[SemanticTokens]
    ]
  ] = js.native
  
  var provideDocumentSemanticTokensEdits: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* previousResultId */ String, 
      /* token */ CancellationToken, 
      /* next */ DocumentSemanticsTokensEditsSignature, 
      ProviderResult[SemanticTokensEdits | SemanticTokens]
    ]
  ] = js.native
}
object SemanticTokensMiddleware {
  
  @scala.inline
  def apply(): SemanticTokensMiddleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticTokensMiddleware]
  }
  
  @scala.inline
  implicit class SemanticTokensMiddlewareOps[Self <: SemanticTokensMiddleware] (val x: Self) extends AnyVal {
    
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
    def setProvideDocumentRangeSemanticTokens(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* range */ Range, 
          /* token */ CancellationToken, 
          /* next */ DocumentRangeSemanticTokensSignature, 
          ProviderResult[SemanticTokens]
        ]
    ): Self = this.set("provideDocumentRangeSemanticTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvideDocumentRangeSemanticTokens: Self = this.set("provideDocumentRangeSemanticTokens", js.undefined)
    
    @scala.inline
    def setProvideDocumentSemanticTokens(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* token */ CancellationToken, 
          /* next */ DocumentSemanticsTokensSignature, 
          ProviderResult[SemanticTokens]
        ]
    ): Self = this.set("provideDocumentSemanticTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvideDocumentSemanticTokens: Self = this.set("provideDocumentSemanticTokens", js.undefined)
    
    @scala.inline
    def setProvideDocumentSemanticTokensEdits(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* previousResultId */ String, 
          /* token */ CancellationToken, 
          /* next */ DocumentSemanticsTokensEditsSignature, 
          ProviderResult[SemanticTokensEdits | SemanticTokens]
        ]
    ): Self = this.set("provideDocumentSemanticTokensEdits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvideDocumentSemanticTokensEdits: Self = this.set("provideDocumentSemanticTokensEdits", js.undefined)
  }
}
