package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the encryption and signing policies associates with an email mailbox. */
trait EmailMailboxPolicies extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: EmailMailboxPolicies](x: Self) {
    
    inline def setAllowSmimeSoftCertificates(value: Boolean): Self = StObject.set(x, "allowSmimeSoftCertificates", value.asInstanceOf[js.Any])
    
    inline def setAllowedSmimeEncryptionAlgorithmNegotiation(value: EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation): Self = StObject.set(x, "allowedSmimeEncryptionAlgorithmNegotiation", value.asInstanceOf[js.Any])
    
    inline def setMustEncryptSmimeMessages(value: Boolean): Self = StObject.set(x, "mustEncryptSmimeMessages", value.asInstanceOf[js.Any])
    
    inline def setMustSignSmimeMessages(value: Boolean): Self = StObject.set(x, "mustSignSmimeMessages", value.asInstanceOf[js.Any])
    
    inline def setRequiredSmimeEncryptionAlgorithm(value: EmailMailboxSmimeEncryptionAlgorithm): Self = StObject.set(x, "requiredSmimeEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setRequiredSmimeSigningAlgorithm(value: EmailMailboxSmimeSigningAlgorithm): Self = StObject.set(x, "requiredSmimeSigningAlgorithm", value.asInstanceOf[js.Any])
  }
}
