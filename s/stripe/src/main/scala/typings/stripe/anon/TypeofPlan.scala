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
  
  extension [Self <: TypeofPlan](x: Self) {
    
    inline def setTransformUsage(value: Any): Self = StObject.set(x, "TransformUsage", value.asInstanceOf[js.Any])
  }
}
