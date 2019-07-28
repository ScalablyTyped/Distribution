package typings.three.srcExtrasShapeUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/ShapeUtils", "ShapeUtils")
@js.native
object ShapeUtilsNs extends js.Object {
  def area(contour: js.Array[Vec2]): Double = js.native
  def isClockWise(pts: js.Array[Vec2]): Boolean = js.native
  def triangulate(contour: js.Array[Vec2], indices: Boolean): js.Array[Double] = js.native
  def triangulateShape(contour: js.Array[Vec2], holes: js.Array[Vec2]): js.Array[js.Array[Double]] = js.native
}

