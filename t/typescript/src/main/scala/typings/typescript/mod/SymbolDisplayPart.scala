package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymbolDisplayPart extends js.Object {
  var kind: java.lang.String = js.native
  var text: java.lang.String = js.native
}

object SymbolDisplayPart {
  @scala.inline
  def apply(kind: java.lang.String, text: java.lang.String): SymbolDisplayPart = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolDisplayPart]
  }
  @scala.inline
  implicit class SymbolDisplayPartOps[Self <: SymbolDisplayPart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: java.lang.String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: java.lang.String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

