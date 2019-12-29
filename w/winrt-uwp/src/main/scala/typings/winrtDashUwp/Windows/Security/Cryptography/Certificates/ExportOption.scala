package typings.winrtDashUwp.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExportOption with Double] = js.native
  /* 1 */ @js.native
  object exportable extends TopLevel[exportable with Double]
  
  /* 0 */ @js.native
  object notExportable extends TopLevel[notExportable with Double]
  
}

