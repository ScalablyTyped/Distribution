package typings.wxDashJsDashSdkDashDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartSearchBeaconsConfig extends WxBaseRequestConfig {
  /**
    * 摇周边的业务ticket, 系统自动添加在摇出来的页面链接后面
    */
  var ticket: String
  /**
    * 完成后的回调
    */
  @JSName("complete")
  def complete_MStartSearchBeaconsConfig(argv: js.Any): Unit
}

object StartSearchBeaconsConfig {
  @scala.inline
  def apply(
    complete: js.Any => Unit,
    ticket: String,
    cancel: () => Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => Unit = null,
    success: /* res */ js.UndefOr[js.Any] => Unit = null
  ): StartSearchBeaconsConfig = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), ticket = ticket.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[StartSearchBeaconsConfig]
  }
}

