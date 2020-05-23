package typings.vscodeLanguageserver.sematicTokensProposedMod

import typings.vscodeLanguageserver.anon.On
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SemanticTokens extends js.Object {
  var semanticTokens: On
}

object SemanticTokens {
  @scala.inline
  def apply(semanticTokens: On): SemanticTokens = {
    val __obj = js.Dynamic.literal(semanticTokens = semanticTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokens]
  }
}

