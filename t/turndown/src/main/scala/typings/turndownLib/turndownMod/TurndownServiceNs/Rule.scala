package typings
package turndownLib.turndownMod.TurndownServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  var filter: Filter
  var replacement: js.UndefOr[ReplacementFunction] = js.undefined
}

object Rule {
  @scala.inline
  def apply(filter: Filter, replacement: ReplacementFunction = null): Rule = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    if (replacement != null) __obj.updateDynamic("replacement")(replacement)
    __obj.asInstanceOf[Rule]
  }
}

