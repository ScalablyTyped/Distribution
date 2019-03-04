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
    val __obj = js.Dynamic.literal(active = active, add = add, bounds = bounds, chart = chart, clicked = clicked, draw = draw, format = format, items = items, margins = margins, mousedown = mousedown, mousemove = mousemove, padding = padding, position = position, resize = resize, text = text, transparent = transparent, visible = visible)
  
    __obj.asInstanceOf[IAxisTitle]
  }
}

