package typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod

import typings.vscodeLanguageserverProtocol.AnonFoldingRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldingRangeClientCapabilities extends js.Object {
  /**
    * The text document client capabilities
    */
  var textDocument: js.UndefOr[AnonFoldingRange] = js.undefined
}

object FoldingRangeClientCapabilities {
  @scala.inline
  def apply(textDocument: AnonFoldingRange = null): FoldingRangeClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (textDocument != null) __obj.updateDynamic("textDocument")(textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingRangeClientCapabilities]
  }
}

