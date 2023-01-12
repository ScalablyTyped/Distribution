package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAuthorization extends StObject {
  
  val PendingRequest: Any
  
  val RequestHistory: Any
  
  val VerificationData: Any
}
object TypeofAuthorization {
  
  inline def apply(PendingRequest: Any, RequestHistory: Any, VerificationData: Any): TypeofAuthorization = {
    val __obj = js.Dynamic.literal(PendingRequest = PendingRequest.asInstanceOf[js.Any], RequestHistory = RequestHistory.asInstanceOf[js.Any], VerificationData = VerificationData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAuthorization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofAuthorization] (val x: Self) extends AnyVal {
    
    inline def setPendingRequest(value: Any): Self = StObject.set(x, "PendingRequest", value.asInstanceOf[js.Any])
    
    inline def setRequestHistory(value: Any): Self = StObject.set(x, "RequestHistory", value.asInstanceOf[js.Any])
    
    inline def setVerificationData(value: Any): Self = StObject.set(x, "VerificationData", value.asInstanceOf[js.Any])
  }
}
