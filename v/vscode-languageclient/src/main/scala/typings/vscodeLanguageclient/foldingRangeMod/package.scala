package typings.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object foldingRangeMod {
  type ProvideFoldingRangeSignature = js.Function3[
    /* document */ typings.vscode.mod.TextDocument, 
    /* context */ typings.vscode.mod.FoldingContext, 
    /* token */ typings.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.FoldingRange]]
  ]
}
