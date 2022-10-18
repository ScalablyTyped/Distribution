package typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod

import typings.vscodeLanguageserverTypes.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.RelatedFullDocumentDiagnosticReport
  - typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.RelatedUnchangedDocumentDiagnosticReport
*/
trait DocumentDiagnosticReport extends StObject
object DocumentDiagnosticReport {
  
  inline def RelatedFullDocumentDiagnosticReport(items: js.Array[Diagnostic], kind: /* "full" */ String): typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.RelatedFullDocumentDiagnosticReport = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.RelatedFullDocumentDiagnosticReport]
  }
  
  inline def RelatedUnchangedDocumentDiagnosticReport(kind: /* "unchanged" */ String, resultId: String): typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.RelatedUnchangedDocumentDiagnosticReport = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], resultId = resultId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.RelatedUnchangedDocumentDiagnosticReport]
  }
}
