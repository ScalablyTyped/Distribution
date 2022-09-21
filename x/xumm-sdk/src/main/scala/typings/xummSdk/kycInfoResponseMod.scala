package typings.xummSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kycInfoResponseMod {
  
  trait KycInfoResponse extends StObject {
    
    var account: String
    
    var kycApproved: Boolean
  }
  object KycInfoResponse {
    
    inline def apply(account: String, kycApproved: Boolean): KycInfoResponse = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], kycApproved = kycApproved.asInstanceOf[js.Any])
      __obj.asInstanceOf[KycInfoResponse]
    }
    
    extension [Self <: KycInfoResponse](x: Self) {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setKycApproved(value: Boolean): Self = StObject.set(x, "kycApproved", value.asInstanceOf[js.Any])
    }
  }
}
