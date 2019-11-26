package typings.tabulatorDashTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistenceOptions extends js.Object {
  var columns: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var filter: js.UndefOr[Boolean] = js.undefined
  var group: js.UndefOr[Boolean | PersistenceGroupOptions] = js.undefined
  var page: js.UndefOr[Boolean | PersistencePageOptions] = js.undefined
  var sort: js.UndefOr[Boolean] = js.undefined
}

object PersistenceOptions {
  @scala.inline
  def apply(
    columns: Boolean | js.Array[String] = null,
    filter: js.UndefOr[Boolean] = js.undefined,
    group: Boolean | PersistenceGroupOptions = null,
    page: Boolean | PersistencePageOptions = null,
    sort: js.UndefOr[Boolean] = js.undefined
  ): PersistenceOptions = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistenceOptions]
  }
}

