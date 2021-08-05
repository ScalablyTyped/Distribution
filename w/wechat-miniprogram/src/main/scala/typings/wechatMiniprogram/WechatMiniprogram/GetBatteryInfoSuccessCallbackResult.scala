package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBatteryInfoSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 是否正在充电中 */
  var isCharging: Boolean
  
  /** 设备电量，范围 1 - 100 */
  var level: String
}
object GetBatteryInfoSuccessCallbackResult {
  
  inline def apply(errMsg: String, isCharging: Boolean, level: String): GetBatteryInfoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], isCharging = isCharging.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBatteryInfoSuccessCallbackResult]
  }
  
  extension [Self <: GetBatteryInfoSuccessCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setIsCharging(value: Boolean): Self = StObject.set(x, "isCharging", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
