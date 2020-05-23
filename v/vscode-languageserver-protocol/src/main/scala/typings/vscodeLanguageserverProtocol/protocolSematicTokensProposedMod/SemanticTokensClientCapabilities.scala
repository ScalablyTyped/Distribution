package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SemanticTokensClientCapabilities extends js.Object {
  /**
    * The text document client capabilities
    */
  var textDocument: js.UndefOr[typings.vscodeLanguageserverProtocol.anon.SemanticTokens] = js.undefined
}

object SemanticTokensClientCapabilities {
  @scala.inline
  def apply(textDocument: typings.vscodeLanguageserverProtocol.anon.SemanticTokens = null): SemanticTokensClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (textDocument != null) __obj.updateDynamic("textDocument")(textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensClientCapabilities]
  }
}

