package typings.vscodeLanguageserverProtocol.protocolDiagnosticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceDiagnosticReportPartialResult extends StObject {
  
  var items: js.Array[WorkspaceDocumentDiagnosticReport]
}
object WorkspaceDiagnosticReportPartialResult {
  
  inline def apply(items: js.Array[WorkspaceDocumentDiagnosticReport]): WorkspaceDiagnosticReportPartialResult = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceDiagnosticReportPartialResult]
  }
  
  extension [Self <: WorkspaceDiagnosticReportPartialResult](x: Self) {
    
    inline def setItems(value: js.Array[WorkspaceDocumentDiagnosticReport]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: WorkspaceDocumentDiagnosticReport*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
