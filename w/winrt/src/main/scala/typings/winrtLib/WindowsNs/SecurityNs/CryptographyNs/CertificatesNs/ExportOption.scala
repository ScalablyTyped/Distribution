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
  
  val exportable: exportable with java.lang.String = js.native
  val notExportable: notExportable with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ExportOption with java.lang.String
  ] = js.native
}

