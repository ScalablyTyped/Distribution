package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddditionalExportOptions extends js.Object {
  var columnCalcs: js.UndefOr[Boolean] = js.undefined
  var columnGroups: js.UndefOr[Boolean] = js.undefined
  var columnHeaders: js.UndefOr[Boolean] = js.undefined
  var dataTree: js.UndefOr[Boolean] = js.undefined
  /**Show only raw unformatted cell values in the clipboard output */
  var formatCells: js.UndefOr[Boolean] = js.undefined
  var rowGroups: js.UndefOr[Boolean] = js.undefined
}

object AddditionalExportOptions {
  @scala.inline
  def apply(
    columnCalcs: js.UndefOr[Boolean] = js.undefined,
    columnGroups: js.UndefOr[Boolean] = js.undefined,
    columnHeaders: js.UndefOr[Boolean] = js.undefined,
    dataTree: js.UndefOr[Boolean] = js.undefined,
    formatCells: js.UndefOr[Boolean] = js.undefined,
    rowGroups: js.UndefOr[Boolean] = js.undefined
  ): AddditionalExportOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnCalcs)) __obj.updateDynamic("columnCalcs")(columnCalcs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnGroups)) __obj.updateDynamic("columnGroups")(columnGroups.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnHeaders)) __obj.updateDynamic("columnHeaders")(columnHeaders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dataTree)) __obj.updateDynamic("dataTree")(dataTree.get.asInstanceOf[js.Any])
    if (!js.isUndefined(formatCells)) __obj.updateDynamic("formatCells")(formatCells.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowGroups)) __obj.updateDynamic("rowGroups")(rowGroups.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddditionalExportOptions]
  }
}

