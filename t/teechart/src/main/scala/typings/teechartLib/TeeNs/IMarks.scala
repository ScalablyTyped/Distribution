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
    add: js.Function1[java.lang.String, IAnnotation],
    arrow: IArrow,
    bounds: IRectangle,
    chart: IChart,
    clicked: js.Function1[IPoint, scala.Boolean],
    draw: js.Function0[scala.Unit],
    drawEvery: scala.Double,
    format: IFormat,
    items: js.Array[IAnnotation],
    margins: IMargins,
    mousedown: js.Function1[js.Any, scala.Boolean],
    mousemove: js.Function1[js.Any, scala.Boolean],
    position: IPoint,
    resize: js.Function0[scala.Unit],
    series: ISeries,
    style: java.lang.String,
    text: java.lang.String,
    transparent: scala.Boolean,
    visible: scala.Boolean
  ): IMarks = {
    val __obj = js.Dynamic.literal(active = active, add = add, arrow = arrow, bounds = bounds, chart = chart, clicked = clicked, draw = draw, drawEvery = drawEvery, format = format, items = items, margins = margins, mousedown = mousedown, mousemove = mousemove, position = position, resize = resize, series = series, style = style, text = text, transparent = transparent, visible = visible)
  
    __obj.asInstanceOf[IMarks]
  }
}

