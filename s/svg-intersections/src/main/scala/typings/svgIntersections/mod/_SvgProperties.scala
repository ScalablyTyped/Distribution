package typings.svgIntersections.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SvgProperties[T /* <: SvgElements */] extends js.Object

object _SvgProperties {
  @scala.inline
  def LineProps[/* <: typings.svgIntersections.mod.SvgElements */ T](x1: Double, x2: Double, y1: Double, y2: Double): _SvgProperties[T] = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SvgProperties[T]]
  }
  @scala.inline
  def PolygonProps[/* <: typings.svgIntersections.mod.SvgElements */ T](points: String): _SvgProperties[T] = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SvgProperties[T]]
  }
  @scala.inline
  def PathProps[/* <: typings.svgIntersections.mod.SvgElements */ T](d: String): _SvgProperties[T] = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SvgProperties[T]]
  }
  @scala.inline
  def CircleProps[/* <: typings.svgIntersections.mod.SvgElements */ T](cx: Double, cy: Double, r: Double): _SvgProperties[T] = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SvgProperties[T]]
  }
  @scala.inline
  def RectProps[/* <: typings.svgIntersections.mod.SvgElements */ T](
    height: Double,
    width: Double,
    x: Double,
    y: Double,
    rx: js.UndefOr[Double] = js.undefined,
    ry: js.UndefOr[Double] = js.undefined
  ): _SvgProperties[T] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(rx)) __obj.updateDynamic("rx")(rx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ry)) __obj.updateDynamic("ry")(ry.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SvgProperties[T]]
  }
  @scala.inline
  def EllipseProps[/* <: typings.svgIntersections.mod.SvgElements */ T](cx: Double, cy: Double, rx: Double, ry: Double): _SvgProperties[T] = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SvgProperties[T]]
  }
}

