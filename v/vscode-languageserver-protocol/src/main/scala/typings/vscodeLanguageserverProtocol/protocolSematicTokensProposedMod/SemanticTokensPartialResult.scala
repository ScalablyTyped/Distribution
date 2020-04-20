package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SemanticTokensPartialResult extends js.Object {
  var data: js.Array[Double]
}

object SemanticTokensPartialResult {
  @scala.inline
  def apply(data: js.Array[Double]): SemanticTokensPartialResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensPartialResult]
  }
}

