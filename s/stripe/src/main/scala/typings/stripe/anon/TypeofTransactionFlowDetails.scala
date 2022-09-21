package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTransactionFlowDetails extends StObject {
  
  val FlowDetails: Any
}
object TypeofTransactionFlowDetails {
  
  inline def apply(FlowDetails: Any): TypeofTransactionFlowDetails = {
    val __obj = js.Dynamic.literal(FlowDetails = FlowDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTransactionFlowDetails]
  }
  
  extension [Self <: TypeofTransactionFlowDetails](x: Self) {
    
    inline def setFlowDetails(value: Any): Self = StObject.set(x, "FlowDetails", value.asInstanceOf[js.Any])
  }
}
