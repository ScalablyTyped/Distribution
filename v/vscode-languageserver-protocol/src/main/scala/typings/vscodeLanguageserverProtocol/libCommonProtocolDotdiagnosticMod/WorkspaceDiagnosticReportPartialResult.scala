package typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkspaceDiagnosticReportPartialResult] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[WorkspaceDocumentDiagnosticReport]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: WorkspaceDocumentDiagnosticReport*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
