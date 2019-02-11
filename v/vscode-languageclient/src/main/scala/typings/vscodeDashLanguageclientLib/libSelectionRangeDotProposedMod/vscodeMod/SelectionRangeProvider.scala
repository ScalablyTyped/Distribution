package typings
package vscodeDashLanguageclientLib.libSelectionRangeDotProposedMod.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionRangeProvider extends js.Object {
  /**
    * Provide selection ranges starting at a given position. The first range must [contain](#Range.contains)
    * position and subsequent ranges must contain the previous range.
    */
  def provideSelectionRanges(
    document: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextDocument */ js.Any,
    position: stdLib.Position,
    token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken
  ): js.Any
}

