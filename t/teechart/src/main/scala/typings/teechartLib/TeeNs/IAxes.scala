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
    add: js.Function2[scala.Boolean, scala.Boolean, IAxis],
    bottom: IAxis,
    chart: IChart,
    items: js.Array[IAxis],
    left: IAxis,
    right: IAxis,
    top: IAxis,
    visible: scala.Boolean
  ): IAxes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("bottom")(bottom)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("right")(right)
    __obj.updateDynamic("top")(top)
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[IAxes]
  }
}

