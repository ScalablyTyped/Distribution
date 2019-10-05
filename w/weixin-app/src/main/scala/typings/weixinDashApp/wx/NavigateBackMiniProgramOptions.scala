package typings.weixinDashApp.wx

import typings.weixinDashApp.Anon_ErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateBackMiniProgramOptions
  extends BaseOptions[js.Any, js.Any] {
  var extraData: js.UndefOr[js.Any] = js.undefined
   // 需要返回给上一个小程序的数据，上一个小程序可在 App.onShow() 中获取到这份数据。详情
  @JSName("success")
  var success_NavigateBackMiniProgramOptions: js.UndefOr[js.Function1[/* res */ Anon_ErrMsg, Unit]] = js.undefined
}

object NavigateBackMiniProgramOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    extraData: js.Any = null,
    fail: js.Any => Unit = null,
    success: /* res */ Anon_ErrMsg => Unit = null
  ): NavigateBackMiniProgramOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (extraData != null) __obj.updateDynamic("extraData")(extraData)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[NavigateBackMiniProgramOptions]
  }
}

