package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITicks extends js.Object {
  var chart: IChart = js.native
  var length: Double = js.native
  var stroke: IStroke = js.native
  var visible: Boolean = js.native
}

object ITicks {
  @scala.inline
  def apply(chart: IChart, length: Double, stroke: IStroke, visible: Boolean): ITicks = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITicks]
  }
  @scala.inline
  implicit class ITicksOps[Self <: ITicks] (val x: Self) extends AnyVal {
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
    def setChart(value: IChart): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setStroke(value: IStroke): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

