package typings.svgIntersections.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SvgProperties[T /* <: SvgElements */] extends js.Object

object _SvgProperties {
  @scala.inline
  def LineProps[T /* <: SvgElements */](x1: Double, x2: Double, y1: Double, y2: Double): _SvgProperties[T] = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SvgProperties[T]]
  }
  @scala.inline
  def PolygonProps[T /* <: SvgElements */](points: String): _SvgProperties[T] = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SvgProperties[T]]
  }
  @scala.inline
  def PathProps[T /* <: SvgElements */](d: String): _SvgProperties[T] = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SvgProperties[T]]
  }
  @scala.inline
  def CircleProps[T /* <: SvgElements */](cx: Double, cy: Double, r: Double): _SvgProperties[T] = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SvgProperties[T]]
  }
  @scala.inline
  def RectProps[T /* <: SvgElements */](
    height: Double,
    width: Double,
    x: Double,
    y: Double,
    rx: Int | Double = null,
    ry: Int | Double = null
  ): _SvgProperties[T] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (rx != null) __obj.updateDynamic("rx")(rx.asInstanceOf[js.Any])
    if (ry != null) __obj.updateDynamic("ry")(ry.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SvgProperties[T]]
  }
  @scala.inline
  def EllipseProps[T /* <: SvgElements */](cx: Double, cy: Double, rx: Double, ry: Double): _SvgProperties[T] = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SvgProperties[T]]
  }
}

