package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITool extends js.Object {
  var active: Boolean
  var chart: IChart
  def clicked(p: IPoint): Boolean
  def draw(): Unit
  def mousedown(event: js.Any): Boolean
  def mousemove(event: js.Any): Boolean
}

object ITool {
  @scala.inline
  def apply(
    active: Boolean,
    chart: IChart,
    clicked: IPoint => Boolean,
    draw: () => Unit,
    mousedown: js.Any => Boolean,
    mousemove: js.Any => Boolean
  ): ITool = {
    val __obj = js.Dynamic.literal(active = active, chart = chart, clicked = js.Any.fromFunction1(clicked), draw = js.Any.fromFunction0(draw), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove))
  
    __obj.asInstanceOf[ITool]
  }
}

