package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

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
  sealed trait all
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.EnrollKeyUsages
  
  /** The key can be used for decryption. */
  @js.native
  sealed trait decryption
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.EnrollKeyUsages
  
  /** The key can be used for secret agreement encryption. */
  @js.native
  sealed trait keyAgreement
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.EnrollKeyUsages
  
  /** No usage is specified for the key. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.EnrollKeyUsages
  
  /** The key can be used for signing. */
  @js.native
  sealed trait signing
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.EnrollKeyUsages
  
  /* 4 */ val all: all with scala.Double = js.native
  /* 1 */ val decryption: decryption with scala.Double = js.native
  /* 3 */ val keyAgreement: keyAgreement with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val signing: signing with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.EnrollKeyUsages with scala.Double
  ] = js.native
}

