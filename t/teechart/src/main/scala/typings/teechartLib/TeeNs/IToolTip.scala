package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToolTip extends IAnnotation {
  var animated: scala.Double
  var autoHide: scala.Boolean
  var autoRedraw: scala.Boolean
  var currentIndex: scala.Double
  var currentSeries: ISeries
  var delay: scala.Double
  def hide(): scala.Unit
  def refresh(series: ISeries, index: scala.Double): scala.Unit
}

object IToolTip {
  @scala.inline
  def apply(
    active: scala.Boolean,
    add: java.lang.String => IAnnotation,
    animated: scala.Double,
    autoHide: scala.Boolean,
    autoRedraw: scala.Boolean,
    bounds: IRectangle,
    chart: IChart,
    clicked: IPoint => scala.Boolean,
    currentIndex: scala.Double,
    currentSeries: ISeries,
    delay: scala.Double,
    draw: () => scala.Unit,
    format: IFormat,
    hide: () => scala.Unit,
    items: js.Array[IAnnotation],
    margins: IMargins,
    mousedown: js.Any => scala.Boolean,
    mousemove: js.Any => scala.Boolean,
    position: IPoint,
    refresh: (ISeries, scala.Double) => scala.Unit,
    resize: () => scala.Unit,
    text: java.lang.String,
    transparent: scala.Boolean,
    visible: scala.Boolean
  ): IToolTip = {
    val __obj = js.Dynamic.literal(active = active, add = js.Any.fromFunction1(add), animated = animated, autoHide = autoHide, autoRedraw = autoRedraw, bounds = bounds, chart = chart, clicked = js.Any.fromFunction1(clicked), currentIndex = currentIndex, currentSeries = currentSeries, delay = delay, draw = js.Any.fromFunction0(draw), format = format, hide = js.Any.fromFunction0(hide), items = items, margins = margins, mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), position = position, refresh = js.Any.fromFunction2(refresh), resize = js.Any.fromFunction0(resize), text = text, transparent = transparent, visible = visible)
  
    __obj.asInstanceOf[IToolTip]
  }
}

