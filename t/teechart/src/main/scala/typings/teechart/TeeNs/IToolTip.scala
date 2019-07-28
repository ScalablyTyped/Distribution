package typings.teechart.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToolTip extends IAnnotation {
  var animated: Double
  var autoHide: Boolean
  var autoRedraw: Boolean
  var currentIndex: Double
  var currentSeries: ISeries
  var delay: Double
  def hide(): Unit
  def refresh(series: ISeries, index: Double): Unit
}

object IToolTip {
  @scala.inline
  def apply(
    active: Boolean,
    add: String => IAnnotation,
    animated: Double,
    autoHide: Boolean,
    autoRedraw: Boolean,
    bounds: IRectangle,
    chart: IChart,
    clicked: IPoint => Boolean,
    currentIndex: Double,
    currentSeries: ISeries,
    delay: Double,
    draw: () => Unit,
    format: IFormat,
    hide: () => Unit,
    items: js.Array[IAnnotation],
    margins: IMargins,
    mousedown: js.Any => Boolean,
    mousemove: js.Any => Boolean,
    position: IPoint,
    refresh: (ISeries, Double) => Unit,
    resize: () => Unit,
    text: String,
    transparent: Boolean,
    visible: Boolean
  ): IToolTip = {
    val __obj = js.Dynamic.literal(active = active, add = js.Any.fromFunction1(add), animated = animated, autoHide = autoHide, autoRedraw = autoRedraw, bounds = bounds, chart = chart, clicked = js.Any.fromFunction1(clicked), currentIndex = currentIndex, currentSeries = currentSeries, delay = delay, draw = js.Any.fromFunction0(draw), format = format, hide = js.Any.fromFunction0(hide), items = items, margins = margins, mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), position = position, refresh = js.Any.fromFunction2(refresh), resize = js.Any.fromFunction0(resize), text = text, transparent = transparent, visible = visible)
  
    __obj.asInstanceOf[IToolTip]
  }
}

