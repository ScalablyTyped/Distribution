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
  
  val all: all with java.lang.String = js.native
  val decryption: decryption with java.lang.String = js.native
  val keyAgreement: keyAgreement with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val signing: signing with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.EnrollKeyUsages with java.lang.String
  ] = js.native
}

