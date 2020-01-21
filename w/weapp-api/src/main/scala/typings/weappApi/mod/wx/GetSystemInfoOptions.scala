package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSystemInfoOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  /** 成功获取系统信息的回调 */
  def success(res: SystemInfo): Unit
}

object GetSystemInfoOptions {
  @scala.inline
  def apply(
    success: SystemInfo => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: /* res */ js.Any => Unit = null
  ): GetSystemInfoOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetSystemInfoOptions]
  }
}

