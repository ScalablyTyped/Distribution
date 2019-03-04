package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITool extends js.Object {
  var active: scala.Boolean
  var chart: IChart
  def clicked(p: IPoint): scala.Boolean
  def draw(): scala.Unit
  def mousedown(event: js.Any): scala.Boolean
  def mousemove(event: js.Any): scala.Boolean
}

object ITool {
  @scala.inline
  def apply(
    active: scala.Boolean,
    chart: IChart,
    clicked: js.Function1[IPoint, scala.Boolean],
    draw: js.Function0[scala.Unit],
    mousedown: js.Function1[js.Any, scala.Boolean],
    mousemove: js.Function1[js.Any, scala.Boolean]
  ): ITool = {
    val __obj = js.Dynamic.literal(active = active, chart = chart, clicked = clicked, draw = draw, mousedown = mousedown, mousemove = mousemove)
  
    __obj.asInstanceOf[ITool]
  }
}

