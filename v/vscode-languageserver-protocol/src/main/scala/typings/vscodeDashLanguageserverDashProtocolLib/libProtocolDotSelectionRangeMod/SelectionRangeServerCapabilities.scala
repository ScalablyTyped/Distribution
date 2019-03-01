package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotSelectionRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionRangeServerCapabilities extends js.Object {
  /**
    * The server provides selection range support.
    */
  var selectionRangeProvider: js.UndefOr[
    scala.Boolean | SelectionRangeProviderOptions | (SelectionRangeProviderOptions with vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentRegistrationOptions with vscodeDashLanguageserverDashProtocolLib.libProtocolMod.StaticRegistrationOptions)
  ] = js.undefined
}

object SelectionRangeServerCapabilities {
  @scala.inline
  def apply(
    selectionRangeProvider: scala.Boolean | SelectionRangeProviderOptions | (SelectionRangeProviderOptions with vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentRegistrationOptions with vscodeDashLanguageserverDashProtocolLib.libProtocolMod.StaticRegistrationOptions) = null
  ): SelectionRangeServerCapabilities = {
    val __obj = js.Dynamic.literal()
    if (selectionRangeProvider != null) __obj.updateDynamic("selectionRangeProvider")(selectionRangeProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionRangeServerCapabilities]
  }
}

