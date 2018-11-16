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
  
  val deleteExpired: deleteExpired with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.InstallOptions with java.lang.String
  ] = js.native
}

