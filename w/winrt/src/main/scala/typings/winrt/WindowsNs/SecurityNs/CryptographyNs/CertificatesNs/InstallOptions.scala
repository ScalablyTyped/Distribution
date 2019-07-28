package typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InstallOptions extends js.Object

@JSGlobal("Windows.Security.Cryptography.Certificates.InstallOptions")
@js.native
object InstallOptions extends js.Object {
  @js.native
  sealed trait deleteExpired extends InstallOptions
  
  @js.native
  sealed trait none extends InstallOptions
  
  /* 1 */ val deleteExpired: typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.InstallOptions.deleteExpired with Double = js.native
  /* 0 */ val none: typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.InstallOptions.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InstallOptions with Double] = js.native
}

