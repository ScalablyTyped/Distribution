package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeLensProvider extends js.Object {
  /**
  		 * An optional event to signal that the code lenses from this provider have changed.
  		 */
  var onDidChangeCodeLenses: js.UndefOr[Event[Unit]] = js.undefined
  /**
  		 * This function will be called for each visible code lens, usually when scrolling and after
  		 * calls to [compute](#CodeLensProvider.provideCodeLenses)-lenses.
  		 *
  		 * @param codeLens code lens that must be resolved.
  		 * @param token A cancellation token.
  		 * @return The given, resolved code lens or thenable that resolves to such.
  		 */
  var resolveCodeLens: js.UndefOr[
    js.Function2[/* codeLens */ CodeLens, /* token */ CancellationToken, ProviderResult[CodeLens]]
  ] = js.undefined
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
  def provideCodeLenses(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[CodeLens]]
}

object CodeLensProvider {
  @scala.inline
  def apply(
    provideCodeLenses: (TextDocument, CancellationToken) => ProviderResult[js.Array[CodeLens]],
    onDidChangeCodeLenses: (/* listener */ js.Function1[Unit, js.Any], /* thisArgs */ js.UndefOr[js.Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable = null,
    resolveCodeLens: (/* codeLens */ CodeLens, /* token */ CancellationToken) => ProviderResult[CodeLens] = null
  ): CodeLensProvider = {
    val __obj = js.Dynamic.literal(provideCodeLenses = js.Any.fromFunction2(provideCodeLenses))
    if (onDidChangeCodeLenses != null) __obj.updateDynamic("onDidChangeCodeLenses")(js.Any.fromFunction3(onDidChangeCodeLenses))
    if (resolveCodeLens != null) __obj.updateDynamic("resolveCodeLens")(js.Any.fromFunction2(resolveCodeLens))
    __obj.asInstanceOf[CodeLensProvider]
  }
}

