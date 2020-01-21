package typings.weixinApp.wx

import typings.weixinApp.AnonErrMsgIsEnrolled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckIsSoterEnrolledInDeviceOptions
  extends BaseOptions[js.Any, js.Any] {
  var checkAuthMode: AuthModes
   // 认证方式
  @JSName("success")
  var success_CheckIsSoterEnrolledInDeviceOptions: js.UndefOr[js.Function1[/* res */ AnonErrMsgIsEnrolled, Unit]] = js.undefined
}

object CheckIsSoterEnrolledInDeviceOptions {
  @scala.inline
  def apply(
    checkAuthMode: AuthModes,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ AnonErrMsgIsEnrolled => Unit = null
  ): CheckIsSoterEnrolledInDeviceOptions = {
    val __obj = js.Dynamic.literal(checkAuthMode = checkAuthMode.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[CheckIsSoterEnrolledInDeviceOptions]
  }
}

