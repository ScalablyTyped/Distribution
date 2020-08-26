package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITool extends js.Object {
  var active: Boolean = js.native
  var chart: IChart = js.native
  def clicked(p: IPoint): Boolean = js.native
  def draw(): Unit = js.native
  def mousedown(event: js.Any): Boolean = js.native
  def mousemove(event: js.Any): Boolean = js.native
}

object ITool {
  @scala.inline
  def apply(
    active: Boolean,
    chart: IChart,
    clicked: IPoint => Boolean,
    draw: () => Unit,
    mousedown: js.Any => Boolean,
    mousemove: js.Any => Boolean
  ): ITool = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], clicked = js.Any.fromFunction1(clicked), draw = js.Any.fromFunction0(draw), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove))
    __obj.asInstanceOf[ITool]
  }
  @scala.inline
  implicit class IToolOps[Self <: ITool] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setChart(value: IChart): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def setClicked(value: IPoint => Boolean): Self = this.set("clicked", js.Any.fromFunction1(value))
    @scala.inline
    def setDraw(value: () => Unit): Self = this.set("draw", js.Any.fromFunction0(value))
    @scala.inline
    def setMousedown(value: js.Any => Boolean): Self = this.set("mousedown", js.Any.fromFunction1(value))
    @scala.inline
    def setMousemove(value: js.Any => Boolean): Self = this.set("mousemove", js.Any.fromFunction1(value))
  }
  
}

