package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectWifiOptions extends js.Object {
  /**
    * Wi-Fi 设备bssid
    */
  var BSSID: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Wi-Fi 设备ssid
    */
  var SSID: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Wi-Fi 设备密码
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object ConnectWifiOptions {
  @scala.inline
  def apply(
    BSSID: java.lang.String = null,
    SSID: java.lang.String = null,
    complete: () => scala.Unit = null,
    fail: () => scala.Unit = null,
    password: java.lang.String = null,
    success: () => scala.Unit = null
  ): ConnectWifiOptions = {
    val __obj = js.Dynamic.literal()
    if (BSSID != null) __obj.updateDynamic("BSSID")(BSSID)
    if (SSID != null) __obj.updateDynamic("SSID")(SSID)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (password != null) __obj.updateDynamic("password")(password)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[ConnectWifiOptions]
  }
}

