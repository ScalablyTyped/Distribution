package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBLEDeviceCharacteristicsSuccessCallbackResult extends StObject {
  
  /** 设备特征值列表 */
  var characteristics: js.Array[BLECharacteristic]
  
  var errMsg: String
}
object GetBLEDeviceCharacteristicsSuccessCallbackResult {
  
  inline def apply(characteristics: js.Array[BLECharacteristic], errMsg: String): GetBLEDeviceCharacteristicsSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBLEDeviceCharacteristicsSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBLEDeviceCharacteristicsSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setCharacteristics(value: js.Array[BLECharacteristic]): Self = StObject.set(x, "characteristics", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicsVarargs(value: BLECharacteristic*): Self = StObject.set(x, "characteristics", js.Array(value*))
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
