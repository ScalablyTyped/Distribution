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
    add: js.Function1[java.lang.String, IAnnotation],
    bounds: IRectangle,
    chart: IChart,
    clicked: js.Function1[IPoint, scala.Boolean],
    draw: js.Function0[scala.Unit],
    format: IFormat,
    items: js.Array[IAnnotation],
    margins: IMargins,
    mousedown: js.Function1[js.Any, scala.Boolean],
    mousemove: js.Function1[js.Any, scala.Boolean],
    padding: scala.Double,
    position: IPoint,
    resize: js.Function0[scala.Unit],
    text: java.lang.String,
    transparent: scala.Boolean,
    visible: scala.Boolean
  ): IAxisTitle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("bounds")(bounds)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("clicked")(clicked)
    __obj.updateDynamic("draw")(draw)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("margins")(margins)
    __obj.updateDynamic("mousedown")(mousedown)
    __obj.updateDynamic("mousemove")(mousemove)
    __obj.updateDynamic("padding")(padding)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("resize")(resize)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("transparent")(transparent)
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[IAxisTitle]
  }
}

