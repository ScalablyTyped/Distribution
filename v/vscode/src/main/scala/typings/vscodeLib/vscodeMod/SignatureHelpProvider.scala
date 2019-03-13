package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureHelpProvider extends js.Object {
  /**
  		 * Provide help for the signature at the given position and document.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param position The position at which the command was invoked.
  		 * @param token A cancellation token.
  		 * @return Signature help or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined` or `null`.
  		 */
  def provideSignatureHelp(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[SignatureHelp]
}

object SignatureHelpProvider {
  @scala.inline
  def apply(provideSignatureHelp: (TextDocument, Position, CancellationToken) => ProviderResult[SignatureHelp]): SignatureHelpProvider = {
    val __obj = js.Dynamic.literal(provideSignatureHelp = js.Any.fromFunction3(provideSignatureHelp))
  
    __obj.asInstanceOf[SignatureHelpProvider]
  }
}

