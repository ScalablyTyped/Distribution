package typings.winrtDashUwp.Windows.Security.Cryptography.Certificates

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
  sealed trait exportable extends ExportOption
  
  /** The private key is not exportable. */
  @js.native
  sealed trait notExportable extends ExportOption
  
  /* 1 */ val exportable: typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.ExportOption.exportable with Double = js.native
  /* 0 */ val notExportable: typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.ExportOption.notExportable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExportOption with Double] = js.native
}

