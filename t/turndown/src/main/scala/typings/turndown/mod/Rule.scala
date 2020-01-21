package typings.turndown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  var filter: Filter
  var replacement: js.UndefOr[ReplacementFunction] = js.undefined
}

object Rule {
  @scala.inline
  def apply(
    filter: Filter,
    replacement: (/* content */ String, /* node */ Node, /* options */ Options) => String = null
  ): Rule = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    if (replacement != null) __obj.updateDynamic("replacement")(js.Any.fromFunction3(replacement))
    __obj.asInstanceOf[Rule]
  }
}

