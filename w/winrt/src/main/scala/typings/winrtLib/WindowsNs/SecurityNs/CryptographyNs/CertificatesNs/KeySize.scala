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
  
  /* 0 */ val invalid: invalid with scala.Double = js.native
  /* 1 */ val rsa2048: rsa2048 with scala.Double = js.native
  /* 2 */ val rsa4096: rsa4096 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeySize with scala.Double
  ] = js.native
}

