package typings
package vscodeDashLanguageclientLib.libFoldingRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FoldingRangeProviderMiddleware extends js.Object {
  var provideFoldingRanges: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ js.Any, 
      /* context */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideFoldingRangeSignature, 
      _
    ]
  ] = js.undefined
}

