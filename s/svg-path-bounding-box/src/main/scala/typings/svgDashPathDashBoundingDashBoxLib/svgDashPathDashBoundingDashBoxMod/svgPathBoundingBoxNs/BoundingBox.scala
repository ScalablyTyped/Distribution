package typings
package svgDashPathDashBoundingDashBoxLib.svgDashPathDashBoundingDashBoxMod.svgPathBoundingBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * pass in initial points if you want
     * @see https://github.com/gabelerner/canvg/blob/860e418aca67b9a41e858a223d74d375793ec364/canvg.js#L449
     */

trait BoundingBox extends js.Object {
  var x1: scala.Double
  var x2: scala.Double
  var y1: scala.Double
  var y2: scala.Double
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
  ): scala.Unit
  def addPoint(x: scala.Double, y: scala.Double): scala.Unit
  def addQuadraticCurve(
    p0x: scala.Double,
    p0y: scala.Double,
    p1x: scala.Double,
    p1y: scala.Double,
    p2x: scala.Double,
    p2y: scala.Double
  ): scala.Unit
  def addX(x: scala.Double): scala.Unit
  def addY(y: scala.Double): scala.Unit
  def height(): scala.Double
  def width(): scala.Double
}

