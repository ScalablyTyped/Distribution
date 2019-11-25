package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolDisplayPart extends js.Object {
  var kind: String
  var text: String
}

object SymbolDisplayPart {
  @scala.inline
  def apply(kind: String, text: String): SymbolDisplayPart = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SymbolDisplayPart]
  }
}

