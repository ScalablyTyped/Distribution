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
    clicked: IPoint => scala.Boolean,
    draw: () => scala.Unit,
    mousedown: js.Any => scala.Boolean,
    mousemove: js.Any => scala.Boolean
  ): ITool = {
    val __obj = js.Dynamic.literal(active = active, chart = chart, clicked = js.Any.fromFunction1(clicked), draw = js.Any.fromFunction0(draw), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove))
  
    __obj.asInstanceOf[ITool]
  }
}

