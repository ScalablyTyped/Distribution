package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeActionProvider[T /* <: CodeAction */] extends StObject {
  
  /**
  		 * Get code actions for a given range in a document.
  		 *
  		 * Only return code actions that are relevant to user for the requested range. Also keep in mind how the
  		 * returned code actions will appear in the UI. The lightbulb widget and `Refactor` commands for instance show
  		 * returned code actions as a list, so do not return a large number of code actions that will overwhelm the user.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param range The selector or range for which the command was invoked. This will always be a
  		 * {@link Selection selection} if the actions are being requested in the currently active editor.
  		 * @param context Provides additional information about what code actions are being requested. You can use this
  		 * to see what specific type of code actions are being requested by the editor in order to return more relevant
  		 * actions and avoid returning irrelevant code actions that the editor will discard.
  		 * @param token A cancellation token.
  		 *
  		 * @return An array of code actions, such as quick fixes or refactorings. The lack of a result can be signaled
  		 * by returning `undefined`, `null`, or an empty array.
  		 *
  		 * We also support returning `Command` for legacy reasons, however all new extensions should return
  		 * `CodeAction` object instead.
  		 */
  def provideCodeActions(document: TextDocument, range: Range, context: CodeActionContext, token: CancellationToken): ProviderResult[js.Array[Command | T]] = js.native
  def provideCodeActions(document: TextDocument, range: Selection, context: CodeActionContext, token: CancellationToken): ProviderResult[js.Array[Command | T]] = js.native
  
  /**
  		 * Given a code action fill in its {@linkcode CodeAction.edit edit}-property. Changes to
  		 * all other properties, like title, are ignored. A code action that has an edit
  		 * will not be resolved.
  		 *
  		 * *Note* that a code action provider that returns commands, not code actions, cannot successfully
  		 * implement this function. Returning commands is deprecated and instead code actions should be
  		 * returned.
  		 *
  		 * @param codeAction A code action.
  		 * @param token A cancellation token.
  		 * @return The resolved code action or a thenable that resolves to such. It is OK to return the given
  		 * `item`. When no result is returned, the given `item` will be used.
  		 */
  var resolveCodeAction: js.UndefOr[
    js.Function2[/* codeAction */ T, /* token */ CancellationToken, ProviderResult[T]]
  ] = js.native
}
