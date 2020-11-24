package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureHelpProvider extends js.Object {
  
  /**
    * Provide help for the signature at the given position and document.
    *
    * @param document The document in which the command was invoked.
    * @param position The position at which the command was invoked.
    * @param token A cancellation token.
    * @param context Information about how signature help was triggered.
    *
    * @return Signature help or a thenable that resolves to such. The lack of a result can be
    * signaled by returning `undefined` or `null`.
    */
  def provideSignatureHelp(
    document: TextDocument,
    position: Position,
    token: CancellationToken,
    context: SignatureHelpContext
  ): ProviderResult[SignatureHelp] = js.native
}
object SignatureHelpProvider {
  
  @scala.inline
  def apply(
    provideSignatureHelp: (TextDocument, Position, CancellationToken, SignatureHelpContext) => ProviderResult[SignatureHelp]
  ): SignatureHelpProvider = {
    val __obj = js.Dynamic.literal(provideSignatureHelp = js.Any.fromFunction4(provideSignatureHelp))
    __obj.asInstanceOf[SignatureHelpProvider]
  }
  
  @scala.inline
  implicit class SignatureHelpProviderOps[Self <: SignatureHelpProvider] (val x: Self) extends AnyVal {
    
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
    def setProvideSignatureHelp(
      value: (TextDocument, Position, CancellationToken, SignatureHelpContext) => ProviderResult[SignatureHelp]
    ): Self = this.set("provideSignatureHelp", js.Any.fromFunction4(value))
  }
}
