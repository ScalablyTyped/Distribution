package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAxisTitle extends IAnnotation {
  var padding: scala.Double
}

object IAxisTitle {
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
    padding: scala.Double,
    position: IPoint,
    resize: () => scala.Unit,
    text: java.lang.String,
    transparent: scala.Boolean,
    visible: scala.Boolean
  ): IAxisTitle = {
    val __obj = js.Dynamic.literal(active = active, add = js.Any.fromFunction1(add), bounds = bounds, chart = chart, clicked = js.Any.fromFunction1(clicked), draw = js.Any.fromFunction0(draw), format = format, items = items, margins = margins, mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), padding = padding, position = position, resize = js.Any.fromFunction0(resize), text = text, transparent = transparent, visible = visible)
  
    __obj.asInstanceOf[IAxisTitle]
  }
}

