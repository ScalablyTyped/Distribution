package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentLinkProvider[T /* <: DocumentLink */] extends StObject {
  
  /**
  		 * Provide links for the given document. Note that the editor ships with a default provider that detects
  		 * `http(s)` and `file` links.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param token A cancellation token.
  		 * @return An array of {@link DocumentLink document links} or a thenable that resolves to such. The lack of a result
  		 * can be signaled by returning `undefined`, `null`, or an empty array.
  		 */
  def provideDocumentLinks(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[T]]
  
  /**
  		 * Given a link fill in its {@link DocumentLink.target target}. This method is called when an incomplete
  		 * link is selected in the UI. Providers can implement this method and return incomplete links
  		 * (without target) from the {@linkcode DocumentLinkProvider.provideDocumentLinks provideDocumentLinks} method which
  		 * often helps to improve performance.
  		 *
  		 * @param link The link that is to be resolved.
  		 * @param token A cancellation token.
  		 */
  var resolveDocumentLink: js.UndefOr[js.Function2[/* link */ T, /* token */ CancellationToken, ProviderResult[T]]] = js.undefined
}
object DocumentLinkProvider {
  
  inline def apply[T /* <: DocumentLink */](provideDocumentLinks: (TextDocument, CancellationToken) => ProviderResult[js.Array[T]]): DocumentLinkProvider[T] = {
    val __obj = js.Dynamic.literal(provideDocumentLinks = js.Any.fromFunction2(provideDocumentLinks))
    __obj.asInstanceOf[DocumentLinkProvider[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentLinkProvider[?], T /* <: DocumentLink */] (val x: Self & DocumentLinkProvider[T]) extends AnyVal {
    
    inline def setProvideDocumentLinks(value: (TextDocument, CancellationToken) => ProviderResult[js.Array[T]]): Self = StObject.set(x, "provideDocumentLinks", js.Any.fromFunction2(value))
    
    inline def setResolveDocumentLink(value: (/* link */ T, /* token */ CancellationToken) => ProviderResult[T]): Self = StObject.set(x, "resolveDocumentLink", js.Any.fromFunction2(value))
    
    inline def setResolveDocumentLinkUndefined: Self = StObject.set(x, "resolveDocumentLink", js.undefined)
  }
}
