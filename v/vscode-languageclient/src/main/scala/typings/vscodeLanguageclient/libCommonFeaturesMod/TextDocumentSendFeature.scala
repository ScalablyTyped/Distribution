package typings.vscodeLanguageclient.libCommonFeaturesMod

import typings.vscode.mod.TextDocument
import typings.vscodeLanguageclient.anon.SendT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentSendFeature[T /* <: js.Function */] extends StObject {
  
  /**
    * Returns a provider for the given text document.
    */
  def getProvider(document: TextDocument): js.UndefOr[SendT[T]]
}
object TextDocumentSendFeature {
  
  inline def apply[T /* <: js.Function */](getProvider: TextDocument => js.UndefOr[SendT[T]]): TextDocumentSendFeature[T] = {
    val __obj = js.Dynamic.literal(getProvider = js.Any.fromFunction1(getProvider))
    __obj.asInstanceOf[TextDocumentSendFeature[T]]
  }
  
  extension [Self <: TextDocumentSendFeature[?], T /* <: js.Function */](x: Self & TextDocumentSendFeature[T]) {
    
    inline def setGetProvider(value: TextDocument => js.UndefOr[SendT[T]]): Self = StObject.set(x, "getProvider", js.Any.fromFunction1(value))
  }
}
