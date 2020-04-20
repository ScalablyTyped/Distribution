package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScroll extends js.Object {
  var active: Boolean
  var chart: IChart
  var direction: String
  var enabled: Boolean
  var mouseButton: Double
  var position: IPoint
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
}

