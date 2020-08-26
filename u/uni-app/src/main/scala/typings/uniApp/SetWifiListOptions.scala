package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetWifiListOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Wi-Fi 的SSID
    */
  var wifiList: js.UndefOr[js.Array[WiFiItem]] = js.native
}

object SetWifiListOptions {
  @scala.inline
  def apply(): SetWifiListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetWifiListOptions]
  }
  @scala.inline
  implicit class SetWifiListOptionsOps[Self <: SetWifiListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setWifiListVarargs(value: WiFiItem*): Self = this.set("wifiList", js.Array(value :_*))
    @scala.inline
    def setWifiList(value: js.Array[WiFiItem]): Self = this.set("wifiList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWifiList: Self = this.set("wifiList", js.undefined)
  }
  
}

