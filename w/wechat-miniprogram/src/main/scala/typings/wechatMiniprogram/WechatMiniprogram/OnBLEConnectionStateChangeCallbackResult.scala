package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBLEConnectionStateChangeCallbackResult extends StObject {
  
  /** 是否处于已连接状态 */
  var connected: Boolean
  
  /** 蓝牙设备ID */
  var deviceId: String
}
object OnBLEConnectionStateChangeCallbackResult {
  
  @scala.inline
  def apply(connected: Boolean, deviceId: String): OnBLEConnectionStateChangeCallbackResult = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBLEConnectionStateChangeCallbackResult]
  }
  
  @scala.inline
  implicit class OnBLEConnectionStateChangeCallbackResultMutableBuilder[Self <: OnBLEConnectionStateChangeCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
  }
}
