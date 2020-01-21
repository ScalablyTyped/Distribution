package typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod

import typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldingRangeServerCapabilities extends js.Object {
  /**
    * The server provides folding provider support.
    */
  var foldingRangeProvider: js.UndefOr[
    Boolean | FoldingRangeProviderOptions | (FoldingRangeProviderOptions with TextDocumentRegistrationOptions with StaticRegistrationOptions)
  ] = js.undefined
}

object FoldingRangeServerCapabilities {
  @scala.inline
  def apply(
    foldingRangeProvider: Boolean | FoldingRangeProviderOptions | (FoldingRangeProviderOptions with TextDocumentRegistrationOptions with StaticRegistrationOptions) = null
  ): FoldingRangeServerCapabilities = {
    val __obj = js.Dynamic.literal()
    if (foldingRangeProvider != null) __obj.updateDynamic("foldingRangeProvider")(foldingRangeProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingRangeServerCapabilities]
  }
}

