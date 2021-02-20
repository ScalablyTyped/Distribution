package typings.winrt.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExportOption extends StObject
@JSGlobal("Windows.Security.Cryptography.Certificates.ExportOption")
@js.native
object ExportOption extends StObject {
  
  @js.native
  sealed trait exportable extends ExportOption
  
  @js.native
  sealed trait notExportable extends ExportOption
}
