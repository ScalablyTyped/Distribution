package typings.wxJsSdkDt.wx

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
  var trigger: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object WxBaseMenuRequestConfig {
  @scala.inline
  def apply(
    cancel: () => Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => Unit = null,
    success: /* res */ js.UndefOr[js.Any] => Unit = null,
    trigger: () => Unit = null
  ): WxBaseMenuRequestConfig = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (trigger != null) __obj.updateDynamic("trigger")(js.Any.fromFunction0(trigger))
    __obj.asInstanceOf[WxBaseMenuRequestConfig]
  }
}

