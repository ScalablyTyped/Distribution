package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnnotation extends ITool {
  var bounds: IRectangle
  var format: IFormat
  var items: js.Array[IAnnotation]
  var margins: IMargins
  var position: IPoint
  var text: String
  var transparent: Boolean
  var visible: Boolean
  def add(text: String): IAnnotation
  def resize(): Unit
}

object IAnnotation {
  @scala.inline
  def apply(
    active: Boolean,
    add: String => IAnnotation,
    bounds: IRectangle,
    chart: IChart,
    clicked: IPoint => Boolean,
    draw: () => Unit,
    format: IFormat,
    items: js.Array[IAnnotation],
    margins: IMargins,
    mousedown: js.Any => Boolean,
    mousemove: js.Any => Boolean,
    position: IPoint,
    resize: () => Unit,
    text: String,
    transparent: Boolean,
    visible: Boolean
  ): IAnnotation = {
    val __obj = js.Dynamic.literal(active = active, add = js.Any.fromFunction1(add), bounds = bounds, chart = chart, clicked = js.Any.fromFunction1(clicked), draw = js.Any.fromFunction0(draw), format = format, items = items, margins = margins, mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), position = position, resize = js.Any.fromFunction0(resize), text = text, transparent = transparent, visible = visible)
  
    __obj.asInstanceOf[IAnnotation]
  }
}

