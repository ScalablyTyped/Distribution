package typings.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the encryption and signing policies associates with an email mailbox. */
@js.native
trait EmailMailboxPolicies extends js.Object {
  /** Gets a Boolean value that indicates whether software certificates are allowed. */
  var allowSmimeSoftCertificates: Boolean = js.native
  /** Gets the allowable SMIME encryption algorithms for the purpose of negotiating with an app. */
  var allowedSmimeEncryptionAlgorithmNegotiation: EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation = js.native
  /** Gets a Boolean value that indicates whether the sync provider that represents the email mailbox only accepts encrypted messages. */
  var mustEncryptSmimeMessages: Boolean = js.native
  /** Gets a Boolean value that indicates whether the sync provider that represents the email mailbox only accepts signed messages. */
  var mustSignSmimeMessages: Boolean = js.native
  /** Gets the required SMIME encryption algorithm. */
  var requiredSmimeEncryptionAlgorithm: EmailMailboxSmimeEncryptionAlgorithm = js.native
  /** Gets the required SMIME signing algorithm. */
  var requiredSmimeSigningAlgorithm: EmailMailboxSmimeSigningAlgorithm = js.native
}

object EmailMailboxPolicies {
  @scala.inline
  def apply(
    allowSmimeSoftCertificates: Boolean,
    allowedSmimeEncryptionAlgorithmNegotiation: EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation,
    mustEncryptSmimeMessages: Boolean,
    mustSignSmimeMessages: Boolean,
    requiredSmimeEncryptionAlgorithm: EmailMailboxSmimeEncryptionAlgorithm,
    requiredSmimeSigningAlgorithm: EmailMailboxSmimeSigningAlgorithm
  ): EmailMailboxPolicies = {
    val __obj = js.Dynamic.literal(allowSmimeSoftCertificates = allowSmimeSoftCertificates.asInstanceOf[js.Any], allowedSmimeEncryptionAlgorithmNegotiation = allowedSmimeEncryptionAlgorithmNegotiation.asInstanceOf[js.Any], mustEncryptSmimeMessages = mustEncryptSmimeMessages.asInstanceOf[js.Any], mustSignSmimeMessages = mustSignSmimeMessages.asInstanceOf[js.Any], requiredSmimeEncryptionAlgorithm = requiredSmimeEncryptionAlgorithm.asInstanceOf[js.Any], requiredSmimeSigningAlgorithm = requiredSmimeSigningAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMailboxPolicies]
  }
  @scala.inline
  implicit class EmailMailboxPoliciesOps[Self <: EmailMailboxPolicies] (val x: Self) extends AnyVal {
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
    def setAllowSmimeSoftCertificates(value: Boolean): Self = this.set("allowSmimeSoftCertificates", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedSmimeEncryptionAlgorithmNegotiation(value: EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation): Self = this.set("allowedSmimeEncryptionAlgorithmNegotiation", value.asInstanceOf[js.Any])
    @scala.inline
    def setMustEncryptSmimeMessages(value: Boolean): Self = this.set("mustEncryptSmimeMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def setMustSignSmimeMessages(value: Boolean): Self = this.set("mustSignSmimeMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiredSmimeEncryptionAlgorithm(value: EmailMailboxSmimeEncryptionAlgorithm): Self = this.set("requiredSmimeEncryptionAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiredSmimeSigningAlgorithm(value: EmailMailboxSmimeSigningAlgorithm): Self = this.set("requiredSmimeSigningAlgorithm", value.asInstanceOf[js.Any])
  }
  
}

