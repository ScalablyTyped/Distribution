package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceSymbolProvider[T /* <: SymbolInformation */] extends js.Object {
  /**
    * Given a symbol fill in its [location](#SymbolInformation.location). This method is called whenever a symbol
    * is selected in the UI. Providers can implement this method and return incomplete symbols from
    * [`provideWorkspaceSymbols`](#WorkspaceSymbolProvider.provideWorkspaceSymbols) which often helps to improve
    * performance.
    *
    * @param symbol The symbol that is to be resolved. Guaranteed to be an instance of an object returned from an
    * earlier call to `provideWorkspaceSymbols`.
    * @param token A cancellation token.
    * @return The resolved symbol or a thenable that resolves to that. When no result is returned,
    * the given `symbol` is used.
    */
  var resolveWorkspaceSymbol: js.UndefOr[js.Function2[/* symbol */ T, /* token */ CancellationToken, ProviderResult[T]]] = js.native
  /**
    * Project-wide search for a symbol matching the given query string.
    *
    * The `query`-parameter should be interpreted in a *relaxed way* as the editor will apply its own highlighting
    * and scoring on the results. A good rule of thumb is to match case-insensitive and to simply check that the
    * characters of *query* appear in their order in a candidate symbol. Don't use prefix, substring, or similar
    * strict matching.
    *
    * To improve performance implementors can implement `resolveWorkspaceSymbol` and then provide symbols with partial
    * [location](#SymbolInformation.location)-objects, without a `range` defined. The editor will then call
    * `resolveWorkspaceSymbol` for selected symbols only, e.g. when opening a workspace symbol.
    *
    * @param query A query string, can be the empty string in which case all symbols should be returned.
    * @param token A cancellation token.
    * @return An array of document highlights or a thenable that resolves to such. The lack of a result can be
    * signaled by returning `undefined`, `null`, or an empty array.
    */
  def provideWorkspaceSymbols(query: String, token: CancellationToken): ProviderResult[js.Array[T]] = js.native
}

object WorkspaceSymbolProvider {
  @scala.inline
  def apply[/* <: typings.vscode.mod.SymbolInformation */ T](provideWorkspaceSymbols: (String, CancellationToken) => ProviderResult[js.Array[T]]): WorkspaceSymbolProvider[T] = {
    val __obj = js.Dynamic.literal(provideWorkspaceSymbols = js.Any.fromFunction2(provideWorkspaceSymbols))
    __obj.asInstanceOf[WorkspaceSymbolProvider[T]]
  }
  @scala.inline
  implicit class WorkspaceSymbolProviderOps[Self <: WorkspaceSymbolProvider[_], /* <: typings.vscode.mod.SymbolInformation */ T] (val x: Self with WorkspaceSymbolProvider[T]) extends AnyVal {
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
    def setProvideWorkspaceSymbols(value: (String, CancellationToken) => ProviderResult[js.Array[T]]): Self = this.set("provideWorkspaceSymbols", js.Any.fromFunction2(value))
    @scala.inline
    def setResolveWorkspaceSymbol(value: (/* symbol */ T, /* token */ CancellationToken) => ProviderResult[T]): Self = this.set("resolveWorkspaceSymbol", js.Any.fromFunction2(value))
    @scala.inline
    def deleteResolveWorkspaceSymbol: Self = this.set("resolveWorkspaceSymbol", js.undefined)
  }
  
}

