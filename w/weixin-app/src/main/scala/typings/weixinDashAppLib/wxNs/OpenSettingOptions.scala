package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenSettingOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_OpenSettingOptions: js.UndefOr[js.Function1[/* res */ weixinDashAppLib.Anon_AuthSetting, scala.Unit]] = js.undefined
}

object OpenSettingOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: /* res */ weixinDashAppLib.Anon_AuthSetting => scala.Unit = null
  ): OpenSettingOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenSettingOptions]
  }
}

