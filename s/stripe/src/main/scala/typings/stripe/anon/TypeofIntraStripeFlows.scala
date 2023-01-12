package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofIntraStripeFlows extends StObject {
  
  val StatusDetail: Any
}
object TypeofIntraStripeFlows {
  
  inline def apply(StatusDetail: Any): TypeofIntraStripeFlows = {
    val __obj = js.Dynamic.literal(StatusDetail = StatusDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofIntraStripeFlows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofIntraStripeFlows] (val x: Self) extends AnyVal {
    
    inline def setStatusDetail(value: Any): Self = StObject.set(x, "StatusDetail", value.asInstanceOf[js.Any])
  }
}
