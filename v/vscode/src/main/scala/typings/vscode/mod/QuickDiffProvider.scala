package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuickDiffProvider extends js.Object {
  /**
    * Provide a [uri](#Uri) to the original resource of any given resource uri.
    *
    * @param uri The uri of the resource open in a text editor.
    * @param token A cancellation token.
    * @return A thenable that resolves to uri of the matching original resource.
    */
  var provideOriginalResource: js.UndefOr[js.Function2[/* uri */ Uri, /* token */ CancellationToken, ProviderResult[Uri]]] = js.undefined
}

object QuickDiffProvider {
  @scala.inline
  def apply(
    provideOriginalResource: (/* uri */ Uri, /* token */ CancellationToken) => ProviderResult[Uri] = null
  ): QuickDiffProvider = {
    val __obj = js.Dynamic.literal()
    if (provideOriginalResource != null) __obj.updateDynamic("provideOriginalResource")(js.Any.fromFunction2(provideOriginalResource))
    __obj.asInstanceOf[QuickDiffProvider]
  }
}

