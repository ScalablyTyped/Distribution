package typings
package tabulatorDashTablesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnCalcsColumnGroups extends js.Object {
  var columnCalcs: js.UndefOr[scala.Boolean] = js.undefined
  var columnGroups: js.UndefOr[scala.Boolean] = js.undefined
  var rowGroups: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ColumnCalcsColumnGroups {
  @scala.inline
  def apply(
    columnCalcs: js.UndefOr[scala.Boolean] = js.undefined,
    columnGroups: js.UndefOr[scala.Boolean] = js.undefined,
    rowGroups: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ColumnCalcsColumnGroups = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnCalcs)) __obj.updateDynamic("columnCalcs")(columnCalcs)
    if (!js.isUndefined(columnGroups)) __obj.updateDynamic("columnGroups")(columnGroups)
    if (!js.isUndefined(rowGroups)) __obj.updateDynamic("rowGroups")(rowGroups)
    __obj.asInstanceOf[Anon_ColumnCalcsColumnGroups]
  }
}

