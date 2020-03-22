package typings.vscodeLanguageclient.semanticTokensProposedMod

import typings.vscode.mod.CancellationToken
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.Range
import typings.vscode.mod.TextDocument
import typings.vscodeLanguageclient.semanticTokensProposedMod.vscodeAugmentingMod.SemanticTokens
import typings.vscodeLanguageclient.semanticTokensProposedMod.vscodeAugmentingMod.SemanticTokensEdits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  ] = js.undefined
  var provideDocumentSemanticTokens: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* token */ CancellationToken, 
      /* next */ DocumentSemanticsTokensSignature, 
      ProviderResult[SemanticTokens]
    ]
  ] = js.undefined
  var provideDocumentSemanticTokensEdits: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* previousResultId */ String, 
      /* token */ CancellationToken, 
      /* next */ DocumentSemanticsTokensEditsSignature, 
      ProviderResult[SemanticTokensEdits | SemanticTokens]
    ]
  ] = js.undefined
}

object SemanticTokensMiddleware {
  @scala.inline
  def apply(
    provideDocumentRangeSemanticTokens: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* range */ Range, 
      /* token */ CancellationToken, 
      /* next */ DocumentRangeSemanticTokensSignature, 
      ProviderResult[SemanticTokens]
    ] = null,
    provideDocumentSemanticTokens: js.ThisFunction3[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* token */ CancellationToken, 
      /* next */ DocumentSemanticsTokensSignature, 
      ProviderResult[SemanticTokens]
    ] = null,
    provideDocumentSemanticTokensEdits: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* previousResultId */ String, 
      /* token */ CancellationToken, 
      /* next */ DocumentSemanticsTokensEditsSignature, 
      ProviderResult[SemanticTokensEdits | SemanticTokens]
    ] = null
  ): SemanticTokensMiddleware = {
    val __obj = js.Dynamic.literal()
    if (provideDocumentRangeSemanticTokens != null) __obj.updateDynamic("provideDocumentRangeSemanticTokens")(provideDocumentRangeSemanticTokens.asInstanceOf[js.Any])
    if (provideDocumentSemanticTokens != null) __obj.updateDynamic("provideDocumentSemanticTokens")(provideDocumentSemanticTokens.asInstanceOf[js.Any])
    if (provideDocumentSemanticTokensEdits != null) __obj.updateDynamic("provideDocumentSemanticTokensEdits")(provideDocumentSemanticTokensEdits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensMiddleware]
  }
}

