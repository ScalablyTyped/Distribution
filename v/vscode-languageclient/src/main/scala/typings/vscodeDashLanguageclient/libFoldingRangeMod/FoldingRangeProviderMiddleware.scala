package typings.vscodeDashLanguageclient.libFoldingRangeMod

import typings.vscode.vscodeMod.FoldingContext
import typings.vscode.vscodeMod.FoldingRange
import typings.vscode.vscodeMod.ProviderResult
import typings.vscode.vscodeMod.TextDocument
import typings.vscodeDashJsonrpc.libCancellationMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldingRangeProviderMiddleware extends js.Object {
  var provideFoldingRanges: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* context */ FoldingContext, 
      /* token */ CancellationToken, 
      /* next */ ProvideFoldingRangeSignature, 
      ProviderResult[js.Array[FoldingRange]]
    ]
  ] = js.undefined
}

object FoldingRangeProviderMiddleware {
  @scala.inline
  def apply(
    provideFoldingRanges: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* context */ FoldingContext, 
      /* token */ CancellationToken, 
      /* next */ ProvideFoldingRangeSignature, 
      ProviderResult[js.Array[FoldingRange]]
    ] = null
  ): FoldingRangeProviderMiddleware = {
    val __obj = js.Dynamic.literal()
    if (provideFoldingRanges != null) __obj.updateDynamic("provideFoldingRanges")(provideFoldingRanges)
    __obj.asInstanceOf[FoldingRangeProviderMiddleware]
  }
}

