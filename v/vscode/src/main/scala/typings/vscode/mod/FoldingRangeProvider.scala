package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FoldingRangeProvider extends StObject {
  
  /**
    * Returns a list of folding ranges or null and undefined if the provider
    * does not want to participate or was cancelled.
    * @param document The document in which the command was invoked.
    * @param context Additional context information (for future use)
    * @param token A cancellation token.
    */
  def provideFoldingRanges(document: TextDocument, context: FoldingContext, token: CancellationToken): ProviderResult[js.Array[FoldingRange]] = js.native
}
object FoldingRangeProvider {
  
  @scala.inline
  def apply(
    provideFoldingRanges: (TextDocument, FoldingContext, CancellationToken) => ProviderResult[js.Array[FoldingRange]]
  ): FoldingRangeProvider = {
    val __obj = js.Dynamic.literal(provideFoldingRanges = js.Any.fromFunction3(provideFoldingRanges))
    __obj.asInstanceOf[FoldingRangeProvider]
  }
  
  @scala.inline
  implicit class FoldingRangeProviderMutableBuilder[Self <: FoldingRangeProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideFoldingRanges(value: (TextDocument, FoldingContext, CancellationToken) => ProviderResult[js.Array[FoldingRange]]): Self = StObject.set(x, "provideFoldingRanges", js.Any.fromFunction3(value))
  }
}
