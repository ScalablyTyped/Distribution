package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TOOLS
@js.native
trait IDragTool extends ITool {
  var series: ISeries = js.native
}

object IDragTool {
  @scala.inline
  def apply(
    active: Boolean,
    chart: IChart,
    clicked: IPoint => Boolean,
    draw: () => Unit,
    mousedown: js.Any => Boolean,
    mousemove: js.Any => Boolean,
    series: ISeries
  ): IDragTool = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], clicked = js.Any.fromFunction1(clicked), draw = js.Any.fromFunction0(draw), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDragTool]
  }
  @scala.inline
  implicit class IDragToolOps[Self <: IDragTool] (val x: Self) extends AnyVal {
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
    def setSeries(value: ISeries): Self = this.set("series", value.asInstanceOf[js.Any])
  }
  
}

