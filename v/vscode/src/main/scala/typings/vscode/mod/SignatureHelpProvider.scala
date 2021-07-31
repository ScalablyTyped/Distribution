package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureHelpProvider extends StObject {
  
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
  ): ProviderResult[SignatureHelp]
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
  implicit class SignatureHelpProviderMutableBuilder[Self <: SignatureHelpProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideSignatureHelp(
      value: (TextDocument, Position, CancellationToken, SignatureHelpContext) => ProviderResult[SignatureHelp]
    ): Self = StObject.set(x, "provideSignatureHelp", js.Any.fromFunction4(value))
  }
}
