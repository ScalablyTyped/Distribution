package typings
package typescriptLib.typescriptMod

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
    val __obj = js.Dynamic.literal(kind = kind, text = text)
  
    __obj.asInstanceOf[SymbolDisplayPart]
  }
}

