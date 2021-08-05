package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of an attempt to resolve an email recipient. */
trait EmailRecipientResolutionResult extends StObject {
  
  /** Gets the public key for an email recipient. */
  var publicKeys: IVectorView[Certificate]
  
  /** Gets the state of an attempt to resolve an email recipient. */
  var status: EmailRecipientResolutionStatus
}
object EmailRecipientResolutionResult {
  
  inline def apply(publicKeys: IVectorView[Certificate], status: EmailRecipientResolutionStatus): EmailRecipientResolutionResult = {
    val __obj = js.Dynamic.literal(publicKeys = publicKeys.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailRecipientResolutionResult]
  }
  
  extension [Self <: EmailRecipientResolutionResult](x: Self) {
    
    inline def setPublicKeys(value: IVectorView[Certificate]): Self = StObject.set(x, "publicKeys", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: EmailRecipientResolutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
