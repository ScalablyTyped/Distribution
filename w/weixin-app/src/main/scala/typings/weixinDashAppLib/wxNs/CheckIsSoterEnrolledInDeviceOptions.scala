package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckIsSoterEnrolledInDeviceOptions
  extends BaseOptions[js.Any, js.Any] {
  var checkAuthMode: AuthModes
   // 认证方式
  @JSName("success")
  var success_CheckIsSoterEnrolledInDeviceOptions: js.UndefOr[js.Function1[/* res */ weixinDashAppLib.Anon_ErrMsgIsEnrolled, scala.Unit]] = js.undefined
}

object CheckIsSoterEnrolledInDeviceOptions {
  @scala.inline
  def apply(
    checkAuthMode: AuthModes,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ weixinDashAppLib.Anon_ErrMsgIsEnrolled, scala.Unit] = null
  ): CheckIsSoterEnrolledInDeviceOptions = {
    val __obj = js.Dynamic.literal(checkAuthMode = checkAuthMode)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[CheckIsSoterEnrolledInDeviceOptions]
  }
}

