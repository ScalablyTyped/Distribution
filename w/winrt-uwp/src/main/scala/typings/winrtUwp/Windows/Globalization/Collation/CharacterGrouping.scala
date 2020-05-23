package typings.winrtUwp.Windows.Globalization.Collation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A container for character group information. Characters are grouped in an index that enables an application to determine where the grouping boundaries are. */
trait CharacterGrouping extends js.Object {
  /** Gets the first item that appears in the grouping under this index. */
  var first: String
  /** Gets the label that is associated with this index. */
  var label: String
}

object CharacterGrouping {
  @scala.inline
  def apply(first: String, label: String): CharacterGrouping = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterGrouping]
  }
}

