package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRefund extends StObject {
  
  val NextAction: TypeofNextActionDisplayDetails
}
object TypeofRefund {
  
  inline def apply(NextAction: TypeofNextActionDisplayDetails): TypeofRefund = {
    val __obj = js.Dynamic.literal(NextAction = NextAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRefund]
  }
  
  extension [Self <: TypeofRefund](x: Self) {
    
    inline def setNextAction(value: TypeofNextActionDisplayDetails): Self = StObject.set(x, "NextAction", value.asInstanceOf[js.Any])
  }
}
