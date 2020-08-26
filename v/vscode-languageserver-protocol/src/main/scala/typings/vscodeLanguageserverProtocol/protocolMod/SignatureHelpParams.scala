package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureHelpParams
  extends TextDocumentPositionParams
     with WorkDoneProgressParams {
  /**
    * The signature help context. This is only available if the client specifies
    * to send this using the client capability `textDocument.signatureHelp.contextSupport === true`
    *
    * @since 3.15.0
    */
  var context: js.UndefOr[SignatureHelpContext] = js.native
}

object SignatureHelpParams {
  @scala.inline
  def apply(position: Position, textDocument: TextDocumentIdentifier): SignatureHelpParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpParams]
  }
  @scala.inline
  implicit class SignatureHelpParamsOps[Self <: SignatureHelpParams] (val x: Self) extends AnyVal {
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
    def setContext(value: SignatureHelpContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
  }
  
}

