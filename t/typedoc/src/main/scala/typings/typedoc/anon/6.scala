package typings.typedoc.anon

import typings.typedoc.typedocStrings.listInvalidSymbolLinks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `6` extends js.Object {
  var name: listInvalidSymbolLinks = js.native
}

object `6` {
  @scala.inline
  def apply(name: listInvalidSymbolLinks): `6` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`6`]
  }
  @scala.inline
  implicit class `6Ops`[Self <: `6`] (val x: Self) extends AnyVal {
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
    def setName(value: listInvalidSymbolLinks): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

