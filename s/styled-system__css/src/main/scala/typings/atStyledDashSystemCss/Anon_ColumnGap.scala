package typings.atStyledDashSystemCss

import typings.csstype.csstypeMod.ColumnGapProperty
import typings.csstype.csstypeMod.GapProperty
import typings.csstype.csstypeMod.RowGapProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnGap extends js.Object {
  var columnGap: ColumnGapProperty[Double]
  var gap: GapProperty[Double]
  var gridColumnGap: ColumnGapProperty[Double]
  var gridGap: GapProperty[Double]
  var gridRowGap: RowGapProperty[Double]
  var rowGap: RowGapProperty[Double]
}

object Anon_ColumnGap {
  @scala.inline
  def apply(
    columnGap: ColumnGapProperty[Double],
    gap: GapProperty[Double],
    gridColumnGap: ColumnGapProperty[Double],
    gridGap: GapProperty[Double],
    gridRowGap: RowGapProperty[Double],
    rowGap: RowGapProperty[Double]
  ): Anon_ColumnGap = {
    val __obj = js.Dynamic.literal(columnGap = columnGap.asInstanceOf[js.Any], gap = gap.asInstanceOf[js.Any], gridColumnGap = gridColumnGap.asInstanceOf[js.Any], gridGap = gridGap.asInstanceOf[js.Any], gridRowGap = gridRowGap.asInstanceOf[js.Any], rowGap = rowGap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColumnGap]
  }
}

