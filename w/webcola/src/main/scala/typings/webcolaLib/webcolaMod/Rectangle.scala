package typings
package webcolaLib.webcolaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "Rectangle")
@js.native
class Rectangle protected ()
  extends webcolaLib.distSrcRectangleMod.Rectangle {
  def this(x: scala.Double, X: scala.Double, y: scala.Double, Y: scala.Double) = this()
}

@JSImport("webcola", "Rectangle")
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

