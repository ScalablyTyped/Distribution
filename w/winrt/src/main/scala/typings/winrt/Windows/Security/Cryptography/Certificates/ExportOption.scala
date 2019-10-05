package typings.winrt.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExportOption extends js.Object

@JSGlobal("Windows.Security.Cryptography.Certificates.ExportOption")
@js.native
object ExportOption extends js.Object {
  @js.native
  sealed trait exportable extends ExportOption
  
  @js.native
  sealed trait notExportable extends ExportOption
  
  /* 1 */ val exportable: typings.winrt.Windows.Security.Cryptography.Certificates.ExportOption.exportable with Double = js.native
  /* 0 */ val notExportable: typings.winrt.Windows.Security.Cryptography.Certificates.ExportOption.notExportable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExportOption with Double] = js.native
}

