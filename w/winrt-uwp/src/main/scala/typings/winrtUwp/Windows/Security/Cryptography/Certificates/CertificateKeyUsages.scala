package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the usages of a certificate key. */
trait CertificateKeyUsages extends js.Object {
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
}

