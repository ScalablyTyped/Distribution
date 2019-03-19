package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBLEConnectionOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 蓝牙设备 id，参考 getDevices 接口
    */
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 成功则返回本机蓝牙适配器状态
    */
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 超时时间
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object CreateBLEConnectionOptions {
  @scala.inline
  def apply(
    complete: () => scala.Unit = null,
    deviceId: java.lang.String = null,
    fail: () => scala.Unit = null,
    success: () => scala.Unit = null,
    timeout: scala.Int | scala.Double = null
  ): CreateBLEConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBLEConnectionOptions]
  }
}

