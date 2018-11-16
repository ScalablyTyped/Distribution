package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeySize extends js.Object

@JSGlobal("Windows.Security.Cryptography.Certificates.KeySize")
@js.native
object KeySize extends js.Object {
  @js.native
  sealed trait invalid
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeySize
  
  @js.native
  sealed trait rsa2048
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeySize
  
  @js.native
  sealed trait rsa4096
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeySize
  
  val invalid: invalid with java.lang.String = js.native
  val rsa2048: rsa2048 with java.lang.String = js.native
  val rsa4096: rsa4096 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeySize with java.lang.String
  ] = js.native
}

