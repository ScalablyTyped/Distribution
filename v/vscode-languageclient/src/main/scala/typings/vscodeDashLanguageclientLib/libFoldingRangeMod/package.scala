package typings
package vscodeDashLanguageclientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFoldingRangeMod {
  type ProvideFoldingRangeSignature = js.Function3[
    /* document */ vscodeLib.vscodeMod.TextDocument, 
    /* context */ vscodeLib.vscodeMod.FoldingContext, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.FoldingRange]]
  ]
}
