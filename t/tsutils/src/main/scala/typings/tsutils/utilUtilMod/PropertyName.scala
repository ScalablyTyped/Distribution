package typings.tsutils.utilUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyName extends js.Object {
  var displayName: String = js.native
  var symbolName: typings.typescript.mod.String = js.native
}

object PropertyName {
  @scala.inline
  def apply(displayName: String, symbolName: typings.typescript.mod.String): PropertyName = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], symbolName = symbolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyName]
  }
  @scala.inline
  implicit class PropertyNameOps[Self <: PropertyName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbolName(value: typings.typescript.mod.String): Self = this.set("symbolName", value.asInstanceOf[js.Any])
  }
  
}

