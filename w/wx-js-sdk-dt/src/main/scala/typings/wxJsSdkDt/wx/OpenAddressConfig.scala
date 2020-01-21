package typings.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * openAddress的调用参数
  */
trait OpenAddressConfig extends WxBaseRequestConfig {
  /**
    * 成功回调
    */
  @JSName("success")
  var success_OpenAddressConfig: js.UndefOr[js.Function1[/* res */ OpenAddressResponse, Unit]] = js.undefined
}

object OpenAddressConfig {
  @scala.inline
  def apply(
    cancel: () => Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => Unit = null,
    success: /* res */ OpenAddressResponse => Unit = null
  ): OpenAddressConfig = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenAddressConfig]
  }
}

