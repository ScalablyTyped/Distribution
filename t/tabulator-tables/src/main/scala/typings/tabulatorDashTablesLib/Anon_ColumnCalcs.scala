package typings
package tabulatorDashTablesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnCalcs extends js.Object {
  var columnCalcs: js.UndefOr[scala.Boolean] = js.undefined
  var columnHeaders: js.UndefOr[scala.Boolean] = js.undefined
  var rowGroups: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ColumnCalcs {
  @scala.inline
  def apply(
    columnCalcs: js.UndefOr[scala.Boolean] = js.undefined,
    columnHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    rowGroups: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ColumnCalcs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnCalcs)) __obj.updateDynamic("columnCalcs")(columnCalcs)
    if (!js.isUndefined(columnHeaders)) __obj.updateDynamic("columnHeaders")(columnHeaders)
    if (!js.isUndefined(rowGroups)) __obj.updateDynamic("rowGroups")(rowGroups)
    __obj.asInstanceOf[Anon_ColumnCalcs]
  }
}

