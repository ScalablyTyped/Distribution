package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设备-----拨打电话
trait MakePhoneCallOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 需要拨打的电话号码
  		 */
  var phoneNumber: String
}

object MakePhoneCallOptions {
  @scala.inline
  def apply(
    phoneNumber: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): MakePhoneCallOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[MakePhoneCallOptions]
  }
}

