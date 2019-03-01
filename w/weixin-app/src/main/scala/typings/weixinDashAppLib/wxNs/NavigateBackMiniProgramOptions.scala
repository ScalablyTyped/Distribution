package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateBackMiniProgramOptions
  extends BaseOptions[js.Any, js.Any] {
  var extraData: js.UndefOr[js.Any] = js.undefined
   // 需要返回给上一个小程序的数据，上一个小程序可在 App.onShow() 中获取到这份数据。详情
  @JSName("success")
  var success_NavigateBackMiniProgramOptions: js.UndefOr[js.Function1[/* res */ weixinDashAppLib.Anon_ErrMsg, scala.Unit]] = js.undefined
}

object NavigateBackMiniProgramOptions {
  @scala.inline
  def apply(
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    extraData: js.Any = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ weixinDashAppLib.Anon_ErrMsg, scala.Unit] = null
  ): NavigateBackMiniProgramOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (extraData != null) __obj.updateDynamic("extraData")(extraData)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[NavigateBackMiniProgramOptions]
  }
}

