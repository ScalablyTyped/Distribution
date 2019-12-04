package typings.tablesorter.widgetsColumnWidgetOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnOptions extends js.Object {
  /**
    * The names of the classes to apply when sorting in chronological order.
    */
  var columns: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A value indicating whether the class specified in `columns` should also be applied to the table-foot.
    */
  var columns_tfoot: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether the class specified in `columns` should also be applied to the table-head.
    */
  var columns_thead: js.UndefOr[Boolean] = js.undefined
}

object ColumnOptions {
  @scala.inline
  def apply(
    columns: js.Array[String] = null,
    columns_tfoot: js.UndefOr[Boolean] = js.undefined,
    columns_thead: js.UndefOr[Boolean] = js.undefined
  ): ColumnOptions = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(columns_tfoot)) __obj.updateDynamic("columns_tfoot")(columns_tfoot.asInstanceOf[js.Any])
    if (!js.isUndefined(columns_thead)) __obj.updateDynamic("columns_thead")(columns_thead.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnOptions]
  }
}

