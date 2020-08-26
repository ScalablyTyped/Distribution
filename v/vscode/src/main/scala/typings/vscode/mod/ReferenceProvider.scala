package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceProvider extends js.Object {
  /**
    * Provide a set of project-wide references for the given position and document.
    *
    * @param document The document in which the command was invoked.
    * @param position The position at which the command was invoked.
    * @param token A cancellation token.
    *
    * @return An array of locations or a thenable that resolves to such. The lack of a result can be
    * signaled by returning `undefined`, `null`, or an empty array.
    */
  def provideReferences(document: TextDocument, position: Position, context: ReferenceContext, token: CancellationToken): ProviderResult[js.Array[Location]] = js.native
}

object ReferenceProvider {
  @scala.inline
  def apply(
    provideReferences: (TextDocument, Position, ReferenceContext, CancellationToken) => ProviderResult[js.Array[Location]]
  ): ReferenceProvider = {
    val __obj = js.Dynamic.literal(provideReferences = js.Any.fromFunction4(provideReferences))
    __obj.asInstanceOf[ReferenceProvider]
  }
  @scala.inline
  implicit class ReferenceProviderOps[Self <: ReferenceProvider] (val x: Self) extends AnyVal {
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
    def setProvideReferences(
      value: (TextDocument, Position, ReferenceContext, CancellationToken) => ProviderResult[js.Array[Location]]
    ): Self = this.set("provideReferences", js.Any.fromFunction4(value))
  }
  
}

