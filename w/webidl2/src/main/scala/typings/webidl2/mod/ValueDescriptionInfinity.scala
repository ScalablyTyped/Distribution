package typings.webidl2.mod

import typings.webidl2.webidl2Strings.Infinity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueDescriptionInfinity extends ValueDescription {
  var negative: Boolean = js.native
  var `type`: Infinity = js.native
}

object ValueDescriptionInfinity {
  @scala.inline
  def apply(negative: Boolean, `type`: Infinity): ValueDescriptionInfinity = {
    val __obj = js.Dynamic.literal(negative = negative.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescriptionInfinity]
  }
  @scala.inline
  implicit class ValueDescriptionInfinityOps[Self <: ValueDescriptionInfinity] (val x: Self) extends AnyVal {
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
    def setNegative(value: Boolean): Self = this.set("negative", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Infinity): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

