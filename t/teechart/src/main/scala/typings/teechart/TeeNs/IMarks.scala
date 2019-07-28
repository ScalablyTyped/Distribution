package typings.teechart.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMarks extends IAnnotation {
  var arrow: IArrow
  var drawEvery: Double
  var series: ISeries
  var style: String
}

object IMarks {
  @scala.inline
  def apply(
    active: Boolean,
    add: String => IAnnotation,
    arrow: IArrow,
    bounds: IRectangle,
    chart: IChart,
    clicked: IPoint => Boolean,
    draw: () => Unit,
    drawEvery: Double,
    format: IFormat,
    items: js.Array[IAnnotation],
    margins: IMargins,
    mousedown: js.Any => Boolean,
    mousemove: js.Any => Boolean,
    position: IPoint,
    resize: () => Unit,
    series: ISeries,
    style: String,
    text: String,
    transparent: Boolean,
    visible: Boolean
  ): IMarks = {
    val __obj = js.Dynamic.literal(active = active, add = js.Any.fromFunction1(add), arrow = arrow, bounds = bounds, chart = chart, clicked = js.Any.fromFunction1(clicked), draw = js.Any.fromFunction0(draw), drawEvery = drawEvery, format = format, items = items, margins = margins, mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), position = position, resize = js.Any.fromFunction0(resize), series = series, style = style, text = text, transparent = transparent, visible = visible)
  
    __obj.asInstanceOf[IMarks]
  }
}

