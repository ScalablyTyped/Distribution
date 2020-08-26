package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SemanticTokensClientCapabilities extends js.Object {
  /**
    * The text document client capabilities
    */
  var textDocument: js.UndefOr[typings.vscodeLanguageserverProtocol.anon.SemanticTokens] = js.native
}

object SemanticTokensClientCapabilities {
  @scala.inline
  def apply(): SemanticTokensClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticTokensClientCapabilities]
  }
  @scala.inline
  implicit class SemanticTokensClientCapabilitiesOps[Self <: SemanticTokensClientCapabilities] (val x: Self) extends AnyVal {
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
    def setTextDocument(value: typings.vscodeLanguageserverProtocol.anon.SemanticTokens): Self = this.set("textDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDocument: Self = this.set("textDocument", js.undefined)
  }
  
}

