package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IZoom extends js.Object {
  var active: scala.Boolean
  var chart: IChart
  var direction: java.lang.String
  var enabled: scala.Boolean
  var format: IFormat
  var mouseButton: scala.Double
  def reset(): scala.Unit
}

object IZoom {
  @scala.inline
  def apply(
    active: scala.Boolean,
    chart: IChart,
    direction: java.lang.String,
    enabled: scala.Boolean,
    format: IFormat,
    mouseButton: scala.Double,
    reset: js.Function0[scala.Unit]
  ): IZoom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("direction")(direction)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("mouseButton")(mouseButton)
    __obj.updateDynamic("reset")(reset)
    __obj.asInstanceOf[IZoom]
  }
}

