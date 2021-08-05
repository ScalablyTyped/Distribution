package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetWifiListOptions extends StObject {
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Wi-Fi 的SSID
    */
  var wifiList: js.UndefOr[js.Array[WiFiItem]] = js.undefined
}
object SetWifiListOptions {
  
  inline def apply(): SetWifiListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetWifiListOptions]
  }
  
  extension [Self <: SetWifiListOptions](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setWifiList(value: js.Array[WiFiItem]): Self = StObject.set(x, "wifiList", value.asInstanceOf[js.Any])
    
    inline def setWifiListUndefined: Self = StObject.set(x, "wifiList", js.undefined)
    
    inline def setWifiListVarargs(value: WiFiItem*): Self = StObject.set(x, "wifiList", js.Array(value :_*))
  }
}
