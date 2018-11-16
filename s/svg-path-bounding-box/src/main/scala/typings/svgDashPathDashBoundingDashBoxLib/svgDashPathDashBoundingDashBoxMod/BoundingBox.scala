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
class BoundingBox protected ()
  extends svgDashPathDashBoundingDashBoxLib.svgDashPathDashBoundingDashBoxMod.svgPathBoundingBoxNs.BoundingBox {
  def this(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double) = this()
  /* CompleteClass */
  override var x1: scala.Double = js.native
  /* CompleteClass */
  override var x2: scala.Double = js.native
  /* CompleteClass */
  override var y1: scala.Double = js.native
  /* CompleteClass */
  override var y2: scala.Double = js.native
  /** @see http://blog.hackers-cafe.net/2009/06/how-to-calculate-bezier-curves-bounding.html */
  /* CompleteClass */
  override def addBezierCurve(
    p0x: scala.Double,
    p0y: scala.Double,
    p1x: scala.Double,
    p1y: scala.Double,
    p2x: scala.Double,
    p2y: scala.Double,
    p3x: scala.Double,
    p3y: scala.Double
  ): scala.Unit = js.native
  /* CompleteClass */
  override def addPoint(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def addQuadraticCurve(
    p0x: scala.Double,
    p0y: scala.Double,
    p1x: scala.Double,
    p1y: scala.Double,
    p2x: scala.Double,
    p2y: scala.Double
  ): scala.Unit = js.native
  /* CompleteClass */
  override def addX(x: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def addY(y: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def height(): scala.Double = js.native
  /* CompleteClass */
  override def width(): scala.Double = js.native
}

