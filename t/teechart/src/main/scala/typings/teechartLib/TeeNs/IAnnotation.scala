package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnnotation extends ITool {
  var bounds: IRectangle
  var format: IFormat
  var items: js.Array[IAnnotation]
  var margins: IMargins
  var position: IPoint
  var text: java.lang.String
  var transparent: scala.Boolean
  var visible: scala.Boolean
  def add(text: java.lang.String): IAnnotation
  def resize(): scala.Unit
}

object IAnnotation {
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
    position: IPoint,
    resize: js.Function0[scala.Unit],
    text: java.lang.String,
    transparent: scala.Boolean,
    visible: scala.Boolean
  ): IAnnotation = {
    val __obj = js.Dynamic.literal(active = active, add = add, bounds = bounds, chart = chart, clicked = clicked, draw = draw, format = format, items = items, margins = margins, mousedown = mousedown, mousemove = mousemove, position = position, resize = resize, text = text, transparent = transparent, visible = visible)
  
    __obj.asInstanceOf[IAnnotation]
  }
}

