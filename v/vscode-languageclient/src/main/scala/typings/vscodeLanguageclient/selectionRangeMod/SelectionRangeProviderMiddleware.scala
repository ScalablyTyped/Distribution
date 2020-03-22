package typings.vscodeLanguageclient.selectionRangeMod

import typings.vscode.mod.Position
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.SelectionRange
import typings.vscode.mod.TextDocument
import typings.vscodeJsonrpc.cancellationMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionRangeProviderMiddleware extends js.Object {
  var provideSelectionRanges: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* positions */ js.Array[Position], 
      /* token */ CancellationToken, 
      /* next */ ProvideSelectionRangeSignature, 
      ProviderResult[js.Array[SelectionRange]]
    ]
  ] = js.undefined
}

object SelectionRangeProviderMiddleware {
  @scala.inline
  def apply(
    provideSelectionRanges: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* positions */ js.Array[Position], 
      /* token */ CancellationToken, 
      /* next */ ProvideSelectionRangeSignature, 
      ProviderResult[js.Array[SelectionRange]]
    ] = null
  ): SelectionRangeProviderMiddleware = {
    val __obj = js.Dynamic.literal()
    if (provideSelectionRanges != null) __obj.updateDynamic("provideSelectionRanges")(provideSelectionRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionRangeProviderMiddleware]
  }
}

