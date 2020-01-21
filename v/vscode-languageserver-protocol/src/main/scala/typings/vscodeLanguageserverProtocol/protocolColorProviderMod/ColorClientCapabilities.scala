package typings.vscodeLanguageserverProtocol.protocolColorProviderMod

import typings.vscodeLanguageserverProtocol.AnonColorProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorClientCapabilities extends js.Object {
  /**
    * The text document client capabilities
    */
  var textDocument: js.UndefOr[AnonColorProvider] = js.undefined
}

object ColorClientCapabilities {
  @scala.inline
  def apply(textDocument: AnonColorProvider = null): ColorClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (textDocument != null) __obj.updateDynamic("textDocument")(textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorClientCapabilities]
  }
}

