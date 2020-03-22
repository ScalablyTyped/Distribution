package typings.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object selectionRangeMod {
  type ProvideSelectionRangeSignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typings.vscode.mod.TextDocument, 
    /* positions */ js.Array[typings.vscode.mod.Position], 
    /* token */ typings.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.SelectionRange]]
  ]
}
