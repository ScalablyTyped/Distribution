package typings
package teechartLib.TeeNs

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
  var visible: scala.Boolean
  def add(horizontal: scala.Boolean, otherSide: scala.Boolean): IAxis
}

object IAxes {
  @scala.inline
  def apply(
    add: (scala.Boolean, scala.Boolean) => IAxis,
    bottom: IAxis,
    chart: IChart,
    items: js.Array[IAxis],
    left: IAxis,
    right: IAxis,
    top: IAxis,
    visible: scala.Boolean
  ): IAxes = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), bottom = bottom, chart = chart, items = items, left = left, right = right, top = top, visible = visible)
  
    __obj.asInstanceOf[IAxes]
  }
}

