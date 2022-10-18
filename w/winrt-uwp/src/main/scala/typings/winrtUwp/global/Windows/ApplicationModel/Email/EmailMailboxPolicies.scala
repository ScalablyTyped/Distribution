package typings.winrtUwp.global.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the encryption and signing policies associates with an email mailbox. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Email.EmailMailboxPolicies")
@js.native
open class EmailMailboxPolicies ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxPolicies {
  
  /** Gets a Boolean value that indicates whether software certificates are allowed. */
  /* CompleteClass */
  var allowSmimeSoftCertificates: Boolean = js.native
  
  /** Gets the allowable SMIME encryption algorithms for the purpose of negotiating with an app. */
  /* CompleteClass */
  var allowedSmimeEncryptionAlgorithmNegotiation: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation = js.native
  
  /** Gets a Boolean value that indicates whether the sync provider that represents the email mailbox only accepts encrypted messages. */
  /* CompleteClass */
  var mustEncryptSmimeMessages: Boolean = js.native
  
  /** Gets a Boolean value that indicates whether the sync provider that represents the email mailbox only accepts signed messages. */
  /* CompleteClass */
  var mustSignSmimeMessages: Boolean = js.native
  
  /** Gets the required SMIME encryption algorithm. */
  /* CompleteClass */
  var requiredSmimeEncryptionAlgorithm: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxSmimeEncryptionAlgorithm = js.native
  
  /** Gets the required SMIME signing algorithm. */
  /* CompleteClass */
  var requiredSmimeSigningAlgorithm: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxSmimeSigningAlgorithm = js.native
}
