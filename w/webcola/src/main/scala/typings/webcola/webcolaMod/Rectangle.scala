package typings.webcola.webcolaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "Rectangle")
@js.native
class Rectangle protected ()
  extends typings.webcola.distSrcRectangleMod.Rectangle {
  def this(x: Double, X: Double, y: Double, Y: Double) = this()
}

/* static members */
@JSImport("webcola", "Rectangle")
@js.native
object Rectangle extends js.Object {
  def empty(): typings.webcola.distSrcRectangleMod.Rectangle = js.native
  def lineIntersection(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): typings.webcola.distSrcGeomMod.Point = js.native
}

