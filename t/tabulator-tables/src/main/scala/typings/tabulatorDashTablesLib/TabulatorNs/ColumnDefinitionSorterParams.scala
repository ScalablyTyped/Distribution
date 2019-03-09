package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDefinitionSorterParams extends js.Object {
  var alignEmptyValues: js.UndefOr[
    tabulatorDashTablesLib.tabulatorDashTablesLibStrings.top | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.bottom
  ] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var locale: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var `type`: js.UndefOr[
    tabulatorDashTablesLib.tabulatorDashTablesLibStrings.length | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.sum | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.max | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.min | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.avg
  ] = js.undefined
}

object ColumnDefinitionSorterParams {
  @scala.inline
  def apply(
    alignEmptyValues: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.top | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.bottom = null,
    format: java.lang.String = null,
    locale: java.lang.String | scala.Boolean = null,
    `type`: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.length | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.sum | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.max | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.min | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.avg = null
  ): ColumnDefinitionSorterParams = {
    val __obj = js.Dynamic.literal()
    if (alignEmptyValues != null) __obj.updateDynamic("alignEmptyValues")(alignEmptyValues.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefinitionSorterParams]
  }
}

