package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionSet extends Node {
  var kind: String
  var loc: js.UndefOr[Location] = js.undefined
  var selections: js.Array[Selection]
}

object SelectionSet {
  @scala.inline
  def apply(kind: String, selections: js.Array[Selection], loc: Location = null): SelectionSet = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionSet]
  }
}

