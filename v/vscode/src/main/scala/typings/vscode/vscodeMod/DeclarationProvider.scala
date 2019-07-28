package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationProvider extends js.Object {
  /**
  		 * Provide the declaration of the symbol at the given position and document.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param position The position at which the command was invoked.
  		 * @param token A cancellation token.
  		 * @return A declaration or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined` or `null`.
  		 */
  def provideDeclaration(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[Declaration]
}

object DeclarationProvider {
  @scala.inline
  def apply(provideDeclaration: (TextDocument, Position, CancellationToken) => ProviderResult[Declaration]): DeclarationProvider = {
    val __obj = js.Dynamic.literal(provideDeclaration = js.Any.fromFunction3(provideDeclaration))
  
    __obj.asInstanceOf[DeclarationProvider]
  }
}

