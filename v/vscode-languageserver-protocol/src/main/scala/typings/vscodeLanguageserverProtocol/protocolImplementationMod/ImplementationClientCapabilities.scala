package typings.vscodeLanguageserverProtocol.protocolImplementationMod

import typings.vscodeLanguageserverProtocol.AnonImplementation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImplementationClientCapabilities extends js.Object {
  /**
    * The text document client capabilities
    */
  var textDocument: js.UndefOr[AnonImplementation] = js.undefined
}

object ImplementationClientCapabilities {
  @scala.inline
  def apply(textDocument: AnonImplementation = null): ImplementationClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (textDocument != null) __obj.updateDynamic("textDocument")(textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationClientCapabilities]
  }
}

