package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameProvider extends js.Object {
  /**
  		 * Provide an edit that describes changes that have to be made to one
  		 * or many resources to rename a symbol to a different name.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param position The position at which the command was invoked.
  		 * @param newName The new name of the symbol. If the given name is not valid, the provider must return a rejected promise.
  		 * @param token A cancellation token.
  		 * @return A workspace edit or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined` or `null`.
  		 */
  def provideRenameEdits(document: TextDocument, position: Position, newName: java.lang.String, token: CancellationToken): ProviderResult[WorkspaceEdit]
}

object RenameProvider {
  @scala.inline
  def apply(
    provideRenameEdits: (TextDocument, Position, java.lang.String, CancellationToken) => ProviderResult[WorkspaceEdit]
  ): RenameProvider = {
    val __obj = js.Dynamic.literal(provideRenameEdits = js.Any.fromFunction4(provideRenameEdits))
  
    __obj.asInstanceOf[RenameProvider]
  }
}

