package typings.three.mod

import typings.three.srcExtrasShapeUtilsMod.Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShapeUtils {
  
  @JSImport("three", "ShapeUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Calculate area of a ( 2D ) contour polygon.
    */
  inline def area(contour: js.Array[Vec2]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("area")(contour.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Note that this is a linear function so it is necessary to calculate separately for x, y components of a polygon.
    * @remarks Used internally by {@link THREE.Path | Path}, {@link THREE.ExtrudeGeometry | ExtrudeGeometry} and {@link THREE.ShapeGeometry | ShapeGeometry}.
    */
  inline def isClockWise(pts: js.Array[Vec2]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClockWise")(pts.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Used internally by {@link THREE.ExtrudeGeometry | ExtrudeGeometry} and {@link THREE.ShapeGeometry | ShapeGeometry} to calculate faces in shapes with holes.
    */
  inline def triangulateShape(contour: js.Array[Vec2], holes: js.Array[js.Array[Vec2]]): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("triangulateShape")(contour.asInstanceOf[js.Any], holes.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
}
