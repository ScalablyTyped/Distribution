package typings.vscodeDashLanguageserverDashProtocol.libProtocolDotFoldingRangeMod

import typings.vscodeDashLanguageserverDashProtocol.Anon_FoldingRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldingRangeClientCapabilities extends js.Object {
  /**
    * The text document client capabilities
    */
  var textDocument: js.UndefOr[Anon_FoldingRange] = js.undefined
}

object FoldingRangeClientCapabilities {
  @scala.inline
  def apply(textDocument: Anon_FoldingRange = null): FoldingRangeClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (textDocument != null) __obj.updateDynamic("textDocument")(textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingRangeClientCapabilities]
  }
}

