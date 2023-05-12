package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldingRangeProvider extends StObject {
  
  /**
  		 * An optional event to signal that the folding ranges from this provider have changed.
  		 */
  var onDidChangeFoldingRanges: js.UndefOr[Event[Unit]] = js.undefined
  
  /**
  		 * Returns a list of folding ranges or null and undefined if the provider
  		 * does not want to participate or was cancelled.
  		 * @param document The document in which the command was invoked.
  		 * @param context Additional context information (for future use)
  		 * @param token A cancellation token.
  		 */
  def provideFoldingRanges(document: TextDocument, context: FoldingContext, token: CancellationToken): ProviderResult[js.Array[FoldingRange]]
}
object FoldingRangeProvider {
  
  inline def apply(
    provideFoldingRanges: (TextDocument, FoldingContext, CancellationToken) => ProviderResult[js.Array[FoldingRange]]
  ): FoldingRangeProvider = {
    val __obj = js.Dynamic.literal(provideFoldingRanges = js.Any.fromFunction3(provideFoldingRanges))
    __obj.asInstanceOf[FoldingRangeProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FoldingRangeProvider] (val x: Self) extends AnyVal {
    
    inline def setOnDidChangeFoldingRanges(
      value: (/* listener */ js.Function1[Unit, Any], /* thisArgs */ js.UndefOr[Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
    ): Self = StObject.set(x, "onDidChangeFoldingRanges", js.Any.fromFunction3(value))
    
    inline def setOnDidChangeFoldingRangesUndefined: Self = StObject.set(x, "onDidChangeFoldingRanges", js.undefined)
    
    inline def setProvideFoldingRanges(value: (TextDocument, FoldingContext, CancellationToken) => ProviderResult[js.Array[FoldingRange]]): Self = StObject.set(x, "provideFoldingRanges", js.Any.fromFunction3(value))
  }
}
