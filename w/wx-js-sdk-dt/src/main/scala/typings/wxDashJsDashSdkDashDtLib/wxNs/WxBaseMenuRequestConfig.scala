package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 所有Menu中的相关接口的请求参数
  */
trait WxBaseMenuRequestConfig extends WxBaseRequestConfig {
  /**
    * 监听Menu中的按钮点击时触发的方法
    */
  var trigger: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object WxBaseMenuRequestConfig {
  @scala.inline
  def apply(
    cancel: js.Function0[scala.Unit] = null,
    complete: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null,
    fail: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit] = null,
    success: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null,
    trigger: js.Function0[scala.Unit] = null
  ): WxBaseMenuRequestConfig = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    __obj.asInstanceOf[WxBaseMenuRequestConfig]
  }
}

