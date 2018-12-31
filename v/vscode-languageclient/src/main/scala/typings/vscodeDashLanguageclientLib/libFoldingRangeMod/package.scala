package typings
package vscodeDashLanguageclientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFoldingRangeMod {
  type ProvideFoldingRangeSignature = js.Function3[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify TextDocument */ /* document */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify FoldingContext */ /* context */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify ProviderResult<Array<VFoldingRange>> */ js.Any
  ]
}
