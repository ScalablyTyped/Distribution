package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentProviderFeature[T] extends StObject {
  
  /**
    * Triggers the corresponding RPC method.
    */
  def getProvider(textDocument: typings.vscode.mod.TextDocument): T
}
object TextDocumentProviderFeature {
  
  inline def apply[T](getProvider: typings.vscode.mod.TextDocument => T): TextDocumentProviderFeature[T] = {
    val __obj = js.Dynamic.literal(getProvider = js.Any.fromFunction1(getProvider))
    __obj.asInstanceOf[TextDocumentProviderFeature[T]]
  }
  
  extension [Self <: TextDocumentProviderFeature[?], T](x: Self & TextDocumentProviderFeature[T]) {
    
    inline def setGetProvider(value: typings.vscode.mod.TextDocument => T): Self = StObject.set(x, "getProvider", js.Any.fromFunction1(value))
  }
}
