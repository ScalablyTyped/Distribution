package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of an attempt to resolve an email recipient. */
@js.native
trait EmailRecipientResolutionResult extends StObject {
  
  /** Gets the public key for an email recipient. */
  var publicKeys: IVectorView[Certificate] = js.native
  
  /** Gets the state of an attempt to resolve an email recipient. */
  var status: EmailRecipientResolutionStatus = js.native
}
object EmailRecipientResolutionResult {
  
  @scala.inline
  def apply(publicKeys: IVectorView[Certificate], status: EmailRecipientResolutionStatus): EmailRecipientResolutionResult = {
    val __obj = js.Dynamic.literal(publicKeys = publicKeys.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailRecipientResolutionResult]
  }
  
  @scala.inline
  implicit class EmailRecipientResolutionResultMutableBuilder[Self <: EmailRecipientResolutionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublicKeys(value: IVectorView[Certificate]): Self = StObject.set(x, "publicKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: EmailRecipientResolutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
