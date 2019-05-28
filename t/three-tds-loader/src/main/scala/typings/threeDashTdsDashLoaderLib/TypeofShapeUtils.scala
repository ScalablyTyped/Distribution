package typings
package threeDashTdsDashLoaderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofShapeUtils extends js.Object {
  def area(contour: js.Array[threeLib.srcExtrasShapeUtilsMod.Vec2]): scala.Double
  def isClockWise(pts: js.Array[threeLib.srcExtrasShapeUtilsMod.Vec2]): scala.Boolean
  def triangulate(contour: js.Array[threeLib.srcExtrasShapeUtilsMod.Vec2], indices: scala.Boolean): js.Array[scala.Double]
  def triangulateShape(
    contour: js.Array[threeLib.srcExtrasShapeUtilsMod.Vec2],
    holes: js.Array[threeLib.srcExtrasShapeUtilsMod.Vec2]
  ): js.Array[js.Array[scala.Double]]
}

object TypeofShapeUtils {
  @scala.inline
  def apply(
    area: js.Array[threeLib.srcExtrasShapeUtilsMod.Vec2] => scala.Double,
    isClockWise: js.Array[threeLib.srcExtrasShapeUtilsMod.Vec2] => scala.Boolean,
    triangulate: (js.Array[threeLib.srcExtrasShapeUtilsMod.Vec2], scala.Boolean) => js.Array[scala.Double],
    triangulateShape: (js.Array[threeLib.srcExtrasShapeUtilsMod.Vec2], js.Array[threeLib.srcExtrasShapeUtilsMod.Vec2]) => js.Array[js.Array[scala.Double]]
  ): TypeofShapeUtils = {
    val __obj = js.Dynamic.literal(area = js.Any.fromFunction1(area), isClockWise = js.Any.fromFunction1(isClockWise), triangulate = js.Any.fromFunction2(triangulate), triangulateShape = js.Any.fromFunction2(triangulateShape))
  
    __obj.asInstanceOf[TypeofShapeUtils]
  }
}

