package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBLEDeviceServicesSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 设备服务列表 */
  var services: js.Array[BLEService]
}
object GetBLEDeviceServicesSuccessCallbackResult {
  
  inline def apply(errMsg: String, services: js.Array[BLEService]): GetBLEDeviceServicesSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBLEDeviceServicesSuccessCallbackResult]
  }
  
  extension [Self <: GetBLEDeviceServicesSuccessCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setServices(value: js.Array[BLEService]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesVarargs(value: BLEService*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
