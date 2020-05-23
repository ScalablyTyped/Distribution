package typings.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SemanticTokens extends js.Object {
  /**
    * Capabilities specific to the `textDocument/semanticTokens`
    *
    * @since 3.16.0 - Proposed state
    */
  var semanticTokens: js.UndefOr[TokenModifiers] = js.undefined
}

object SemanticTokens {
  @scala.inline
  def apply(semanticTokens: TokenModifiers = null): SemanticTokens = {
    val __obj = js.Dynamic.literal()
    if (semanticTokens != null) __obj.updateDynamic("semanticTokens")(semanticTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokens]
  }
}

