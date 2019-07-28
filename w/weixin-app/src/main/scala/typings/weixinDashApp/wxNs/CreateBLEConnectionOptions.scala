package typings.weixinDashApp.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBLEConnectionOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 蓝牙设备 id，参考 getDevices 接口
  		 */
  var deviceId: String
  @JSName("success")
  def success_MCreateBLEConnectionOptions(res: ErrMsgResponse): Unit
}

object CreateBLEConnectionOptions {
  @scala.inline
  def apply(
    deviceId: String,
    success: ErrMsgResponse => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): CreateBLEConnectionOptions = {
    val __obj = js.Dynamic.literal(deviceId = deviceId, success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[CreateBLEConnectionOptions]
  }
}

