package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressToken
import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureHelpParams
  extends TextDocumentPositionParams
     with WorkDoneProgressParams {
  /**
    * The signature help context. This is only available if the client specifies
    * to send this using the client capability `textDocument.signatureHelp.contextSupport === true`
    *
    * @since 3.15.0
    */
  var context: js.UndefOr[SignatureHelpContext] = js.undefined
}

object SignatureHelpParams {
  @scala.inline
  def apply(
    position: Position,
    textDocument: TextDocumentIdentifier,
    context: SignatureHelpContext = null,
    workDoneToken: ProgressToken = null
  ): SignatureHelpParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (workDoneToken != null) __obj.updateDynamic("workDoneToken")(workDoneToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpParams]
  }
}

