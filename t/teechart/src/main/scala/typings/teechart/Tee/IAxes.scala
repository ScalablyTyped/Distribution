package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAxes extends js.Object {
  var bottom: IAxis
  var chart: IChart
  var items: js.Array[IAxis]
  var left: IAxis
  var right: IAxis
  var top: IAxis
  var visible: Boolean
  def add(horizontal: Boolean, otherSide: Boolean): IAxis
}

object IAxes {
  @scala.inline
  def apply(
    add: (Boolean, Boolean) => IAxis,
    bottom: IAxis,
    chart: IChart,
    items: js.Array[IAxis],
    left: IAxis,
    right: IAxis,
    top: IAxis,
    visible: Boolean
  ): IAxes = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), bottom = bottom.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAxes]
  }
}

