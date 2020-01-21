package typings.vscodeLanguageserverProtocol.protocolDeclarationMod

import typings.vscodeLanguageserverProtocol.AnonDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationClientCapabilities extends js.Object {
  /**
    * The text document client capabilities
    */
  var textDocument: js.UndefOr[AnonDeclaration] = js.undefined
}

object DeclarationClientCapabilities {
  @scala.inline
  def apply(textDocument: AnonDeclaration = null): DeclarationClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (textDocument != null) __obj.updateDynamic("textDocument")(textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationClientCapabilities]
  }
}

