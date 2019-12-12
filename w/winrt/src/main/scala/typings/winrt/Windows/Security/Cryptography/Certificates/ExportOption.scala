package typings.winrt.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Security.Cryptography.Certificates.ExportOption.exportable
import typings.winrt.Windows.Security.Cryptography.Certificates.ExportOption.notExportable
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExportOption with Double] = js.native
  /* 1 */ @js.native
  object exportable extends TopLevel[exportable with Double]
  
  /* 0 */ @js.native
  object notExportable extends TopLevel[notExportable with Double]
  
}

