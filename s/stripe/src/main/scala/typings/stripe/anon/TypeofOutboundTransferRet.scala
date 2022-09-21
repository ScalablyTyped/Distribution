package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofOutboundTransferRet extends StObject {
  
  val ReturnedDetails: Any
}
object TypeofOutboundTransferRet {
  
  inline def apply(ReturnedDetails: Any): TypeofOutboundTransferRet = {
    val __obj = js.Dynamic.literal(ReturnedDetails = ReturnedDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofOutboundTransferRet]
  }
  
  extension [Self <: TypeofOutboundTransferRet](x: Self) {
    
    inline def setReturnedDetails(value: Any): Self = StObject.set(x, "ReturnedDetails", value.asInstanceOf[js.Any])
  }
}
