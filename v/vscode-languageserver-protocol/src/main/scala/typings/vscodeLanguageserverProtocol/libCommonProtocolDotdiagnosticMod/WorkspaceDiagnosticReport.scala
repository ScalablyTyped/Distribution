package typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkspaceDiagnosticReport] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[WorkspaceDocumentDiagnosticReport]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: WorkspaceDocumentDiagnosticReport*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
