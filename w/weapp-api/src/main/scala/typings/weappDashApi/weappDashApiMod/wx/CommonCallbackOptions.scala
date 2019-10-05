package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 公共回调函数
  */
trait CommonCallbackOptions extends js.Object {
  //  接口调用结束的回调函数
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  //  接口调用失败回调函数
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  //  接口调用成功回调函数
  var success: js.UndefOr[ResponseCallback] = js.undefined
}

object CommonCallbackOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    fail: /* res */ js.Any => Unit = null,
    success: /* res */ js.Any => Unit = null
  ): CommonCallbackOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[CommonCallbackOptions]
  }
}

