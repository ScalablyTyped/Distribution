package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotColorProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorClientCapabilities extends js.Object {
  /**
    * The text document client capabilities
    */
  var textDocument: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_ColorProvider] = js.undefined
}

object ColorClientCapabilities {
  @scala.inline
  def apply(textDocument: vscodeDashLanguageserverDashProtocolLib.Anon_ColorProvider = null): ColorClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (textDocument != null) __obj.updateDynamic("textDocument")(textDocument)
    __obj.asInstanceOf[ColorClientCapabilities]
  }
}

