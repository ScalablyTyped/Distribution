package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionItemProvider[T] extends js.Object {
  /**
    * Given a completion item fill in more data, like [doc-comment](#CompletionItem.documentation)
    * or [details](#CompletionItem.detail).
    *
    * The editor will only resolve a completion item once.
    *
    * *Note* that this function is called when completion items are already showing in the UI or when an item has been
    * selected for insertion. Because of that, no property that changes the presentation (label, sorting, filtering etc)
    * or the (primary) insert behaviour ([insertText](#CompletionItem.insertText)) can be changed.
    *
    * This function may fill in [additionalTextEdits](#CompletionItem.additionalTextEdits). However, that means an item might be
    * inserted *before* resolving is done and in that case the editor will do a best effort to still apply those additional
    * text edits.
    *
    * @param item A completion item currently active in the UI.
    * @param token A cancellation token.
    * @return The resolved completion item or a thenable that resolves to of such. It is OK to return the given
    * `item`. When no result is returned, the given `item` will be used.
    */
  var resolveCompletionItem: js.UndefOr[js.Function2[/* item */ T, /* token */ CancellationToken, ProviderResult[T]]] = js.undefined
  /**
    * Provide completion items for the given position and document.
    *
    * @param document The document in which the command was invoked.
    * @param position The position at which the command was invoked.
    * @param token A cancellation token.
    * @param context How the completion was triggered.
    *
    * @return An array of completions, a [completion list](#CompletionList), or a thenable that resolves to either.
    * The lack of a result can be signaled by returning `undefined`, `null`, or an empty array.
    */
  def provideCompletionItems(document: TextDocument, position: Position, token: CancellationToken, context: CompletionContext): ProviderResult[js.Array[T] | CompletionList[T]]
}

object CompletionItemProvider {
  @scala.inline
  def apply[T](
    provideCompletionItems: (TextDocument, Position, CancellationToken, CompletionContext) => ProviderResult[js.Array[T] | CompletionList[T]],
    resolveCompletionItem: (/* item */ T, /* token */ CancellationToken) => ProviderResult[T] = null
  ): CompletionItemProvider[T] = {
    val __obj = js.Dynamic.literal(provideCompletionItems = js.Any.fromFunction4(provideCompletionItems))
    if (resolveCompletionItem != null) __obj.updateDynamic("resolveCompletionItem")(js.Any.fromFunction2(resolveCompletionItem))
    __obj.asInstanceOf[CompletionItemProvider[T]]
  }
}

