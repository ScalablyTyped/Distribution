package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the usages of a certificate key. */
@JSGlobal("Windows.Security.Cryptography.Certificates.CertificateKeyUsages")
@js.native
class CertificateKeyUsages () extends js.Object {
  /** Gets or sets if the key is for cRLSign. */
  var crlSign: scala.Boolean = js.native
  /** Gets or sets if the key is for data encipherment. */
  var dataEncipherment: scala.Boolean = js.native
  /** Gets or sets if the key is for digital signature. */
  var digitalSignature: scala.Boolean = js.native
  /** Gets or sets if the key is for encipher only. */
  var encipherOnly: scala.Boolean = js.native
  /** Gets or sets if the key is for key agreement. */
  var keyAgreement: scala.Boolean = js.native
  /** Gets or sets if the key is for key certificate sign. */
  var keyCertificateSign: scala.Boolean = js.native
  /** Gets or sets if the key is for key encipherment. */
  var keyEncipherment: scala.Boolean = js.native
  /** Gets or sets if the key is for non-repudiation. */
  var nonRepudiation: scala.Boolean = js.native
}

