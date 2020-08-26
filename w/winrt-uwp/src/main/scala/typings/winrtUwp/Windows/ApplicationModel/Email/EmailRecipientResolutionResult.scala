package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of an attempt to resolve an email recipient. */
@js.native
trait EmailRecipientResolutionResult extends js.Object {
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
  implicit class EmailRecipientResolutionResultOps[Self <: EmailRecipientResolutionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPublicKeys(value: IVectorView[Certificate]): Self = this.set("publicKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: EmailRecipientResolutionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

