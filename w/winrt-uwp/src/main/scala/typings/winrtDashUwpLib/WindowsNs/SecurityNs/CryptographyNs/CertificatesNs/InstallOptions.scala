package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InstallOptions extends js.Object

/** Specifies certificate installation options. This enumeration type is used by the InstallCertificateAsync and ImportPfxDataAsync methods. */
@JSGlobal("Windows.Security.Cryptography.Certificates.InstallOptions")
@js.native
object InstallOptions extends js.Object {
  /** Delete expired certificates. */
  @js.native
  sealed trait deleteExpired
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.InstallOptions
  
  /** No options are specified. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.InstallOptions
  
  val deleteExpired: deleteExpired with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.InstallOptions with java.lang.String
  ] = js.native
}

