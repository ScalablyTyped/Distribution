package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExportOption extends js.Object

@JSGlobal("Windows.Security.Cryptography.Certificates.ExportOption")
@js.native
object ExportOption extends js.Object {
  @js.native
  sealed trait exportable
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ExportOption
  
  @js.native
  sealed trait notExportable
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ExportOption
  
  /* 1 */ val exportable: exportable with scala.Double = js.native
  /* 0 */ val notExportable: notExportable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ExportOption with scala.Double
  ] = js.native
}

