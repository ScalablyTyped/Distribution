package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAxes extends js.Object {
  var bottom: IAxis = js.native
  var chart: IChart = js.native
  var items: js.Array[IAxis] = js.native
  var left: IAxis = js.native
  var right: IAxis = js.native
  var top: IAxis = js.native
  var visible: Boolean = js.native
  def add(horizontal: Boolean, otherSide: Boolean): IAxis = js.native
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
  @scala.inline
  implicit class IAxesOps[Self <: IAxes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: (Boolean, Boolean) => IAxis): Self = this.set("add", js.Any.fromFunction2(value))
    @scala.inline
    def setBottom(value: IAxis): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setChart(value: IChart): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: IAxis*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[IAxis]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: IAxis): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: IAxis): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: IAxis): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

