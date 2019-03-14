package typings
package vscodeDashLanguageclientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFoldingRangeMod {
  type ProvideFoldingRangeSignature = js.Function3[
    /* document */ vscodeLib.vscodeMod.TextDocument, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FoldingContext */ /* context */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[
      js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VFoldingRange */ js.Any
      ]
    ]
  ]
}
