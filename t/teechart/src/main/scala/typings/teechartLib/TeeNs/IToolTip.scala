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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("animated")(animated)
    __obj.updateDynamic("autoHide")(autoHide)
    __obj.updateDynamic("autoRedraw")(autoRedraw)
    __obj.updateDynamic("bounds")(bounds)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("clicked")(clicked)
    __obj.updateDynamic("currentIndex")(currentIndex)
    __obj.updateDynamic("currentSeries")(currentSeries)
    __obj.updateDynamic("delay")(delay)
    __obj.updateDynamic("draw")(draw)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("margins")(margins)
    __obj.updateDynamic("mousedown")(mousedown)
    __obj.updateDynamic("mousemove")(mousemove)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("refresh")(refresh)
    __obj.updateDynamic("resize")(resize)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("transparent")(transparent)
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[IToolTip]
  }
}

