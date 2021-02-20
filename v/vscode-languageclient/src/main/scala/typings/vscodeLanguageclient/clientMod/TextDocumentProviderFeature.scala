package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDocumentProviderFeature[T] extends StObject {
  
  /**
    * Triggers the corresponding RPC method.
    */
  def getProvider(textDocument: typings.vscode.mod.TextDocument): T = js.native
}
object TextDocumentProviderFeature {
  
  @scala.inline
  def apply[T](getProvider: typings.vscode.mod.TextDocument => T): TextDocumentProviderFeature[T] = {
    val __obj = js.Dynamic.literal(getProvider = js.Any.fromFunction1(getProvider))
    __obj.asInstanceOf[TextDocumentProviderFeature[T]]
  }
  
  @scala.inline
  implicit class TextDocumentProviderFeatureMutableBuilder[Self <: TextDocumentProviderFeature[_], T] (val x: Self with TextDocumentProviderFeature[T]) extends AnyVal {
    
    @scala.inline
    def setGetProvider(value: typings.vscode.mod.TextDocument => T): Self = StObject.set(x, "getProvider", js.Any.fromFunction1(value))
  }
}
