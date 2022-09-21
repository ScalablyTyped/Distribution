package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineCompletionItemProvider extends StObject {
  
  /**
    * Provides inline completion items for the given position and document.
    * If inline completions are enabled, this method will be called whenever the user stopped typing.
    * It will also be called when the user explicitly triggers inline completions or explicitly asks for the next or previous inline completion.
    * In that case, all available inline completions should be returned.
    * `context.triggerKind` can be used to distinguish between these scenarios.
    *
    * @param document The document inline completions are requested for.
    * @param position The position inline completions are requested for.
    * @param context A context object with additional information.
    * @param token A cancellation token.
    * @return An array of completion items or a thenable that resolves to an array of completion items.
    */
  def provideInlineCompletionItems(
    document: TextDocument,
    position: Position,
    context: InlineCompletionContext,
    token: CancellationToken
  ): ProviderResult[js.Array[InlineCompletionItem] | InlineCompletionList]
}
object InlineCompletionItemProvider {
  
  inline def apply(
    provideInlineCompletionItems: (TextDocument, Position, InlineCompletionContext, CancellationToken) => ProviderResult[js.Array[InlineCompletionItem] | InlineCompletionList]
  ): InlineCompletionItemProvider = {
    val __obj = js.Dynamic.literal(provideInlineCompletionItems = js.Any.fromFunction4(provideInlineCompletionItems))
    __obj.asInstanceOf[InlineCompletionItemProvider]
  }
  
  extension [Self <: InlineCompletionItemProvider](x: Self) {
    
    inline def setProvideInlineCompletionItems(
      value: (TextDocument, Position, InlineCompletionContext, CancellationToken) => ProviderResult[js.Array[InlineCompletionItem] | InlineCompletionList]
    ): Self = StObject.set(x, "provideInlineCompletionItems", js.Any.fromFunction4(value))
  }
}
