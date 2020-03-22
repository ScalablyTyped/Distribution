package typings.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSemanticTokens extends js.Object {
  /**
    * Capabilities specific to the `textDocument/semanticTokens`
    *
    * @since 3.16.0 - Proposed state
    */
  var semanticTokens: js.UndefOr[AnonTokenModifiers] = js.undefined
}

object AnonSemanticTokens {
  @scala.inline
  def apply(semanticTokens: AnonTokenModifiers = null): AnonSemanticTokens = {
    val __obj = js.Dynamic.literal()
    if (semanticTokens != null) __obj.updateDynamic("semanticTokens")(semanticTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSemanticTokens]
  }
}

