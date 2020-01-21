package typings.vscodeLanguageserverProtocol.protocolTypeDefinitionMod

import typings.vscodeLanguageserverProtocol.AnonTypeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeDefinitionClientCapabilities extends js.Object {
  /**
    * The text document client capabilities
    */
  var textDocument: js.UndefOr[AnonTypeDefinition] = js.undefined
}

object TypeDefinitionClientCapabilities {
  @scala.inline
  def apply(textDocument: AnonTypeDefinition = null): TypeDefinitionClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (textDocument != null) __obj.updateDynamic("textDocument")(textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinitionClientCapabilities]
  }
}

