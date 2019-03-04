package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScroll extends js.Object {
  var active: scala.Boolean
  var chart: IChart
  var direction: java.lang.String
  var enabled: scala.Boolean
  var mouseButton: scala.Double
  var position: IPoint
}

object IScroll {
  @scala.inline
  def apply(
    active: scala.Boolean,
    chart: IChart,
    direction: java.lang.String,
    enabled: scala.Boolean,
    mouseButton: scala.Double,
    position: IPoint
  ): IScroll = {
    val __obj = js.Dynamic.literal(active = active, chart = chart, direction = direction, enabled = enabled, mouseButton = mouseButton, position = position)
  
    __obj.asInstanceOf[IScroll]
  }
}

