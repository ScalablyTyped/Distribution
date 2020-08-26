package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneNumber extends js.Object {
  var phoneNumber: String = js.native
}

object PhoneNumber {
  @scala.inline
  def apply(phoneNumber: String): PhoneNumber = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumber]
  }
  @scala.inline
  implicit class PhoneNumberOps[Self <: PhoneNumber] (val x: Self) extends AnyVal {
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
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
  }
  
}

