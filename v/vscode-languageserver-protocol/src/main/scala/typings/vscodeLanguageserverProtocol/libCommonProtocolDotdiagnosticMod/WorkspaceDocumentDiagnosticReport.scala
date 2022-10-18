package typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod

import typings.vscodeLanguageserverTypes.mod.Diagnostic
import typings.vscodeLanguageserverTypes.mod.DocumentUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.WorkspaceFullDocumentDiagnosticReport
  - typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.WorkspaceUnchangedDocumentDiagnosticReport
*/
trait WorkspaceDocumentDiagnosticReport extends StObject
object WorkspaceDocumentDiagnosticReport {
  
  inline def WorkspaceFullDocumentDiagnosticReport(items: js.Array[Diagnostic], kind: /* "full" */ String, uri: DocumentUri): typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.WorkspaceFullDocumentDiagnosticReport = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], version = null)
    __obj.asInstanceOf[typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.WorkspaceFullDocumentDiagnosticReport]
  }
  
  inline def WorkspaceUnchangedDocumentDiagnosticReport(kind: /* "unchanged" */ String, resultId: String, uri: DocumentUri): typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.WorkspaceUnchangedDocumentDiagnosticReport = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], resultId = resultId.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], version = null)
    __obj.asInstanceOf[typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.WorkspaceUnchangedDocumentDiagnosticReport]
  }
}
