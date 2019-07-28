package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeActionProvider extends js.Object {
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
}

