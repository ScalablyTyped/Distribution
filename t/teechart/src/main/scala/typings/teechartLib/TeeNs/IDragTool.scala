package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TOOLS
trait IDragTool extends ITool {
  var series: ISeries
}

object IDragTool {
  @scala.inline
  def apply(
    active: scala.Boolean,
    chart: IChart,
    clicked: js.Function1[IPoint, scala.Boolean],
    draw: js.Function0[scala.Unit],
    mousedown: js.Function1[js.Any, scala.Boolean],
    mousemove: js.Function1[js.Any, scala.Boolean],
    series: ISeries
  ): IDragTool = {
    val __obj = js.Dynamic.literal(active = active, chart = chart, clicked = clicked, draw = draw, mousedown = mousedown, mousemove = mousemove, series = series)
  
    __obj.asInstanceOf[IDragTool]
  }
}

