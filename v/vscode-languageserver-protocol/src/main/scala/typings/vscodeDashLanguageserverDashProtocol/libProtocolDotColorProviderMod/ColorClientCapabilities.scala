package typings.vscodeDashLanguageserverDashProtocol.libProtocolDotColorProviderMod

import typings.vscodeDashLanguageserverDashProtocol.Anon_ColorProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorClientCapabilities extends js.Object {
  /**
    * The text document client capabilities
    */
  var textDocument: js.UndefOr[Anon_ColorProvider] = js.undefined
}

object ColorClientCapabilities {
  @scala.inline
  def apply(textDocument: Anon_ColorProvider = null): ColorClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (textDocument != null) __obj.updateDynamic("textDocument")(textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorClientCapabilities]
  }
}

