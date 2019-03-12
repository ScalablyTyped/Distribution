package typings
package threeDashTdsDashLoaderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Area extends js.Object {
  def area(contour: js.Array[threeLib.threeDashCoreMod.Vec2]): scala.Double
  def isClockWise(pts: js.Array[threeLib.threeDashCoreMod.Vec2]): scala.Boolean
  def triangulate(contour: js.Array[threeLib.threeDashCoreMod.Vec2], indices: scala.Boolean): js.Array[scala.Double]
  def triangulateShape(contour: js.Array[threeLib.threeDashCoreMod.Vec2], holes: js.Array[threeLib.threeDashCoreMod.Vec2]): js.Array[js.Array[scala.Double]]
}

object Anon_Area {
  @scala.inline
  def apply(
    area: js.Array[threeLib.threeDashCoreMod.Vec2] => scala.Double,
    isClockWise: js.Array[threeLib.threeDashCoreMod.Vec2] => scala.Boolean,
    triangulate: (js.Array[threeLib.threeDashCoreMod.Vec2], scala.Boolean) => js.Array[scala.Double],
    triangulateShape: (js.Array[threeLib.threeDashCoreMod.Vec2], js.Array[threeLib.threeDashCoreMod.Vec2]) => js.Array[js.Array[scala.Double]]
  ): Anon_Area = {
    val __obj = js.Dynamic.literal(area = js.Any.fromFunction1(area), isClockWise = js.Any.fromFunction1(isClockWise), triangulate = js.Any.fromFunction2(triangulate), triangulateShape = js.Any.fromFunction2(triangulateShape))
  
    __obj.asInstanceOf[Anon_Area]
  }
}

