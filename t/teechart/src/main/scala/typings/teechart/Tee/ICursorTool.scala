package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICursorTool extends ITool {
  var direction: String
  var dragging: Double
  var followMouse: Boolean
  var format: IFormat
  var horizAxis: IAxis
  var render: String
  var size: IPoint
  var vertAxis: IAxis
  def over(point: IPoint): Boolean
  def setRender(render: String): Unit
}

object ICursorTool {
  @scala.inline
  def apply(
    active: Boolean,
    chart: IChart,
    clicked: IPoint => Boolean,
    direction: String,
    dragging: Double,
    draw: () => Unit,
    followMouse: Boolean,
    format: IFormat,
    horizAxis: IAxis,
    mousedown: js.Any => Boolean,
    mousemove: js.Any => Boolean,
    over: IPoint => Boolean,
    render: String,
    setRender: String => Unit,
    size: IPoint,
    vertAxis: IAxis
  ): ICursorTool = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], clicked = js.Any.fromFunction1(clicked), direction = direction.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], draw = js.Any.fromFunction0(draw), followMouse = followMouse.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], horizAxis = horizAxis.asInstanceOf[js.Any], mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), over = js.Any.fromFunction1(over), render = render.asInstanceOf[js.Any], setRender = js.Any.fromFunction1(setRender), size = size.asInstanceOf[js.Any], vertAxis = vertAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICursorTool]
  }
}

