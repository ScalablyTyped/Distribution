package typings.weixinApp.wx

import typings.weixinApp.anon.ErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetKeepScreenOnOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 是否保持屏幕常亮 */
  var keepScreenOn: Boolean
  @JSName("success")
  var success_SetKeepScreenOnOptions: js.UndefOr[js.Function1[/* res */ ErrMsg, Unit]] = js.undefined
}

object SetKeepScreenOnOptions {
  @scala.inline
  def apply(
    keepScreenOn: Boolean,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ ErrMsg => Unit = null
  ): SetKeepScreenOnOptions = {
    val __obj = js.Dynamic.literal(keepScreenOn = keepScreenOn.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SetKeepScreenOnOptions]
  }
}

