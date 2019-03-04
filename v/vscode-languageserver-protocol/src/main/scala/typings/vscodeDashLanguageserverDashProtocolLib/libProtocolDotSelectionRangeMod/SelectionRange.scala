package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotSelectionRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionRange extends js.Object {
  /**
    * Describes the kind of the selection range such as `statemet' or 'declaration'. See
    * [SelectionRangeKind](#SelectionRangeKind) for an enumeration of standardized kinds.
    */
  var kind: java.lang.String
  /**
    * Range of the selection.
    */
  var range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range
}

object SelectionRange {
  @scala.inline
  def apply(
    kind: java.lang.String,
    range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range
  ): SelectionRange = {
    val __obj = js.Dynamic.literal(kind = kind, range = range)
  
    __obj.asInstanceOf[SelectionRange]
  }
}

