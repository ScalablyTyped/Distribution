package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnnotation extends ITool {
  var bounds: IRectangle
  var format: IFormat
  var items: js.Array[IAnnotation]
  var margins: IMargins
  var position: IPoint
  var text: java.lang.String
  var transparent: scala.Boolean
  var visible: scala.Boolean
  def add(text: java.lang.String): IAnnotation
  def resize(): scala.Unit
}

object IAnnotation {
  @scala.inline
  def apply(
    active: scala.Boolean,
    add: java.lang.String => IAnnotation,
    bounds: IRectangle,
    chart: IChart,
    clicked: IPoint => scala.Boolean,
    draw: () => scala.Unit,
    format: IFormat,
    items: js.Array[IAnnotation],
    margins: IMargins,
    mousedown: js.Any => scala.Boolean,
    mousemove: js.Any => scala.Boolean,
    position: IPoint,
    resize: () => scala.Unit,
    text: java.lang.String,
    transparent: scala.Boolean,
    visible: scala.Boolean
  ): IAnnotation = {
    val __obj = js.Dynamic.literal(active = active, add = js.Any.fromFunction1(add), bounds = bounds, chart = chart, clicked = js.Any.fromFunction1(clicked), draw = js.Any.fromFunction0(draw), format = format, items = items, margins = margins, mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), position = position, resize = js.Any.fromFunction0(resize), text = text, transparent = transparent, visible = visible)
  
    __obj.asInstanceOf[IAnnotation]
  }
}

