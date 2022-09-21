package typings.vscodeLanguageserverProtocol.protocolDiagnosticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceDiagnosticReport extends StObject {
  
  var items: js.Array[WorkspaceDocumentDiagnosticReport]
}
object WorkspaceDiagnosticReport {
  
  inline def apply(items: js.Array[WorkspaceDocumentDiagnosticReport]): WorkspaceDiagnosticReport = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceDiagnosticReport]
  }
  
  extension [Self <: WorkspaceDiagnosticReport](x: Self) {
    
    inline def setItems(value: js.Array[WorkspaceDocumentDiagnosticReport]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: WorkspaceDocumentDiagnosticReport*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
