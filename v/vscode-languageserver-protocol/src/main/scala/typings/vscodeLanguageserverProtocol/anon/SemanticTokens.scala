package typings.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SemanticTokens extends js.Object {
  /**
    * Capabilities specific to the `textDocument/semanticTokens`
    *
    * @since 3.16.0 - Proposed state
    */
  var semanticTokens: js.UndefOr[TokenModifiers] = js.native
}

object SemanticTokens {
  @scala.inline
  def apply(): SemanticTokens = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticTokens]
  }
  @scala.inline
  implicit class SemanticTokensOps[Self <: SemanticTokens] (val x: Self) extends AnyVal {
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
    def setSemanticTokens(value: TokenModifiers): Self = this.set("semanticTokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSemanticTokens: Self = this.set("semanticTokens", js.undefined)
  }
  
}

