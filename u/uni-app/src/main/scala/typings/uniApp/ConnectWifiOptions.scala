package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectWifiOptions extends js.Object {
  /**
    * Wi-Fi 设备bssid
    */
  var BSSID: js.UndefOr[String] = js.undefined
  /**
    * Wi-Fi 设备ssid
    */
  var SSID: js.UndefOr[String] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Wi-Fi 设备密码
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ConnectWifiOptions {
  @scala.inline
  def apply(
    BSSID: String = null,
    SSID: String = null,
    complete: () => Unit = null,
    fail: () => Unit = null,
    password: String = null,
    success: () => Unit = null
  ): ConnectWifiOptions = {
    val __obj = js.Dynamic.literal()
    if (BSSID != null) __obj.updateDynamic("BSSID")(BSSID.asInstanceOf[js.Any])
    if (SSID != null) __obj.updateDynamic("SSID")(SSID.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[ConnectWifiOptions]
  }
}

