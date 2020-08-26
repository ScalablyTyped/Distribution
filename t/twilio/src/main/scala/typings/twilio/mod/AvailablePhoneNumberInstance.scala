package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailablePhoneNumberInstance extends js.Object {
  var local: AvailablePhoneNumberResourceGroup = js.native
  var mobile: AvailablePhoneNumberResourceGroup = js.native
  var tollFree: AvailablePhoneNumberResourceGroup = js.native
}

object AvailablePhoneNumberInstance {
  @scala.inline
  def apply(
    local: AvailablePhoneNumberResourceGroup,
    mobile: AvailablePhoneNumberResourceGroup,
    tollFree: AvailablePhoneNumberResourceGroup
  ): AvailablePhoneNumberInstance = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], tollFree = tollFree.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailablePhoneNumberInstance]
  }
  @scala.inline
  implicit class AvailablePhoneNumberInstanceOps[Self <: AvailablePhoneNumberInstance] (val x: Self) extends AnyVal {
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
    def setLocal(value: AvailablePhoneNumberResourceGroup): Self = this.set("local", value.asInstanceOf[js.Any])
    @scala.inline
    def setMobile(value: AvailablePhoneNumberResourceGroup): Self = this.set("mobile", value.asInstanceOf[js.Any])
    @scala.inline
    def setTollFree(value: AvailablePhoneNumberResourceGroup): Self = this.set("tollFree", value.asInstanceOf[js.Any])
  }
  
}

