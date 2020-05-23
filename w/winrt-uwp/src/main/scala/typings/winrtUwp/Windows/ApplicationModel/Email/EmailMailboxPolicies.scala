package typings.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the encryption and signing policies associates with an email mailbox. */
trait EmailMailboxPolicies extends js.Object {
  /** Gets a Boolean value that indicates whether software certificates are allowed. */
  var allowSmimeSoftCertificates: Boolean
  /** Gets the allowable SMIME encryption algorithms for the purpose of negotiating with an app. */
  var allowedSmimeEncryptionAlgorithmNegotiation: EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation
  /** Gets a Boolean value that indicates whether the sync provider that represents the email mailbox only accepts encrypted messages. */
  var mustEncryptSmimeMessages: Boolean
  /** Gets a Boolean value that indicates whether the sync provider that represents the email mailbox only accepts signed messages. */
  var mustSignSmimeMessages: Boolean
  /** Gets the required SMIME encryption algorithm. */
  var requiredSmimeEncryptionAlgorithm: EmailMailboxSmimeEncryptionAlgorithm
  /** Gets the required SMIME signing algorithm. */
  var requiredSmimeSigningAlgorithm: EmailMailboxSmimeSigningAlgorithm
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
}

