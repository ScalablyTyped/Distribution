package typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

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
  sealed trait invalid extends KeySize
  
  /** The key length is 2048 bits. */
  @js.native
  sealed trait rsa2048 extends KeySize
  
  /** The key length is 4096 bits. */
  @js.native
  sealed trait rsa4096 extends KeySize
  
  /* 0 */ val invalid: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeySize.invalid with Double = js.native
  /* 1 */ val rsa2048: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeySize.rsa2048 with Double = js.native
  /* 2 */ val rsa4096: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeySize.rsa4096 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeySize with Double] = js.native
}

