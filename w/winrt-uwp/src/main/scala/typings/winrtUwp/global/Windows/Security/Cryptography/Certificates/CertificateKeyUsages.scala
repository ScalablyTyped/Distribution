package typings.winrtUwp.global.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the usages of a certificate key. */
@JSGlobal("Windows.Security.Cryptography.Certificates.CertificateKeyUsages")
@js.native
/** Creates a new instance of the CertificateKeyUsages class. */
class CertificateKeyUsages ()
  extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateKeyUsages {
  /** Gets or sets if the key is for cRLSign. */
  /* CompleteClass */
  override var crlSign: Boolean = js.native
  /** Gets or sets if the key is for data encipherment. */
  /* CompleteClass */
  override var dataEncipherment: Boolean = js.native
  /** Gets or sets if the key is for digital signature. */
  /* CompleteClass */
  override var digitalSignature: Boolean = js.native
  /** Gets or sets if the key is for encipher only. */
  /* CompleteClass */
  override var encipherOnly: Boolean = js.native
  /** Gets or sets if the key is for key agreement. */
  /* CompleteClass */
  override var keyAgreement: Boolean = js.native
  /** Gets or sets if the key is for key certificate sign. */
  /* CompleteClass */
  override var keyCertificateSign: Boolean = js.native
  /** Gets or sets if the key is for key encipherment. */
  /* CompleteClass */
  override var keyEncipherment: Boolean = js.native
  /** Gets or sets if the key is for non-repudiation. */
  /* CompleteClass */
  override var nonRepudiation: Boolean = js.native
}

