package typings.vscodeDashLanguageserverDashProtocol.libProtocolDotTypeDefinitionMod

import typings.vscodeDashLanguageserverDashProtocol.Anon_TypeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeDefinitionClientCapabilities extends js.Object {
  /**
    * The text document client capabilities
    */
  var textDocument: js.UndefOr[Anon_TypeDefinition] = js.undefined
}

object TypeDefinitionClientCapabilities {
  @scala.inline
  def apply(textDocument: Anon_TypeDefinition = null): TypeDefinitionClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (textDocument != null) __obj.updateDynamic("textDocument")(textDocument)
    __obj.asInstanceOf[TypeDefinitionClientCapabilities]
  }
}

