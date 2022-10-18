package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentContentChangeEvent
import typings.vscodeLanguageserverTypes.mod.VersionedTextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Changes extends StObject {
  
  var changes: js.Array[TextDocumentContentChangeEvent]
  
  var document: VersionedTextDocumentIdentifier
}
object Changes {
  
  inline def apply(changes: js.Array[TextDocumentContentChangeEvent], document: VersionedTextDocumentIdentifier): Changes = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[Changes]
  }
  
  extension [Self <: Changes](x: Self) {
    
    inline def setChanges(value: js.Array[TextDocumentContentChangeEvent]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesVarargs(value: TextDocumentContentChangeEvent*): Self = StObject.set(x, "changes", js.Array(value*))
    
    inline def setDocument(value: VersionedTextDocumentIdentifier): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
  }
}
