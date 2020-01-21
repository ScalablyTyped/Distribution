package typings.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopSearchBeaconsConfig extends WxBaseRequestConfig {
  @JSName("complete")
  def complete_MStopSearchBeaconsConfig(res: js.Any): Unit
}

object StopSearchBeaconsConfig {
  @scala.inline
  def apply(
    complete: js.Any => Unit,
    cancel: () => Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => Unit = null,
    success: /* res */ js.UndefOr[js.Any] => Unit = null
  ): StopSearchBeaconsConfig = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[StopSearchBeaconsConfig]
  }
}

