package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITitle extends IAnnotation {
  var expand: Boolean
  var padding: Double
}

object ITitle {
  @scala.inline
  def apply(
    active: Boolean,
    add: String => IAnnotation,
    bounds: IRectangle,
    chart: IChart,
    clicked: IPoint => Boolean,
    draw: () => Unit,
    expand: Boolean,
    format: IFormat,
    items: js.Array[IAnnotation],
    margins: IMargins,
    mousedown: js.Any => Boolean,
    mousemove: js.Any => Boolean,
    padding: Double,
    position: IPoint,
    resize: () => Unit,
    text: String,
    transparent: Boolean,
    visible: Boolean
  ): ITitle = {
    val __obj = js.Dynamic.literal(active = active, add = js.Any.fromFunction1(add), bounds = bounds, chart = chart, clicked = js.Any.fromFunction1(clicked), draw = js.Any.fromFunction0(draw), expand = expand, format = format, items = items, margins = margins, mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), padding = padding, position = position, resize = js.Any.fromFunction0(resize), text = text, transparent = transparent, visible = visible)
  
    __obj.asInstanceOf[ITitle]
  }
}

