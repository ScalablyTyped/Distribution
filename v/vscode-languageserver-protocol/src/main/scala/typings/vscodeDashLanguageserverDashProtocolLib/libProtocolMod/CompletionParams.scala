package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

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
  def apply(
    position: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position,
    textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier,
    context: CompletionContext = null
  ): CompletionParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("textDocument")(textDocument)
    if (context != null) __obj.updateDynamic("context")(context)
    __obj.asInstanceOf[CompletionParams]
  }
}

