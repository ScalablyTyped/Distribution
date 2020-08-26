package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeLensProvider[T /* <: CodeLens */] extends js.Object {
  /**
    * An optional event to signal that the code lenses from this provider have changed.
    */
  var onDidChangeCodeLenses: js.UndefOr[Event[Unit]] = js.native
  /**
    * This function will be called for each visible code lens, usually when scrolling and after
    * calls to [compute](#CodeLensProvider.provideCodeLenses)-lenses.
    *
    * @param codeLens Code lens that must be resolved.
    * @param token A cancellation token.
    * @return The given, resolved code lens or thenable that resolves to such.
    */
  var resolveCodeLens: js.UndefOr[js.Function2[/* codeLens */ T, /* token */ CancellationToken, ProviderResult[T]]] = js.native
  /**
    * Compute a list of [lenses](#CodeLens). This call should return as fast as possible and if
    * computing the commands is expensive implementors should only return code lens objects with the
    * range set and implement [resolve](#CodeLensProvider.resolveCodeLens).
    *
    * @param document The document in which the command was invoked.
    * @param token A cancellation token.
    * @return An array of code lenses or a thenable that resolves to such. The lack of a result can be
    * signaled by returning `undefined`, `null`, or an empty array.
    */
  def provideCodeLenses(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[T]] = js.native
}

object CodeLensProvider {
  @scala.inline
  def apply[/* <: typings.vscode.mod.CodeLens */ T](provideCodeLenses: (TextDocument, CancellationToken) => ProviderResult[js.Array[T]]): CodeLensProvider[T] = {
    val __obj = js.Dynamic.literal(provideCodeLenses = js.Any.fromFunction2(provideCodeLenses))
    __obj.asInstanceOf[CodeLensProvider[T]]
  }
  @scala.inline
  implicit class CodeLensProviderOps[Self <: CodeLensProvider[_], /* <: typings.vscode.mod.CodeLens */ T] (val x: Self with CodeLensProvider[T]) extends AnyVal {
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
    def setProvideCodeLenses(value: (TextDocument, CancellationToken) => ProviderResult[js.Array[T]]): Self = this.set("provideCodeLenses", js.Any.fromFunction2(value))
    @scala.inline
    def setOnDidChangeCodeLenses(
      value: (/* listener */ js.Function1[Unit, js.Any], /* thisArgs */ js.UndefOr[js.Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
    ): Self = this.set("onDidChangeCodeLenses", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnDidChangeCodeLenses: Self = this.set("onDidChangeCodeLenses", js.undefined)
    @scala.inline
    def setResolveCodeLens(value: (/* codeLens */ T, /* token */ CancellationToken) => ProviderResult[T]): Self = this.set("resolveCodeLens", js.Any.fromFunction2(value))
    @scala.inline
    def deleteResolveCodeLens: Self = this.set("resolveCodeLens", js.undefined)
  }
  
}

