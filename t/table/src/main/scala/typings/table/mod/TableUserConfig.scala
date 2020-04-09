package typings.table.mod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableUserConfig extends js.Object {
  var border: js.UndefOr[TableBorder] = js.undefined
  var columnCount: js.UndefOr[Double] = js.undefined
  var columnDefault: js.UndefOr[TableColumns] = js.undefined
  var columns: js.UndefOr[NumberDictionary[TableColumns]] = js.undefined
  var drawHorizontalLine: js.UndefOr[TableDrawHorizontalLine] = js.undefined
  var singleLine: js.UndefOr[Boolean] = js.undefined
}

object TableUserConfig {
  @scala.inline
  def apply(
    border: TableBorder = null,
    columnCount: Int | Double = null,
    columnDefault: TableColumns = null,
    columns: NumberDictionary[TableColumns] = null,
    drawHorizontalLine: (/* index */ Double, /* size */ Double) => Boolean = null,
    singleLine: js.UndefOr[Boolean] = js.undefined
  ): TableUserConfig = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (columnDefault != null) __obj.updateDynamic("columnDefault")(columnDefault.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (drawHorizontalLine != null) __obj.updateDynamic("drawHorizontalLine")(js.Any.fromFunction2(drawHorizontalLine))
    if (!js.isUndefined(singleLine)) __obj.updateDynamic("singleLine")(singleLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableUserConfig]
  }
}

