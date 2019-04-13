package typings
package svgDashPathDashBoundingDashBoxLib.svgDashPathDashBoundingDashBoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * pass in initial points if you want
  * @see https://github.com/gabelerner/canvg/blob/860e418aca67b9a41e858a223d74d375793ec364/canvg.js#L449
  */
@JSImport("svg-path-bounding-box", "BoundingBox")
@js.native
class BoundingBox protected () extends js.Object {
  def this(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double) = this()
  var x1: scala.Double = js.native
  var x2: scala.Double = js.native
  var y1: scala.Double = js.native
  var y2: scala.Double = js.native
  /** @see http://blog.hackers-cafe.net/2009/06/how-to-calculate-bezier-curves-bounding.html */
  def addBezierCurve(
    p0x: scala.Double,
    p0y: scala.Double,
    p1x: scala.Double,
    p1y: scala.Double,
    p2x: scala.Double,
    p2y: scala.Double,
    p3x: scala.Double,
    p3y: scala.Double
  ): scala.Unit = js.native
  def addPoint(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def addQuadraticCurve(
    p0x: scala.Double,
    p0y: scala.Double,
    p1x: scala.Double,
    p1y: scala.Double,
    p2x: scala.Double,
    p2y: scala.Double
  ): scala.Unit = js.native
  def addX(x: scala.Double): scala.Unit = js.native
  def addY(y: scala.Double): scala.Unit = js.native
  def height(): scala.Double = js.native
  def width(): scala.Double = js.native
}

