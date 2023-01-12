package typings.vscodeLanguageclient.libCommonFeaturesMod

import typings.vscode.mod.TextDocument
import typings.vscodeLanguageclient.anon.Send
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentSendFeature[T /* <: js.Function */] extends StObject {
  
  /**
    * Returns a provider for the given text document.
    */
  def getProvider(document: TextDocument): js.UndefOr[Send[T]]
}
object TextDocumentSendFeature {
  
  inline def apply[T /* <: js.Function */](getProvider: TextDocument => js.UndefOr[Send[T]]): TextDocumentSendFeature[T] = {
    val __obj = js.Dynamic.literal(getProvider = js.Any.fromFunction1(getProvider))
    __obj.asInstanceOf[TextDocumentSendFeature[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextDocumentSendFeature[?], T /* <: js.Function */] (val x: Self & TextDocumentSendFeature[T]) extends AnyVal {
    
    inline def setGetProvider(value: TextDocument => js.UndefOr[Send[T]]): Self = StObject.set(x, "getProvider", js.Any.fromFunction1(value))
  }
}
