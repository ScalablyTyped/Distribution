package typings.w3cImageCapture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstrainPoint2DParameters extends StObject {
  
  var exact: js.Array[Point2D] = js.native
  
  var ideal: js.Array[Point2D] = js.native
}
object ConstrainPoint2DParameters {
  
  @scala.inline
  def apply(exact: js.Array[Point2D], ideal: js.Array[Point2D]): ConstrainPoint2DParameters = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], ideal = ideal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstrainPoint2DParameters]
  }
  
  @scala.inline
  implicit class ConstrainPoint2DParametersMutableBuilder[Self <: ConstrainPoint2DParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExact(value: js.Array[Point2D]): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactVarargs(value: Point2D*): Self = StObject.set(x, "exact", js.Array(value :_*))
    
    @scala.inline
    def setIdeal(value: js.Array[Point2D]): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdealVarargs(value: Point2D*): Self = StObject.set(x, "ideal", js.Array(value :_*))
  }
}
