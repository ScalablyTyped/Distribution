package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the usages of a certificate key. */
@js.native
trait CertificateKeyUsages extends js.Object {
  
  /** Gets or sets if the key is for cRLSign. */
  var crlSign: Boolean = js.native
  
  /** Gets or sets if the key is for data encipherment. */
  var dataEncipherment: Boolean = js.native
  
  /** Gets or sets if the key is for digital signature. */
  var digitalSignature: Boolean = js.native
  
  /** Gets or sets if the key is for encipher only. */
  var encipherOnly: Boolean = js.native
  
  /** Gets or sets if the key is for key agreement. */
  var keyAgreement: Boolean = js.native
  
  /** Gets or sets if the key is for key certificate sign. */
  var keyCertificateSign: Boolean = js.native
  
  /** Gets or sets if the key is for key encipherment. */
  var keyEncipherment: Boolean = js.native
  
  /** Gets or sets if the key is for non-repudiation. */
  var nonRepudiation: Boolean = js.native
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
  implicit class CertificateKeyUsagesOps[Self <: CertificateKeyUsages] (val x: Self) extends AnyVal {
    
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
    def setCrlSign(value: Boolean): Self = this.set("crlSign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataEncipherment(value: Boolean): Self = this.set("dataEncipherment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigitalSignature(value: Boolean): Self = this.set("digitalSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncipherOnly(value: Boolean): Self = this.set("encipherOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyAgreement(value: Boolean): Self = this.set("keyAgreement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyCertificateSign(value: Boolean): Self = this.set("keyCertificateSign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyEncipherment(value: Boolean): Self = this.set("keyEncipherment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonRepudiation(value: Boolean): Self = this.set("nonRepudiation", value.asInstanceOf[js.Any])
  }
}
