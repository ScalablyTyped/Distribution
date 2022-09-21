package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofInboundTransferFail extends StObject {
  
  val FailureDetails: Any
}
object TypeofInboundTransferFail {
  
  inline def apply(FailureDetails: Any): TypeofInboundTransferFail = {
    val __obj = js.Dynamic.literal(FailureDetails = FailureDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofInboundTransferFail]
  }
  
  extension [Self <: TypeofInboundTransferFail](x: Self) {
    
    inline def setFailureDetails(value: Any): Self = StObject.set(x, "FailureDetails", value.asInstanceOf[js.Any])
  }
}
