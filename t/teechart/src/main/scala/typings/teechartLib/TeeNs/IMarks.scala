package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMarks extends IAnnotation {
  var arrow: IArrow
  var drawEvery: scala.Double
  var series: ISeries
  var style: java.lang.String
}

object IMarks {
  @scala.inline
  def apply(
    active: scala.Boolean,
    add: java.lang.String => IAnnotation,
    arrow: IArrow,
    bounds: IRectangle,
    chart: IChart,
    clicked: IPoint => scala.Boolean,
    draw: () => scala.Unit,
    drawEvery: scala.Double,
    format: IFormat,
    items: js.Array[IAnnotation],
    margins: IMargins,
    mousedown: js.Any => scala.Boolean,
    mousemove: js.Any => scala.Boolean,
    position: IPoint,
    resize: () => scala.Unit,
    series: ISeries,
    style: java.lang.String,
    text: java.lang.String,
    transparent: scala.Boolean,
    visible: scala.Boolean
  ): IMarks = {
    val __obj = js.Dynamic.literal(active = active, add = js.Any.fromFunction1(add), arrow = arrow, bounds = bounds, chart = chart, clicked = js.Any.fromFunction1(clicked), draw = js.Any.fromFunction0(draw), drawEvery = drawEvery, format = format, items = items, margins = margins, mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), position = position, resize = js.Any.fromFunction0(resize), series = series, style = style, text = text, transparent = transparent, visible = visible)
  
    __obj.asInstanceOf[IMarks]
  }
}

