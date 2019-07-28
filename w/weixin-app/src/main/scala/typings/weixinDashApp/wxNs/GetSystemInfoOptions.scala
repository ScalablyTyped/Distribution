package typings.weixinDashApp.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSystemInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 成功获取系统信息的回调 */
  @JSName("success")
  def success_MGetSystemInfoOptions(res: SystemInfo): Unit
}

object GetSystemInfoOptions {
  @scala.inline
  def apply(
    success: SystemInfo => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): GetSystemInfoOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetSystemInfoOptions]
  }
}

