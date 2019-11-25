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
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], add = js.Any.fromFunction1(add), bounds = bounds.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], clicked = js.Any.fromFunction1(clicked), draw = js.Any.fromFunction0(draw), format = format.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], margins = margins.asInstanceOf[js.Any], mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), position = position.asInstanceOf[js.Any], resize = js.Any.fromFunction0(resize), text = text.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAnnotation]
  }
}

