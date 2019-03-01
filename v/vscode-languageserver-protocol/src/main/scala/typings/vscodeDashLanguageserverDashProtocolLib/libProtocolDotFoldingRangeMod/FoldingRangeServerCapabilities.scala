package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotFoldingRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldingRangeServerCapabilities extends js.Object {
  /**
    * The server provides folding provider support.
    */
  var foldingRangeProvider: js.UndefOr[
    scala.Boolean | FoldingRangeProviderOptions | (FoldingRangeProviderOptions with vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentRegistrationOptions with vscodeDashLanguageserverDashProtocolLib.libProtocolMod.StaticRegistrationOptions)
  ] = js.undefined
}

object FoldingRangeServerCapabilities {
  @scala.inline
  def apply(
    foldingRangeProvider: scala.Boolean | FoldingRangeProviderOptions | (FoldingRangeProviderOptions with vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentRegistrationOptions with vscodeDashLanguageserverDashProtocolLib.libProtocolMod.StaticRegistrationOptions) = null
  ): FoldingRangeServerCapabilities = {
    val __obj = js.Dynamic.literal()
    if (foldingRangeProvider != null) __obj.updateDynamic("foldingRangeProvider")(foldingRangeProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingRangeServerCapabilities]
  }
}

