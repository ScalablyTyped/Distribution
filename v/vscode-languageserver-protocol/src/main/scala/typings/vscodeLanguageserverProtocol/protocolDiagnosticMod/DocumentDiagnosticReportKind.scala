package typings.vscodeLanguageserverProtocol.protocolDiagnosticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.full
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.unchanged
*/
trait DocumentDiagnosticReportKind extends StObject
object DocumentDiagnosticReportKind {
  
  /**
    * A diagnostic report with a full
    * set of problems.
    */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.diagnostic", "DocumentDiagnosticReportKind.Full")
  @js.native
  val Full: /* "full" */ String = js.native
  
  /**
    * A report indicating that the last
    * returned report is still accurate.
    */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.diagnostic", "DocumentDiagnosticReportKind.Unchanged")
  @js.native
  val Unchanged: /* "unchanged" */ String = js.native
}
