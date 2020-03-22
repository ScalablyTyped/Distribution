package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SemanticTokensServerCapabilities extends js.Object {
  var semanticTokensProvider: SemanticTokensOptions | SemanticTokensRegistrationOptions
}

object SemanticTokensServerCapabilities {
  @scala.inline
  def apply(semanticTokensProvider: SemanticTokensOptions | SemanticTokensRegistrationOptions): SemanticTokensServerCapabilities = {
    val __obj = js.Dynamic.literal(semanticTokensProvider = semanticTokensProvider.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SemanticTokensServerCapabilities]
  }
}

