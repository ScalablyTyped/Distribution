package typings.table.tableMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableUserConfig extends js.Object {
  var border: js.UndefOr[JoinStruct] = js.undefined
  var columnCount: js.UndefOr[Double] = js.undefined
  var columnDefault: js.UndefOr[ColumnConfig] = js.undefined
  var columns: js.UndefOr[NumberDictionary[ColumnConfig]] = js.undefined
  var drawHorizontalLine: js.UndefOr[js.Function2[/* index */ Double, /* size */ Double, Boolean]] = js.undefined
  var singleLine: js.UndefOr[Boolean] = js.undefined
}

object TableUserConfig {
  @scala.inline
  def apply(
    border: JoinStruct = null,
    columnCount: Int | Double = null,
    columnDefault: ColumnConfig = null,
    columns: NumberDictionary[ColumnConfig] = null,
    drawHorizontalLine: (/* index */ Double, /* size */ Double) => Boolean = null,
    singleLine: js.UndefOr[Boolean] = js.undefined
  ): TableUserConfig = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (columnDefault != null) __obj.updateDynamic("columnDefault")(columnDefault)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (drawHorizontalLine != null) __obj.updateDynamic("drawHorizontalLine")(js.Any.fromFunction2(drawHorizontalLine))
    if (!js.isUndefined(singleLine)) __obj.updateDynamic("singleLine")(singleLine)
    __obj.asInstanceOf[TableUserConfig]
  }
}

