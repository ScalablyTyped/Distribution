package typings.vscodeLanguageclient.featuresMod

import typings.vscode.mod.TextDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentProviderFeature[T] extends StObject {
  
  /**
    * Triggers the corresponding RPC method.
    */
  def getProvider(textDocument: TextDocument): js.UndefOr[T]
}
object TextDocumentProviderFeature {
  
  inline def apply[T](getProvider: TextDocument => js.UndefOr[T]): TextDocumentProviderFeature[T] = {
    val __obj = js.Dynamic.literal(getProvider = js.Any.fromFunction1(getProvider))
    __obj.asInstanceOf[TextDocumentProviderFeature[T]]
  }
  
  extension [Self <: TextDocumentProviderFeature[?], T](x: Self & TextDocumentProviderFeature[T]) {
    
    inline def setGetProvider(value: TextDocument => js.UndefOr[T]): Self = StObject.set(x, "getProvider", js.Any.fromFunction1(value))
  }
}
