package typings.webidl2.mod

import typings.webidl2.webidl2Strings.NaN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueDescriptionNaN extends ValueDescription {
  var `type`: NaN = js.native
}

object ValueDescriptionNaN {
  @scala.inline
  def apply(`type`: NaN): ValueDescriptionNaN = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescriptionNaN]
  }
  @scala.inline
  implicit class ValueDescriptionNaNOps[Self <: ValueDescriptionNaN] (val x: Self) extends AnyVal {
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
    def setType(value: NaN): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

