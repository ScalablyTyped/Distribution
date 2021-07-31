package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectWifiOptions extends StObject {
  
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
  def apply(): ConnectWifiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectWifiOptions]
  }
  
  @scala.inline
  implicit class ConnectWifiOptionsMutableBuilder[Self <: ConnectWifiOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBSSID(value: String): Self = StObject.set(x, "BSSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBSSIDUndefined: Self = StObject.set(x, "BSSID", js.undefined)
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setSSID(value: String): Self = StObject.set(x, "SSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSIDUndefined: Self = StObject.set(x, "SSID", js.undefined)
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
