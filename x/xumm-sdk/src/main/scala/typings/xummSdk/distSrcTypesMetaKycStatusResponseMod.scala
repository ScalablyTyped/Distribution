package typings.xummSdk

import typings.xummSdk.xummSdkStrings.IN_PROGRESS
import typings.xummSdk.xummSdkStrings.NONE
import typings.xummSdk.xummSdkStrings.REJECTED
import typings.xummSdk.xummSdkStrings.SUCCESSFUL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMetaKycStatusResponseMod {
  
  trait KycStatusResponse extends StObject {
    
    var kycStatus: NONE | IN_PROGRESS | REJECTED | SUCCESSFUL
    
    var possibleStatuses: PossibleKycStatuses
  }
  object KycStatusResponse {
    
    inline def apply(kycStatus: NONE | IN_PROGRESS | REJECTED | SUCCESSFUL, possibleStatuses: PossibleKycStatuses): KycStatusResponse = {
      val __obj = js.Dynamic.literal(kycStatus = kycStatus.asInstanceOf[js.Any], possibleStatuses = possibleStatuses.asInstanceOf[js.Any])
      __obj.asInstanceOf[KycStatusResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KycStatusResponse] (val x: Self) extends AnyVal {
      
      inline def setKycStatus(value: NONE | IN_PROGRESS | REJECTED | SUCCESSFUL): Self = StObject.set(x, "kycStatus", value.asInstanceOf[js.Any])
      
      inline def setPossibleStatuses(value: PossibleKycStatuses): Self = StObject.set(x, "possibleStatuses", value.asInstanceOf[js.Any])
    }
  }
  
  trait PossibleKycStatuses extends StObject {
    
    var IN_PROGRESS: String
    
    var NONE: String
    
    var REJECTED: String
    
    var SUCCESSFUL: String
  }
  object PossibleKycStatuses {
    
    inline def apply(IN_PROGRESS: String, NONE: String, REJECTED: String, SUCCESSFUL: String): PossibleKycStatuses = {
      val __obj = js.Dynamic.literal(IN_PROGRESS = IN_PROGRESS.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], REJECTED = REJECTED.asInstanceOf[js.Any], SUCCESSFUL = SUCCESSFUL.asInstanceOf[js.Any])
      __obj.asInstanceOf[PossibleKycStatuses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PossibleKycStatuses] (val x: Self) extends AnyVal {
      
      inline def setIN_PROGRESS(value: String): Self = StObject.set(x, "IN_PROGRESS", value.asInstanceOf[js.Any])
      
      inline def setNONE(value: String): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      inline def setREJECTED(value: String): Self = StObject.set(x, "REJECTED", value.asInstanceOf[js.Any])
      
      inline def setSUCCESSFUL(value: String): Self = StObject.set(x, "SUCCESSFUL", value.asInstanceOf[js.Any])
    }
  }
}
