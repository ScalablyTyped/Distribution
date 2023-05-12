package typings.three.anon

import typings.three.srcExtrasCoreShapeMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurveSegments extends StObject {
  
  val curveSegments: Double
  
  val shapes: Shape | js.Array[Shape]
}
object CurveSegments {
  
  inline def apply(curveSegments: Double, shapes: Shape | js.Array[Shape]): CurveSegments = {
    val __obj = js.Dynamic.literal(curveSegments = curveSegments.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurveSegments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CurveSegments] (val x: Self) extends AnyVal {
    
    inline def setCurveSegments(value: Double): Self = StObject.set(x, "curveSegments", value.asInstanceOf[js.Any])
    
    inline def setShapes(value: Shape | js.Array[Shape]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    inline def setShapesVarargs(value: Shape*): Self = StObject.set(x, "shapes", js.Array(value*))
  }
}
