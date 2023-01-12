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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofInboundTransferFail] (val x: Self) extends AnyVal {
    
    inline def setFailureDetails(value: Any): Self = StObject.set(x, "FailureDetails", value.asInstanceOf[js.Any])
  }
}
