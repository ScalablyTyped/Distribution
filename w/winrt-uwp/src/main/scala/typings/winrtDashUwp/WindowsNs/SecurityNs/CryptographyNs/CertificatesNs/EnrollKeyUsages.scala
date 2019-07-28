package typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnrollKeyUsages extends js.Object

/** Specifies the cryptographic operations that can be performed by the private key. This enumeration type is used in the KeyUsages property of a CertificateRequestProperties object. */
@JSGlobal("Windows.Security.Cryptography.Certificates.EnrollKeyUsages")
@js.native
object EnrollKeyUsages extends js.Object {
  /** The key can be used for decryption, signing. and key agreement. */
  @js.native
  sealed trait all extends EnrollKeyUsages
  
  /** The key can be used for decryption. */
  @js.native
  sealed trait decryption extends EnrollKeyUsages
  
  /** The key can be used for secret agreement encryption. */
  @js.native
  sealed trait keyAgreement extends EnrollKeyUsages
  
  /** No usage is specified for the key. */
  @js.native
  sealed trait none extends EnrollKeyUsages
  
  /** The key can be used for signing. */
  @js.native
  sealed trait signing extends EnrollKeyUsages
  
  /* 4 */ val all: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.EnrollKeyUsages.all with Double = js.native
  /* 1 */ val decryption: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.EnrollKeyUsages.decryption with Double = js.native
  /* 3 */ val keyAgreement: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.EnrollKeyUsages.keyAgreement with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.EnrollKeyUsages.none with Double = js.native
  /* 2 */ val signing: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.EnrollKeyUsages.signing with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnrollKeyUsages with Double] = js.native
}

