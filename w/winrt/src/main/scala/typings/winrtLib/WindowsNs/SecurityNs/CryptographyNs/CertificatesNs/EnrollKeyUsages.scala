package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnrollKeyUsages extends js.Object

@JSGlobal("Windows.Security.Cryptography.Certificates.EnrollKeyUsages")
@js.native
object EnrollKeyUsages extends js.Object {
  @js.native
  sealed trait all
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.EnrollKeyUsages
  
  @js.native
  sealed trait decryption
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.EnrollKeyUsages
  
  @js.native
  sealed trait keyAgreement
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.EnrollKeyUsages
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.EnrollKeyUsages
  
  @js.native
  sealed trait signing
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.EnrollKeyUsages
  
  /* 4 */ val all: all with scala.Double = js.native
  /* 1 */ val decryption: decryption with scala.Double = js.native
  /* 3 */ val keyAgreement: keyAgreement with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val signing: signing with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.EnrollKeyUsages with scala.Double
  ] = js.native
}

