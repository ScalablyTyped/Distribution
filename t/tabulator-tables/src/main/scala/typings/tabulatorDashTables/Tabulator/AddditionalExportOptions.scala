package typings.tabulatorDashTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddditionalExportOptions extends js.Object {
  var columnCalcs: js.UndefOr[Boolean] = js.undefined
  var columnGroups: js.UndefOr[Boolean] = js.undefined
  var rowGroups: js.UndefOr[Boolean] = js.undefined
}

object AddditionalExportOptions {
  @scala.inline
  def apply(
    columnCalcs: js.UndefOr[Boolean] = js.undefined,
    columnGroups: js.UndefOr[Boolean] = js.undefined,
    rowGroups: js.UndefOr[Boolean] = js.undefined
  ): AddditionalExportOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnCalcs)) __obj.updateDynamic("columnCalcs")(columnCalcs)
    if (!js.isUndefined(columnGroups)) __obj.updateDynamic("columnGroups")(columnGroups)
    if (!js.isUndefined(rowGroups)) __obj.updateDynamic("rowGroups")(rowGroups)
    __obj.asInstanceOf[AddditionalExportOptions]
  }
}

