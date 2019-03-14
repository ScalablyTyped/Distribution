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
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FoldingContext */ /* context */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideFoldingRangeSignature, 
      vscodeLib.vscodeMod.ProviderResult[
        js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VFoldingRange */ _
        ]
      ]
    ]
  ] = js.undefined
}

object FoldingRangeProviderMiddleware {
  @scala.inline
  def apply(
    provideFoldingRanges: js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FoldingContext */ /* context */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideFoldingRangeSignature, 
      vscodeLib.vscodeMod.ProviderResult[
        js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VFoldingRange */ _
        ]
      ]
    ] = null
  ): FoldingRangeProviderMiddleware = {
    val __obj = js.Dynamic.literal()
    if (provideFoldingRanges != null) __obj.updateDynamic("provideFoldingRanges")(provideFoldingRanges)
    __obj.asInstanceOf[FoldingRangeProviderMiddleware]
  }
}

