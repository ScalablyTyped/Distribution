package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlayHintsProvider[T /* <: InlayHint */] extends StObject {
  
  /**
  		 * An optional event to signal that inlay hints from this provider have changed.
  		 */
  var onDidChangeInlayHints: js.UndefOr[Event[Unit]] = js.undefined
  
  /**
  		 * Provide inlay hints for the given range and document.
  		 *
  		 * *Note* that inlay hints that are not {@link Range.contains contained} by the given range are ignored.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param range The range for which inlay hints should be computed.
  		 * @param token A cancellation token.
  		 * @return An array of inlay hints or a thenable that resolves to such.
  		 */
  def provideInlayHints(document: TextDocument, range: Range, token: CancellationToken): ProviderResult[js.Array[T]]
  
  /**
  		 * Given an inlay hint fill in {@link InlayHint.tooltip tooltip}, {@link InlayHint.textEdits text edits},
  		 * or complete label {@link InlayHintLabelPart parts}.
  		 *
  		 * *Note* that the editor will resolve an inlay hint at most once.
  		 *
  		 * @param hint An inlay hint.
  		 * @param token A cancellation token.
  		 * @return The resolved inlay hint or a thenable that resolves to such. It is OK to return the given `item`. When no result is returned, the given `item` will be used.
  		 */
  var resolveInlayHint: js.UndefOr[js.Function2[/* hint */ T, /* token */ CancellationToken, ProviderResult[T]]] = js.undefined
}
object InlayHintsProvider {
  
  inline def apply[T /* <: InlayHint */](provideInlayHints: (TextDocument, Range, CancellationToken) => ProviderResult[js.Array[T]]): InlayHintsProvider[T] = {
    val __obj = js.Dynamic.literal(provideInlayHints = js.Any.fromFunction3(provideInlayHints))
    __obj.asInstanceOf[InlayHintsProvider[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlayHintsProvider[?], T /* <: InlayHint */] (val x: Self & InlayHintsProvider[T]) extends AnyVal {
    
    inline def setOnDidChangeInlayHints(
      value: (/* listener */ js.Function1[Unit, Any], /* thisArgs */ js.UndefOr[Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
    ): Self = StObject.set(x, "onDidChangeInlayHints", js.Any.fromFunction3(value))
    
    inline def setOnDidChangeInlayHintsUndefined: Self = StObject.set(x, "onDidChangeInlayHints", js.undefined)
    
    inline def setProvideInlayHints(value: (TextDocument, Range, CancellationToken) => ProviderResult[js.Array[T]]): Self = StObject.set(x, "provideInlayHints", js.Any.fromFunction3(value))
    
    inline def setResolveInlayHint(value: (/* hint */ T, /* token */ CancellationToken) => ProviderResult[T]): Self = StObject.set(x, "resolveInlayHint", js.Any.fromFunction2(value))
    
    inline def setResolveInlayHintUndefined: Self = StObject.set(x, "resolveInlayHint", js.undefined)
  }
}
