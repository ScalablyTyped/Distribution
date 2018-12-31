package typings
package vscodeDashLanguageclientLib.libFoldingRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldingRangeProviderMiddleware extends js.Object {
  var provideFoldingRanges: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify TextDocument */ /* document */ js.Any, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify FoldingContext */ /* context */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideFoldingRangeSignature, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify ProviderResult<Array<VFoldingRange>> */ _
    ]
  ] = js.undefined
}

