package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  def provideDeclaration(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[Declaration] = js.native
}

object DeclarationProvider {
  @scala.inline
  def apply(provideDeclaration: (TextDocument, Position, CancellationToken) => ProviderResult[Declaration]): DeclarationProvider = {
    val __obj = js.Dynamic.literal(provideDeclaration = js.Any.fromFunction3(provideDeclaration))
    __obj.asInstanceOf[DeclarationProvider]
  }
  @scala.inline
  implicit class DeclarationProviderOps[Self <: DeclarationProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProvideDeclaration(value: (TextDocument, Position, CancellationToken) => ProviderResult[Declaration]): Self = this.set("provideDeclaration", js.Any.fromFunction3(value))
  }
  
}

