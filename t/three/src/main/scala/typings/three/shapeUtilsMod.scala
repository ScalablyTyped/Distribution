package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shapeUtilsMod {
  
  object ShapeUtils {
    
    @JSImport("three/src/extras/ShapeUtils", "ShapeUtils.area")
    @js.native
    def area(contour: js.Array[Vec2]): Double = js.native
    
    @JSImport("three/src/extras/ShapeUtils", "ShapeUtils.isClockWise")
    @js.native
    def isClockWise(pts: js.Array[Vec2]): Boolean = js.native
    
    @JSImport("three/src/extras/ShapeUtils", "ShapeUtils.triangulateShape")
    @js.native
    def triangulateShape(contour: js.Array[Vec2], holes: js.Array[js.Array[Vec2]]): js.Array[js.Array[Double]] = js.native
  }
  
  @js.native
  trait Vec2 extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
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
