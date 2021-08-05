package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentContentChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentsConfiguration[T] extends StObject {
  
  def create(uri: String, languageId: String, version: Double, content: String): T
  
  def update(document: T, changes: js.Array[TextDocumentContentChangeEvent], version: Double): T
}
object TextDocumentsConfiguration {
  
  inline def apply[T](
    create: (String, String, Double, String) => T,
    update: (T, js.Array[TextDocumentContentChangeEvent], Double) => T
  ): TextDocumentsConfiguration[T] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction4(create), update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[TextDocumentsConfiguration[T]]
  }
  
  extension [Self <: TextDocumentsConfiguration[?], T](x: Self & TextDocumentsConfiguration[T]) {
    
    inline def setCreate(value: (String, String, Double, String) => T): Self = StObject.set(x, "create", js.Any.fromFunction4(value))
    
    inline def setUpdate(value: (T, js.Array[TextDocumentContentChangeEvent], Double) => T): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
  }
}
