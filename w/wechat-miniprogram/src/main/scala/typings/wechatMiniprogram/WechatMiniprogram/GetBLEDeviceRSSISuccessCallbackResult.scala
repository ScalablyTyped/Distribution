package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBLEDeviceRSSISuccessCallbackResult extends StObject {
  
  /** 信号强度 */
  var RSSI: Double
  
  var errMsg: String
}
object GetBLEDeviceRSSISuccessCallbackResult {
  
  @scala.inline
  def apply(RSSI: Double, errMsg: String): GetBLEDeviceRSSISuccessCallbackResult = {
    val __obj = js.Dynamic.literal(RSSI = RSSI.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBLEDeviceRSSISuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetBLEDeviceRSSISuccessCallbackResultMutableBuilder[Self <: GetBLEDeviceRSSISuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRSSI(value: Double): Self = StObject.set(x, "RSSI", value.asInstanceOf[js.Any])
  }
}
