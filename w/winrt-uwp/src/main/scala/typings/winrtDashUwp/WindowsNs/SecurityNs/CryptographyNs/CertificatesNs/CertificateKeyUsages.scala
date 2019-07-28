package typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the usages of a certificate key. */
@JSGlobal("Windows.Security.Cryptography.Certificates.CertificateKeyUsages")
@js.native
/** Creates a new instance of the CertificateKeyUsages class. */
class CertificateKeyUsages () extends js.Object {
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

