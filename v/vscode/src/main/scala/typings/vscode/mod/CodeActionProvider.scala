package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeActionProvider[T /* <: CodeAction */] extends StObject {
  
  /**
    * Provide commands for the given document and range.
    *
    * @param document The document in which the command was invoked.
    * @param range The selector or range for which the command was invoked. This will always be a selection if
    * there is a currently active editor.
    * @param context Context carrying additional information.
    * @param token A cancellation token.
    * @return An array of commands, quick fixes, or refactorings or a thenable of such. The lack of a result can be
    * signaled by returning `undefined`, `null`, or an empty array.
    */
  def provideCodeActions(document: TextDocument, range: Range, context: CodeActionContext, token: CancellationToken): ProviderResult[js.Array[Command | CodeAction]] = js.native
  def provideCodeActions(document: TextDocument, range: Selection, context: CodeActionContext, token: CancellationToken): ProviderResult[js.Array[Command | CodeAction]] = js.native
  
  /**
    * Given a code action fill in its [`edit`](#CodeAction.edit)-property. Changes to
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
