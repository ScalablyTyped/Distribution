package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SemanticTokensEditsPartialResult extends js.Object {
  var edits: js.Array[SemanticTokensEdit]
}

object SemanticTokensEditsPartialResult {
  @scala.inline
  def apply(edits: js.Array[SemanticTokensEdit]): SemanticTokensEditsPartialResult = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensEditsPartialResult]
  }
}

