package typings
package winrtDashUwpLib.WindowsNs.GlobalizationNs.CollationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A container for character group information. Characters are grouped in an index that enables an application to determine where the grouping boundaries are. */
@JSGlobal("Windows.Globalization.Collation.CharacterGrouping")
@js.native
abstract class CharacterGrouping () extends js.Object {
  /** Gets the first item that appears in the grouping under this index. */
  var first: java.lang.String = js.native
  /** Gets the label that is associated with this index. */
  var label: java.lang.String = js.native
}

