package typings.vscodeLanguageserverProtocol.protocolDiagnosticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnchangedDocumentDiagnosticReport extends StObject {
  
  /**
    * A document diagnostic report indicating
    * no changes to the last result. A server can
    * only return `unchanged` if result ids are
    * provided.
    */
  var kind: /* "unchanged" */ String
  
  /**
    * A result id which will be sent on the next
    * diagnostic request for the same document.
    */
  var resultId: String
}
object UnchangedDocumentDiagnosticReport {
  
  inline def apply(kind: /* "unchanged" */ String, resultId: String): UnchangedDocumentDiagnosticReport = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], resultId = resultId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnchangedDocumentDiagnosticReport]
  }
  
  extension [Self <: UnchangedDocumentDiagnosticReport](x: Self) {
    
    inline def setKind(value: /* "unchanged" */ String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setResultId(value: String): Self = StObject.set(x, "resultId", value.asInstanceOf[js.Any])
  }
}
