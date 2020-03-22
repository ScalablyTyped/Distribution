package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SemanticTokensEdit extends js.Object {
  var data: js.UndefOr[js.Array[Double]] = js.undefined
  var deleteCount: Double
  var start: Double
}

object SemanticTokensEdit {
  @scala.inline
  def apply(deleteCount: Double, start: Double, data: js.Array[Double] = null): SemanticTokensEdit = {
    val __obj = js.Dynamic.literal(deleteCount = deleteCount.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensEdit]
  }
}

