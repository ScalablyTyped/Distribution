package typings.vueTelInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueTelInputInputOption extends js.Object {
  var showDialCode: Boolean = js.native
}

object VueTelInputInputOption {
  @scala.inline
  def apply(showDialCode: Boolean): VueTelInputInputOption = {
    val __obj = js.Dynamic.literal(showDialCode = showDialCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueTelInputInputOption]
  }
  @scala.inline
  implicit class VueTelInputInputOptionOps[Self <: VueTelInputInputOption] (val x: Self) extends AnyVal {
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
    def setShowDialCode(value: Boolean): Self = this.set("showDialCode", value.asInstanceOf[js.Any])
  }
  
}

