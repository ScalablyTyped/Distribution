package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartRecordOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 超过30s或页面onHide时会结束录像 */
  var timeoutCallback: js.UndefOr[js.Function1[/* res */ RecordResponse, Unit]] = js.undefined
}

object StartRecordOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null,
    timeoutCallback: /* res */ RecordResponse => Unit = null
  ): StartRecordOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (timeoutCallback != null) __obj.updateDynamic("timeoutCallback")(js.Any.fromFunction1(timeoutCallback))
    __obj.asInstanceOf[StartRecordOptions]
  }
}

