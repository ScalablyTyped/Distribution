package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SemanticTokensEdits extends js.Object {
  /**
    * For a detailed description how these edits are structured pls see
    * https://github.com/microsoft/vscode-extension-samples/blob/5ae1f7787122812dcc84e37427ca90af5ee09f14/semantic-tokens-sample/vscode.proposed.d.ts#L131
    */
  var edits: js.Array[SemanticTokensEdit] = js.native
  val resultId: js.UndefOr[String] = js.native
}

object SemanticTokensEdits {
  @scala.inline
  def apply(edits: js.Array[SemanticTokensEdit]): SemanticTokensEdits = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensEdits]
  }
  @scala.inline
  implicit class SemanticTokensEditsOps[Self <: SemanticTokensEdits] (val x: Self) extends AnyVal {
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
    def setEditsVarargs(value: SemanticTokensEdit*): Self = this.set("edits", js.Array(value :_*))
    @scala.inline
    def setEdits(value: js.Array[SemanticTokensEdit]): Self = this.set("edits", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultId(value: String): Self = this.set("resultId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultId: Self = this.set("resultId", js.undefined)
  }
  
}

