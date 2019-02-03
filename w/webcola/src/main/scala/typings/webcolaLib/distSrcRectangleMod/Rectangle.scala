package typings
package webcolaLib.distSrcRectangleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/rectangle", "Rectangle")
@js.native
class Rectangle protected () extends js.Object {
  def this(x: scala.Double, X: scala.Double, y: scala.Double, Y: scala.Double) = this()
  var X: scala.Double = js.native
  var Y: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def cx(): scala.Double = js.native
  def cy(): scala.Double = js.native
  def height(): scala.Double = js.native
  def inflate(pad: scala.Double): Rectangle = js.native
  def lineIntersections(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): js.Array[webcolaLib.distSrcGeomMod.Point] = js.native
  def overlapX(r: Rectangle): scala.Double = js.native
  def overlapY(r: Rectangle): scala.Double = js.native
  def rayIntersection(x2: scala.Double, y2: scala.Double): webcolaLib.distSrcGeomMod.Point = js.native
  def setXCentre(cx: scala.Double): scala.Unit = js.native
  def setYCentre(cy: scala.Double): scala.Unit = js.native
  def union(r: Rectangle): Rectangle = js.native
  def vertices(): js.Array[webcolaLib.distSrcGeomMod.Point] = js.native
  def width(): scala.Double = js.native
}

/* static members */
@JSImport("webcola/dist/src/rectangle", "Rectangle")
@js.native
object Rectangle extends js.Object {
  def empty(): webcolaLib.distSrcRectangleMod.Rectangle = js.native
  def lineIntersection(
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double,
    x4: scala.Double,
    y4: scala.Double
  ): webcolaLib.distSrcGeomMod.Point = js.native
}

