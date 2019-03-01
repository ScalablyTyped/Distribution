package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotSelectionRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionRangeClientCapabilities extends js.Object {
  /**
    * The text document client capabilities
    */
  var textDocument: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_SelectionRange] = js.undefined
}

object SelectionRangeClientCapabilities {
  @scala.inline
  def apply(textDocument: vscodeDashLanguageserverDashProtocolLib.Anon_SelectionRange = null): SelectionRangeClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (textDocument != null) __obj.updateDynamic("textDocument")(textDocument)
    __obj.asInstanceOf[SelectionRangeClientCapabilities]
  }
}

