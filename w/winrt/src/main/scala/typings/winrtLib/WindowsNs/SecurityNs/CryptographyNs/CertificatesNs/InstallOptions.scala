package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InstallOptions extends js.Object

@JSGlobal("Windows.Security.Cryptography.Certificates.InstallOptions")
@js.native
object InstallOptions extends js.Object {
  @js.native
  sealed trait deleteExpired
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.InstallOptions
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.InstallOptions
  
  /* 1 */ val deleteExpired: deleteExpired with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.InstallOptions with scala.Double
  ] = js.native
}

