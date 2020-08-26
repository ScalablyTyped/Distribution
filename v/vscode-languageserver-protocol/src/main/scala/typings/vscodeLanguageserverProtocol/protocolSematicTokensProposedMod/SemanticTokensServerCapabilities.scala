package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SemanticTokensServerCapabilities extends js.Object {
  var semanticTokensProvider: SemanticTokensOptions | SemanticTokensRegistrationOptions = js.native
}

object SemanticTokensServerCapabilities {
  @scala.inline
  def apply(semanticTokensProvider: SemanticTokensOptions | SemanticTokensRegistrationOptions): SemanticTokensServerCapabilities = {
    val __obj = js.Dynamic.literal(semanticTokensProvider = semanticTokensProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensServerCapabilities]
  }
  @scala.inline
  implicit class SemanticTokensServerCapabilitiesOps[Self <: SemanticTokensServerCapabilities] (val x: Self) extends AnyVal {
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
    def setSemanticTokensProvider(value: SemanticTokensOptions | SemanticTokensRegistrationOptions): Self = this.set("semanticTokensProvider", value.asInstanceOf[js.Any])
  }
  
}

