package typings.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object semanticTokensProposedMod {
  
  type DocumentRangeSemanticTokensSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* range */ typings.vscode.mod.Range, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.SemanticTokens]
  ]
  
  type DocumentSemanticsTokensEditsSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* previousResultId */ java.lang.String, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.SemanticTokensEdits | typings.vscode.mod.SemanticTokens]
  ]
  
  type DocumentSemanticsTokensSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* token */ typings.vscode.mod.CancellationToken, 
    typings.vscode.mod.ProviderResult[typings.vscode.mod.SemanticTokens]
  ]
}
