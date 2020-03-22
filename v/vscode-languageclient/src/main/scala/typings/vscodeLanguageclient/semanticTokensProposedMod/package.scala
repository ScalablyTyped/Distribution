package typings.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object semanticTokensProposedMod {
  type DocumentRangeSemanticTokensSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* range */ typings.vscode.mod.Range, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[
      typings.vscodeLanguageclient.semanticTokensProposedMod.vscodeAugmentingMod.SemanticTokens
    ]
  ]
  type DocumentSemanticsTokensEditsSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* previousResultId */ java.lang.String, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[
      typings.vscodeLanguageclient.semanticTokensProposedMod.vscodeAugmentingMod.SemanticTokensEdits | typings.vscodeLanguageclient.semanticTokensProposedMod.vscodeAugmentingMod.SemanticTokens
    ]
  ]
  type DocumentSemanticsTokensSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[
      typings.vscodeLanguageclient.semanticTokensProposedMod.vscodeAugmentingMod.SemanticTokens
    ]
  ]
}
