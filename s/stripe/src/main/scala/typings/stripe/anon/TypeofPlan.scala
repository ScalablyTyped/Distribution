package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPlan extends StObject {
  
  val TransformUsage: Any
}
object TypeofPlan {
  
  inline def apply(TransformUsage: Any): TypeofPlan = {
    val __obj = js.Dynamic.literal(TransformUsage = TransformUsage.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPlan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPlan] (val x: Self) extends AnyVal {
    
    inline def setTransformUsage(value: Any): Self = StObject.set(x, "TransformUsage", value.asInstanceOf[js.Any])
  }
}
