package typings.w3cImageCapture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstrainPoint2DParameters extends StObject {
  
  var exact: js.Array[Point2D]
  
  var ideal: js.Array[Point2D]
}
object ConstrainPoint2DParameters {
  
  inline def apply(exact: js.Array[Point2D], ideal: js.Array[Point2D]): ConstrainPoint2DParameters = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], ideal = ideal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstrainPoint2DParameters]
  }
  
  extension [Self <: ConstrainPoint2DParameters](x: Self) {
    
    inline def setExact(value: js.Array[Point2D]): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactVarargs(value: Point2D*): Self = StObject.set(x, "exact", js.Array(value :_*))
    
    inline def setIdeal(value: js.Array[Point2D]): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
    
    inline def setIdealVarargs(value: Point2D*): Self = StObject.set(x, "ideal", js.Array(value :_*))
  }
}
