package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of an attempt to resolve an email recipient. */
trait EmailRecipientResolutionResult extends js.Object {
  /** Gets the public key for an email recipient. */
  var publicKeys: IVectorView[Certificate]
  /** Gets the state of an attempt to resolve an email recipient. */
  var status: EmailRecipientResolutionStatus
}

object EmailRecipientResolutionResult {
  @scala.inline
  def apply(publicKeys: IVectorView[Certificate], status: EmailRecipientResolutionStatus): EmailRecipientResolutionResult = {
    val __obj = js.Dynamic.literal(publicKeys = publicKeys.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailRecipientResolutionResult]
  }
}

