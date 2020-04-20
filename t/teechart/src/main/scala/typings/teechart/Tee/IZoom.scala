package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IZoom extends js.Object {
  var active: Boolean
  var chart: IChart
  var direction: String
  var enabled: Boolean
  var format: IFormat
  var mouseButton: Double
  def reset(): Unit
}

object IZoom {
  @scala.inline
  def apply(
    active: Boolean,
    chart: IChart,
    direction: String,
    enabled: Boolean,
    format: IFormat,
    mouseButton: Double,
    reset: () => Unit
  ): IZoom = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], mouseButton = mouseButton.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[IZoom]
  }
}

