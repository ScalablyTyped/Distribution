package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Position
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionParams extends TextDocumentPositionParams {
  /**
    * The completion context. This is only available it the client specifies
    * to send this using `ClientCapabilities.textDocument.completion.contextSupport === true`
    */
  var context: js.UndefOr[CompletionContext] = js.undefined
}

object CompletionParams {
  @scala.inline
  def apply(position: Position, textDocument: TextDocumentIdentifier, context: CompletionContext = null): CompletionParams = {
    val __obj = js.Dynamic.literal(position = position, textDocument = textDocument)
    if (context != null) __obj.updateDynamic("context")(context)
    __obj.asInstanceOf[CompletionParams]
  }
}

