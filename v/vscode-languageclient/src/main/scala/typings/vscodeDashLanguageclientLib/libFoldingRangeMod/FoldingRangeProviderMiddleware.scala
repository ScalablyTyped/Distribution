package typings
package vscodeDashLanguageclientLib.libFoldingRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldingRangeProviderMiddleware extends js.Object {
  var provideFoldingRanges: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* context */ vscodeLib.vscodeMod.FoldingContext, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideFoldingRangeSignature, 
      vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.FoldingRange]]
    ]
  ] = js.undefined
}

object FoldingRangeProviderMiddleware {
  @scala.inline
  def apply(
    provideFoldingRanges: js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* context */ vscodeLib.vscodeMod.FoldingContext, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideFoldingRangeSignature, 
      vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.FoldingRange]]
    ] = null
  ): FoldingRangeProviderMiddleware = {
    val __obj = js.Dynamic.literal()
    if (provideFoldingRanges != null) __obj.updateDynamic("provideFoldingRanges")(provideFoldingRanges)
    __obj.asInstanceOf[FoldingRangeProviderMiddleware]
  }
}

