package typings.tabulatorDashTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnCalcs extends js.Object {
  var columnCalcs: js.UndefOr[Boolean] = js.undefined
  var columnHeaders: js.UndefOr[Boolean] = js.undefined
  var rowGroups: js.UndefOr[Boolean] = js.undefined
}

object Anon_ColumnCalcs {
  @scala.inline
  def apply(
    columnCalcs: js.UndefOr[Boolean] = js.undefined,
    columnHeaders: js.UndefOr[Boolean] = js.undefined,
    rowGroups: js.UndefOr[Boolean] = js.undefined
  ): Anon_ColumnCalcs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnCalcs)) __obj.updateDynamic("columnCalcs")(columnCalcs.asInstanceOf[js.Any])
    if (!js.isUndefined(columnHeaders)) __obj.updateDynamic("columnHeaders")(columnHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(rowGroups)) __obj.updateDynamic("rowGroups")(rowGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColumnCalcs]
  }
}

