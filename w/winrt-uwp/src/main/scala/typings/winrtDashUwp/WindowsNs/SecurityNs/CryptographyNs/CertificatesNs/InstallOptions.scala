package typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

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
  sealed trait deleteExpired extends InstallOptions
  
  /** No options are specified. */
  @js.native
  sealed trait none extends InstallOptions
  
  /* 1 */ val deleteExpired: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.InstallOptions.deleteExpired with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.InstallOptions.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InstallOptions with Double] = js.native
}

