package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBLEDeviceCharacteristicsSuccess extends StObject {
  
  /**
    * 设备特征值列表
    */
  var characteristics: js.UndefOr[js.Array[GetBLEDeviceCharacteristicsSuccessData]] = js.undefined
  
  /**
    * 成功：ok，错误：详细信息
    */
  var errMsg: js.UndefOr[String] = js.undefined
}
object GetBLEDeviceCharacteristicsSuccess {
  
  inline def apply(): GetBLEDeviceCharacteristicsSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBLEDeviceCharacteristicsSuccess]
  }
  
  extension [Self <: GetBLEDeviceCharacteristicsSuccess](x: Self) {
    
    inline def setCharacteristics(value: js.Array[GetBLEDeviceCharacteristicsSuccessData]): Self = StObject.set(x, "characteristics", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicsUndefined: Self = StObject.set(x, "characteristics", js.undefined)
    
    inline def setCharacteristicsVarargs(value: GetBLEDeviceCharacteristicsSuccessData*): Self = StObject.set(x, "characteristics", js.Array(value*))
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
  }
}
