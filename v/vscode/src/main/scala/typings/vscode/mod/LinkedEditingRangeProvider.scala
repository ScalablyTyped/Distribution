package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkedEditingRangeProvider extends StObject {
  
  /**
  		 * For a given position in a document, returns the range of the symbol at the position and all ranges
  		 * that have the same content. A change to one of the ranges can be applied to all other ranges if the new content
  		 * is valid. An optional word pattern can be returned with the result to describe valid contents.
  		 * If no result-specific word pattern is provided, the word pattern from the language configuration is used.
  		 *
  		 * @param document The document in which the provider was invoked.
  		 * @param position The position at which the provider was invoked.
  		 * @param token A cancellation token.
  		 * @return A list of ranges that can be edited together
  		 */
  def provideLinkedEditingRanges(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[LinkedEditingRanges]
}
object LinkedEditingRangeProvider {
  
  inline def apply(
    provideLinkedEditingRanges: (TextDocument, Position, CancellationToken) => ProviderResult[LinkedEditingRanges]
  ): LinkedEditingRangeProvider = {
    val __obj = js.Dynamic.literal(provideLinkedEditingRanges = js.Any.fromFunction3(provideLinkedEditingRanges))
    __obj.asInstanceOf[LinkedEditingRangeProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkedEditingRangeProvider] (val x: Self) extends AnyVal {
    
    inline def setProvideLinkedEditingRanges(value: (TextDocument, Position, CancellationToken) => ProviderResult[LinkedEditingRanges]): Self = StObject.set(x, "provideLinkedEditingRanges", js.Any.fromFunction3(value))
  }
}
