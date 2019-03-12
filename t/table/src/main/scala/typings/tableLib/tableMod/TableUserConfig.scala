package typings
package tableLib.tableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableUserConfig extends js.Object {
  var border: js.UndefOr[JoinStruct] = js.undefined
  var columnCount: js.UndefOr[scala.Double] = js.undefined
  var columnDefault: js.UndefOr[ColumnConfig] = js.undefined
  var columns: js.UndefOr[org.scalablytyped.runtime.NumberDictionary[ColumnConfig]] = js.undefined
  var drawHorizontalLine: js.UndefOr[js.Function2[/* index */ scala.Double, /* size */ scala.Double, scala.Boolean]] = js.undefined
}

object TableUserConfig {
  @scala.inline
  def apply(
    border: JoinStruct = null,
    columnCount: scala.Int | scala.Double = null,
    columnDefault: ColumnConfig = null,
    columns: org.scalablytyped.runtime.NumberDictionary[ColumnConfig] = null,
    drawHorizontalLine: (/* index */ scala.Double, /* size */ scala.Double) => scala.Boolean = null
  ): TableUserConfig = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (columnDefault != null) __obj.updateDynamic("columnDefault")(columnDefault)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (drawHorizontalLine != null) __obj.updateDynamic("drawHorizontalLine")(js.Any.fromFunction2(drawHorizontalLine))
    __obj.asInstanceOf[TableUserConfig]
  }
}

