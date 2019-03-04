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
    add: js.Function1[java.lang.String, IAnnotation],
    animated: scala.Double,
    autoHide: scala.Boolean,
    autoRedraw: scala.Boolean,
    bounds: IRectangle,
    chart: IChart,
    clicked: js.Function1[IPoint, scala.Boolean],
    currentIndex: scala.Double,
    currentSeries: ISeries,
    delay: scala.Double,
    draw: js.Function0[scala.Unit],
    format: IFormat,
    hide: js.Function0[scala.Unit],
    items: js.Array[IAnnotation],
    margins: IMargins,
    mousedown: js.Function1[js.Any, scala.Boolean],
    mousemove: js.Function1[js.Any, scala.Boolean],
    position: IPoint,
    refresh: js.Function2[ISeries, scala.Double, scala.Unit],
    resize: js.Function0[scala.Unit],
    text: java.lang.String,
    transparent: scala.Boolean,
    visible: scala.Boolean
  ): IToolTip = {
    val __obj = js.Dynamic.literal(active = active, add = add, animated = animated, autoHide = autoHide, autoRedraw = autoRedraw, bounds = bounds, chart = chart, clicked = clicked, currentIndex = currentIndex, currentSeries = currentSeries, delay = delay, draw = draw, format = format, hide = hide, items = items, margins = margins, mousedown = mousedown, mousemove = mousemove, position = position, refresh = refresh, resize = resize, text = text, transparent = transparent, visible = visible)
  
    __obj.asInstanceOf[IToolTip]
  }
}

