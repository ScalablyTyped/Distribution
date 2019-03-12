package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICursorTool extends ITool {
  var direction: java.lang.String
  var dragging: scala.Double
  var followMouse: scala.Boolean
  var format: IFormat
  var horizAxis: IAxis
  var render: java.lang.String
  var size: IPoint
  var vertAxis: IAxis
  def over(point: IPoint): scala.Boolean
  def setRender(render: java.lang.String): scala.Unit
}

object ICursorTool {
  @scala.inline
  def apply(
    active: scala.Boolean,
    chart: IChart,
    clicked: IPoint => scala.Boolean,
    direction: java.lang.String,
    dragging: scala.Double,
    draw: () => scala.Unit,
    followMouse: scala.Boolean,
    format: IFormat,
    horizAxis: IAxis,
    mousedown: js.Any => scala.Boolean,
    mousemove: js.Any => scala.Boolean,
    over: IPoint => scala.Boolean,
    render: java.lang.String,
    setRender: java.lang.String => scala.Unit,
    size: IPoint,
    vertAxis: IAxis
  ): ICursorTool = {
    val __obj = js.Dynamic.literal(active = active, chart = chart, clicked = js.Any.fromFunction1(clicked), direction = direction, dragging = dragging, draw = js.Any.fromFunction0(draw), followMouse = followMouse, format = format, horizAxis = horizAxis, mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), over = js.Any.fromFunction1(over), render = render, setRender = js.Any.fromFunction1(setRender), size = size, vertAxis = vertAxis)
  
    __obj.asInstanceOf[ICursorTool]
  }
}

