package typings.three.srcThreeMod

import typings.three.srcExtrasShapeUtilsMod.Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShapeUtils {
  
  @JSImport("three/src/Three", "ShapeUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def area(contour: js.Array[Vec2]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("area")(contour.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isClockWise(pts: js.Array[Vec2]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClockWise")(pts.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def triangulateShape(contour: js.Array[Vec2], holes: js.Array[js.Array[Vec2]]): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("triangulateShape")(contour.asInstanceOf[js.Any], holes.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
}
