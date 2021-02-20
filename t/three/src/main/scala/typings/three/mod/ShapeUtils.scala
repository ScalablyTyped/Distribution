package typings.three.mod

import typings.three.shapeUtilsMod.Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShapeUtils {
  
  @JSImport("three", "ShapeUtils.area")
  @js.native
  def area(contour: js.Array[Vec2]): Double = js.native
  
  @JSImport("three", "ShapeUtils.isClockWise")
  @js.native
  def isClockWise(pts: js.Array[Vec2]): Boolean = js.native
  
  @JSImport("three", "ShapeUtils.triangulateShape")
  @js.native
  def triangulateShape(contour: js.Array[Vec2], holes: js.Array[js.Array[Vec2]]): js.Array[js.Array[Double]] = js.native
}
