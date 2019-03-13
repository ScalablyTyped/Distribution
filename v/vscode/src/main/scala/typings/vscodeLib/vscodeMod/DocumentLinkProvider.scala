package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentLinkProvider extends js.Object {
  /**
  		 * Given a link fill in its [target](#DocumentLink.target). This method is called when an incomplete
  		 * link is selected in the UI. Providers can implement this method and return incomplete links
  		 * (without target) from the [`provideDocumentLinks`](#DocumentLinkProvider.provideDocumentLinks) method which
  		 * often helps to improve performance.
  		 *
  		 * @param link The link that is to be resolved.
  		 * @param token A cancellation token.
  		 */
  var resolveDocumentLink: js.UndefOr[
    js.Function2[/* link */ DocumentLink, /* token */ CancellationToken, ProviderResult[DocumentLink]]
  ] = js.undefined
  /**
  		 * Provide links for the given document. Note that the editor ships with a default provider that detects
  		 * `http(s)` and `file` links.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param token A cancellation token.
  		 * @return An array of [document links](#DocumentLink) or a thenable that resolves to such. The lack of a result
  		 * can be signaled by returning `undefined`, `null`, or an empty array.
  		 */
  def provideDocumentLinks(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[DocumentLink]]
}

object DocumentLinkProvider {
  @scala.inline
  def apply(
    provideDocumentLinks: (TextDocument, CancellationToken) => ProviderResult[js.Array[DocumentLink]],
    resolveDocumentLink: (/* link */ DocumentLink, /* token */ CancellationToken) => ProviderResult[DocumentLink] = null
  ): DocumentLinkProvider = {
    val __obj = js.Dynamic.literal(provideDocumentLinks = js.Any.fromFunction2(provideDocumentLinks))
    if (resolveDocumentLink != null) __obj.updateDynamic("resolveDocumentLink")(js.Any.fromFunction2(resolveDocumentLink))
    __obj.asInstanceOf[DocumentLinkProvider]
  }
}

