package typings.winrtUwp.global.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the cryptographic operations that can be performed by the private key. This enumeration type is used in the KeyUsages property of a CertificateRequestProperties object. */
@JSGlobal("Windows.Security.Cryptography.Certificates.EnrollKeyUsages")
@js.native
object EnrollKeyUsages extends js.Object {
  /* 4 */ val all: typings.winrtUwp.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.all with Double = js.native
  /* 1 */ val decryption: typings.winrtUwp.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.decryption with Double = js.native
  /* 3 */ val keyAgreement: typings.winrtUwp.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.keyAgreement with Double = js.native
  /* 0 */ val none: typings.winrtUwp.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.none with Double = js.native
  /* 2 */ val signing: typings.winrtUwp.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.signing with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Security.Cryptography.Certificates.EnrollKeyUsages with Double
  ] = js.native
}

