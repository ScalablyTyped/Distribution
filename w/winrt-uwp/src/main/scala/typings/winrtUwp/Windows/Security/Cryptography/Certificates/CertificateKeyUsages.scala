package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the usages of a certificate key. */
trait CertificateKeyUsages extends StObject {
  
  /** Gets or sets if the key is for cRLSign. */
  var crlSign: Boolean
  
  /** Gets or sets if the key is for data encipherment. */
  var dataEncipherment: Boolean
  
  /** Gets or sets if the key is for digital signature. */
  var digitalSignature: Boolean
  
  /** Gets or sets if the key is for encipher only. */
  var encipherOnly: Boolean
  
  /** Gets or sets if the key is for key agreement. */
  var keyAgreement: Boolean
  
  /** Gets or sets if the key is for key certificate sign. */
  var keyCertificateSign: Boolean
  
  /** Gets or sets if the key is for key encipherment. */
  var keyEncipherment: Boolean
  
  /** Gets or sets if the key is for non-repudiation. */
  var nonRepudiation: Boolean
}
object CertificateKeyUsages {
  
  @scala.inline
  def apply(
    crlSign: Boolean,
    dataEncipherment: Boolean,
    digitalSignature: Boolean,
    encipherOnly: Boolean,
    keyAgreement: Boolean,
    keyCertificateSign: Boolean,
    keyEncipherment: Boolean,
    nonRepudiation: Boolean
  ): CertificateKeyUsages = {
    val __obj = js.Dynamic.literal(crlSign = crlSign.asInstanceOf[js.Any], dataEncipherment = dataEncipherment.asInstanceOf[js.Any], digitalSignature = digitalSignature.asInstanceOf[js.Any], encipherOnly = encipherOnly.asInstanceOf[js.Any], keyAgreement = keyAgreement.asInstanceOf[js.Any], keyCertificateSign = keyCertificateSign.asInstanceOf[js.Any], keyEncipherment = keyEncipherment.asInstanceOf[js.Any], nonRepudiation = nonRepudiation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateKeyUsages]
  }
  
  @scala.inline
  implicit class CertificateKeyUsagesMutableBuilder[Self <: CertificateKeyUsages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrlSign(value: Boolean): Self = StObject.set(x, "crlSign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataEncipherment(value: Boolean): Self = StObject.set(x, "dataEncipherment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigitalSignature(value: Boolean): Self = StObject.set(x, "digitalSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncipherOnly(value: Boolean): Self = StObject.set(x, "encipherOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyAgreement(value: Boolean): Self = StObject.set(x, "keyAgreement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyCertificateSign(value: Boolean): Self = StObject.set(x, "keyCertificateSign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyEncipherment(value: Boolean): Self = StObject.set(x, "keyEncipherment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonRepudiation(value: Boolean): Self = StObject.set(x, "nonRepudiation", value.asInstanceOf[js.Any])
  }
}
