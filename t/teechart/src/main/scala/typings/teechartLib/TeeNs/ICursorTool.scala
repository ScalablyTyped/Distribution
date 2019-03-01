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
    clicked: js.Function1[IPoint, scala.Boolean],
    direction: java.lang.String,
    dragging: scala.Double,
    draw: js.Function0[scala.Unit],
    followMouse: scala.Boolean,
    format: IFormat,
    horizAxis: IAxis,
    mousedown: js.Function1[js.Any, scala.Boolean],
    mousemove: js.Function1[js.Any, scala.Boolean],
    over: js.Function1[IPoint, scala.Boolean],
    render: java.lang.String,
    setRender: js.Function1[java.lang.String, scala.Unit],
    size: IPoint,
    vertAxis: IAxis
  ): ICursorTool = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("clicked")(clicked)
    __obj.updateDynamic("direction")(direction)
    __obj.updateDynamic("dragging")(dragging)
    __obj.updateDynamic("draw")(draw)
    __obj.updateDynamic("followMouse")(followMouse)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("horizAxis")(horizAxis)
    __obj.updateDynamic("mousedown")(mousedown)
    __obj.updateDynamic("mousemove")(mousemove)
    __obj.updateDynamic("over")(over)
    __obj.updateDynamic("render")(render)
    __obj.updateDynamic("setRender")(setRender)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("vertAxis")(vertAxis)
    __obj.asInstanceOf[ICursorTool]
  }
}

