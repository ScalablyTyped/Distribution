package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设备-----拨打电话
@js.native
trait MakePhoneCallOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
    * 需要拨打的电话号码
    */
  var phoneNumber: String = js.native
}

object MakePhoneCallOptions {
  @scala.inline
  def apply(phoneNumber: String): MakePhoneCallOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakePhoneCallOptions]
  }
  @scala.inline
  implicit class MakePhoneCallOptionsOps[Self <: MakePhoneCallOptions] (val x: Self) extends AnyVal {
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

