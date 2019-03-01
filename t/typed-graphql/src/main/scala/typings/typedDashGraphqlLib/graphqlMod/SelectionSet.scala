package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionSet extends Node {
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var selections: js.Array[Selection]
}

object SelectionSet {
  @scala.inline
  def apply(kind: java.lang.String, selections: js.Array[Selection], loc: Location = null): SelectionSet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("selections")(selections)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[SelectionSet]
  }
}

