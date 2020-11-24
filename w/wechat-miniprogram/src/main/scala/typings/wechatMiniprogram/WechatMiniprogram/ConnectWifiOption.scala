package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectWifiOption extends js.Object {
  
  /** Wi-Fi 设备 BSSID */
  var BSSID: js.UndefOr[String] = js.native
  
  /** Wi-Fi 设备 SSID */
  var SSID: String = js.native
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ConnectWifiCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ConnectWifiFailCallback] = js.native
  
  /** 跳转到系统设置页进行连接，仅安卓生效
    *
    * 最低基础库： `2.12.0` */
  var maunal: js.UndefOr[Boolean] = js.native
  
  /** Wi-Fi 设备密码 */
  var password: String = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ConnectWifiSuccessCallback] = js.native
}
object ConnectWifiOption {
  
  @scala.inline
  def apply(SSID: String, password: String): ConnectWifiOption = {
    val __obj = js.Dynamic.literal(SSID = SSID.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectWifiOption]
  }
  
  @scala.inline
  implicit class ConnectWifiOptionOps[Self <: ConnectWifiOption] (val x: Self) extends AnyVal {
    
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
    def setSSID(value: String): Self = this.set("SSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBSSID(value: String): Self = this.set("BSSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBSSID: Self = this.set("BSSID", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ WifiError => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ WifiError => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setMaunal(value: Boolean): Self = this.set("maunal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaunal: Self = this.set("maunal", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ WifiError => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
