package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SemanticTokensEdits extends js.Object {
  /**
    * For a detailed description how these edits are structured pls see
    * https://github.com/microsoft/vscode-extension-samples/blob/5ae1f7787122812dcc84e37427ca90af5ee09f14/semantic-tokens-sample/vscode.proposed.d.ts#L131
    */
  var edits: js.Array[SemanticTokensEdit]
  val resultId: js.UndefOr[String] = js.undefined
}

object SemanticTokensEdits {
  @scala.inline
  def apply(edits: js.Array[SemanticTokensEdit], resultId: String = null): SemanticTokensEdits = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
    if (resultId != null) __obj.updateDynamic("resultId")(resultId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensEdits]
  }
}

