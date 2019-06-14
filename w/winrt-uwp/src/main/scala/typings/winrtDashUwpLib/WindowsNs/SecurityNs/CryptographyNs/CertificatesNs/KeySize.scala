package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeySize extends js.Object

/** Specifies commonly used RSA algorithm key sizes. This enumeration type can be used in the KeySize property of a CertificateRequestProperties object. */
@JSGlobal("Windows.Security.Cryptography.Certificates.KeySize")
@js.native
object KeySize extends js.Object {
  /** No size is specified. */
  @js.native
  sealed trait invalid
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeySize
  
  /** The key length is 2048 bits. */
  @js.native
  sealed trait rsa2048
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeySize
  
  /** The key length is 4096 bits. */
  @js.native
  sealed trait rsa4096
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeySize
  
  /* 0 */ val invalid: invalid with scala.Double = js.native
  /* 1 */ val rsa2048: rsa2048 with scala.Double = js.native
  /* 2 */ val rsa4096: rsa4096 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeySize with scala.Double
  ] = js.native
}

