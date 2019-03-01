package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotFoldingRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldingRangeClientCapabilities extends js.Object {
  /**
    * The text document client capabilities
    */
  var textDocument: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_FoldingRange] = js.undefined
}

object FoldingRangeClientCapabilities {
  @scala.inline
  def apply(textDocument: vscodeDashLanguageserverDashProtocolLib.Anon_FoldingRange = null): FoldingRangeClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (textDocument != null) __obj.updateDynamic("textDocument")(textDocument)
    __obj.asInstanceOf[FoldingRangeClientCapabilities]
  }
}

