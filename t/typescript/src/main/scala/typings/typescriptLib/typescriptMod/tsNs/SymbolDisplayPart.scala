package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolDisplayPart extends js.Object {
  var kind: java.lang.String
  var text: java.lang.String
}

object SymbolDisplayPart {
  @scala.inline
  def apply(kind: java.lang.String, text: java.lang.String): SymbolDisplayPart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[SymbolDisplayPart]
  }
}

