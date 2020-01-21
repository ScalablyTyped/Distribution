package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureHelpParameter extends js.Object {
  var displayParts: js.Array[SymbolDisplayPart]
  var documentation: js.Array[SymbolDisplayPart]
  var isOptional: Boolean
  var name: java.lang.String
}

object SignatureHelpParameter {
  @scala.inline
  def apply(
    displayParts: js.Array[SymbolDisplayPart],
    documentation: js.Array[SymbolDisplayPart],
    isOptional: Boolean,
    name: java.lang.String
  ): SignatureHelpParameter = {
    val __obj = js.Dynamic.literal(displayParts = displayParts.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], isOptional = isOptional.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SignatureHelpParameter]
  }
}

