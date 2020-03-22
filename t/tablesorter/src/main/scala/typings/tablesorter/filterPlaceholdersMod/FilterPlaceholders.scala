package typings.tablesorter.filterPlaceholdersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ name in tablesorter.tablesorter/Filtering/FilterBox.FilterBox ]:? string} */
trait FilterPlaceholders extends js.Object {
  var from: js.UndefOr[String] = js.undefined
  var search: js.UndefOr[String] = js.undefined
  var select: js.UndefOr[String] = js.undefined
  var to: js.UndefOr[String] = js.undefined
}

object FilterPlaceholders {
  @scala.inline
  def apply(from: String = null, search: String = null, select: String = null, to: String = null): FilterPlaceholders = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterPlaceholders]
  }
}

