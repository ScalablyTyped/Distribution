package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScroll extends js.Object {
  var active: Boolean = js.native
  var chart: IChart = js.native
  var direction: String = js.native
  var enabled: Boolean = js.native
  var mouseButton: Double = js.native
  var position: IPoint = js.native
}

object IScroll {
  @scala.inline
  def apply(
    active: Boolean,
    chart: IChart,
    direction: String,
    enabled: Boolean,
    mouseButton: Double,
    position: IPoint
  ): IScroll = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], mouseButton = mouseButton.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScroll]
  }
  @scala.inline
  implicit class IScrollOps[Self <: IScroll] (val x: Self) extends AnyVal {
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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseButton(value: Double): Self = this.set("mouseButton", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: IPoint): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}

