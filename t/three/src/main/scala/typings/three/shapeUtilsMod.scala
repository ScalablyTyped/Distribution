package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shapeUtilsMod {
  
  object ShapeUtils {
    
    @JSImport("three/src/extras/ShapeUtils", "ShapeUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def area(contour: js.Array[Vec2]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("area")(contour.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def isClockWise(pts: js.Array[Vec2]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClockWise")(pts.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def triangulateShape(contour: js.Array[Vec2], holes: js.Array[js.Array[Vec2]]): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("triangulateShape")(contour.asInstanceOf[js.Any], holes.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
  }
  
  trait Vec2 extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Vec2 {
    
    @scala.inline
    def apply(x: Double, y: Double): Vec2 = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vec2]
    }
    
    @scala.inline
    implicit class Vec2MutableBuilder[Self <: Vec2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
