package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExportOption extends js.Object

/** Specifies whether a private key can be exported. This enumeration type is used in the Exportable property of a CertificateRequestProperties object. */
@JSGlobal("Windows.Security.Cryptography.Certificates.ExportOption")
@js.native
object ExportOption extends js.Object {
  /** The private key is exportable. */
  @js.native
  sealed trait exportable
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ExportOption
  
  /** The private key is not exportable. */
  @js.native
  sealed trait notExportable
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ExportOption
  
  val exportable: exportable with java.lang.String = js.native
  val notExportable: notExportable with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ExportOption with java.lang.String
  ] = js.native
}

