package typings.vscodeLanguageserverProtocol.protocolDiagnosticMod

import typings.vscodeLanguageserverTypes.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullDocumentDiagnosticReport extends StObject {
  
  /**
    * The actual items.
    */
  var items: js.Array[Diagnostic]
  
  /**
    * A full document diagnostic report.
    */
  var kind: /* "full" */ String
  
  /**
    * An optional result id. If provided it will
    * be sent on the next diagnostic request for the
    * same document.
    */
  var resultId: js.UndefOr[String] = js.undefined
}
object FullDocumentDiagnosticReport {
  
  inline def apply(items: js.Array[Diagnostic], kind: /* "full" */ String): FullDocumentDiagnosticReport = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullDocumentDiagnosticReport]
  }
  
  extension [Self <: FullDocumentDiagnosticReport](x: Self) {
    
    inline def setItems(value: js.Array[Diagnostic]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Diagnostic*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: /* "full" */ String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setResultId(value: String): Self = StObject.set(x, "resultId", value.asInstanceOf[js.Any])
    
    inline def setResultIdUndefined: Self = StObject.set(x, "resultId", js.undefined)
  }
}
