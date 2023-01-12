package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPlanCreateParams extends StObject {
  
  val TransformUsage: Any
}
object TypeofPlanCreateParams {
  
  inline def apply(TransformUsage: Any): TypeofPlanCreateParams = {
    val __obj = js.Dynamic.literal(TransformUsage = TransformUsage.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPlanCreateParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPlanCreateParams] (val x: Self) extends AnyVal {
    
    inline def setTransformUsage(value: Any): Self = StObject.set(x, "TransformUsage", value.asInstanceOf[js.Any])
  }
}
