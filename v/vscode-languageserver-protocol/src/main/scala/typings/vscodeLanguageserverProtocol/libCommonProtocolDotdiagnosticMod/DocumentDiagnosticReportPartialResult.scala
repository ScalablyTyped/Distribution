package typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentDiagnosticReportPartialResult extends StObject {
  
  var relatedDocuments: StringDictionary[FullDocumentDiagnosticReport | UnchangedDocumentDiagnosticReport]
}
object DocumentDiagnosticReportPartialResult {
  
  inline def apply(
    relatedDocuments: StringDictionary[FullDocumentDiagnosticReport | UnchangedDocumentDiagnosticReport]
  ): DocumentDiagnosticReportPartialResult = {
    val __obj = js.Dynamic.literal(relatedDocuments = relatedDocuments.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentDiagnosticReportPartialResult]
  }
  
  extension [Self <: DocumentDiagnosticReportPartialResult](x: Self) {
    
    inline def setRelatedDocuments(value: StringDictionary[FullDocumentDiagnosticReport | UnchangedDocumentDiagnosticReport]): Self = StObject.set(x, "relatedDocuments", value.asInstanceOf[js.Any])
  }
}
