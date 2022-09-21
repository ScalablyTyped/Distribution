package typings.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentDiagnosticReportKind {
  
  /**
    * A diagnostic report with a full
    * set of problems.
    */
  @JSImport("vscode-languageserver-protocol", "DocumentDiagnosticReportKind.Full")
  @js.native
  val Full: /* "full" */ String = js.native
  
  /**
    * A report indicating that the last
    * returned report is still accurate.
    */
  @JSImport("vscode-languageserver-protocol", "DocumentDiagnosticReportKind.Unchanged")
  @js.native
  val Unchanged: /* "unchanged" */ String = js.native
}
