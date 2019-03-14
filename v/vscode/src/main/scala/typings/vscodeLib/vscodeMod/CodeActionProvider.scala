package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeActionProvider extends js.Object {
  /**
  		 * Provide commands for the given document and range.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param range The range for which the command was invoked.
  		 * @param context Context carrying additional information.
  		 * @param token A cancellation token.
  		 * @return An array of commands or a thenable of such. The lack of a result can be
  		 * signaled by returning `undefined`, `null`, or an empty array.
  		 */
  def provideCodeActions(document: TextDocument, range: Range, context: CodeActionContext, token: CancellationToken): ProviderResult[js.Array[Command]]
}

object CodeActionProvider {
  @scala.inline
  def apply(
    provideCodeActions: (TextDocument, Range, CodeActionContext, CancellationToken) => ProviderResult[js.Array[Command]]
  ): CodeActionProvider = {
    val __obj = js.Dynamic.literal(provideCodeActions = js.Any.fromFunction4(provideCodeActions))
  
    __obj.asInstanceOf[CodeActionProvider]
  }
}

