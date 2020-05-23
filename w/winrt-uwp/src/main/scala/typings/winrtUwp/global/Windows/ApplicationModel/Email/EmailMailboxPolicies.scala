package typings.winrtUwp.global.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the encryption and signing policies associates with an email mailbox. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxPolicies")
@js.native
abstract class EmailMailboxPolicies ()
  extends typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxPolicies {
  /** Gets a Boolean value that indicates whether software certificates are allowed. */
  /* CompleteClass */
  override var allowSmimeSoftCertificates: Boolean = js.native
  /** Gets the allowable SMIME encryption algorithms for the purpose of negotiating with an app. */
  /* CompleteClass */
  override var allowedSmimeEncryptionAlgorithmNegotiation: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation = js.native
  /** Gets a Boolean value that indicates whether the sync provider that represents the email mailbox only accepts encrypted messages. */
  /* CompleteClass */
  override var mustEncryptSmimeMessages: Boolean = js.native
  /** Gets a Boolean value that indicates whether the sync provider that represents the email mailbox only accepts signed messages. */
  /* CompleteClass */
  override var mustSignSmimeMessages: Boolean = js.native
  /** Gets the required SMIME encryption algorithm. */
  /* CompleteClass */
  override var requiredSmimeEncryptionAlgorithm: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxSmimeEncryptionAlgorithm = js.native
  /** Gets the required SMIME signing algorithm. */
  /* CompleteClass */
  override var requiredSmimeSigningAlgorithm: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxSmimeSigningAlgorithm = js.native
}

