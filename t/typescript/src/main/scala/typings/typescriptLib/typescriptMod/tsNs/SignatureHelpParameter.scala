package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureHelpParameter extends js.Object {
  var displayParts: js.Array[SymbolDisplayPart]
  var documentation: js.Array[SymbolDisplayPart]
  var isOptional: scala.Boolean
  var name: java.lang.String
}

object SignatureHelpParameter {
  @scala.inline
  def apply(
    displayParts: js.Array[SymbolDisplayPart],
    documentation: js.Array[SymbolDisplayPart],
    isOptional: scala.Boolean,
    name: java.lang.String
  ): SignatureHelpParameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("displayParts")(displayParts)
    __obj.updateDynamic("documentation")(documentation)
    __obj.updateDynamic("isOptional")(isOptional)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SignatureHelpParameter]
  }
}

