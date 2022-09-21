package typings.vscodeLanguageserverProtocol.protocolDiagnosticMod

import typings.vscodeLanguageserverTypes.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.RelatedFullDocumentDiagnosticReport
  - typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.RelatedUnchangedDocumentDiagnosticReport
*/
trait DocumentDiagnosticReport extends StObject
object DocumentDiagnosticReport {
  
  inline def RelatedFullDocumentDiagnosticReport(items: js.Array[Diagnostic], kind: /* "full" */ String): typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.RelatedFullDocumentDiagnosticReport = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.RelatedFullDocumentDiagnosticReport]
  }
  
  inline def RelatedUnchangedDocumentDiagnosticReport(kind: /* "unchanged" */ String, resultId: String): typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.RelatedUnchangedDocumentDiagnosticReport = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], resultId = resultId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.RelatedUnchangedDocumentDiagnosticReport]
  }
}
