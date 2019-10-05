package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNetworkTypeOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  /** 接口调用成功，返回网络类型 networkType */
  def success(res: NetworkTypeData): Unit
}

object GetNetworkTypeOptions {
  @scala.inline
  def apply(
    success: NetworkTypeData => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: /* res */ js.Any => Unit = null
  ): GetNetworkTypeOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetNetworkTypeOptions]
  }
}

