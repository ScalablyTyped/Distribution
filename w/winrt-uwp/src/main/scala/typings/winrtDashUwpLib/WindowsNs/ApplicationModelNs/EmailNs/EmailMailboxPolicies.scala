package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the encryption and signing policies associates with an email mailbox. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxPolicies")
@js.native
abstract class EmailMailboxPolicies () extends js.Object {
  /** Gets a Boolean value that indicates whether software certificates are allowed. */
  var allowSmimeSoftCertificates: scala.Boolean = js.native
  /** Gets the allowable SMIME encryption algorithms for the purpose of negotiating with an app. */
  var allowedSmimeEncryptionAlgorithmNegotiation: EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation = js.native
  /** Gets a Boolean value that indicates whether the sync provider that represents the email mailbox only accepts encrypted messages. */
  var mustEncryptSmimeMessages: scala.Boolean = js.native
  /** Gets a Boolean value that indicates whether the sync provider that represents the email mailbox only accepts signed messages. */
  var mustSignSmimeMessages: scala.Boolean = js.native
  /** Gets the required SMIME encryption algorithm. */
  var requiredSmimeEncryptionAlgorithm: EmailMailboxSmimeEncryptionAlgorithm = js.native
  /** Gets the required SMIME signing algorithm. */
  var requiredSmimeSigningAlgorithm: EmailMailboxSmimeSigningAlgorithm = js.native
}

