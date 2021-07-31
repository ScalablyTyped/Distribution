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
  
  @scala.inline
  def apply(): GetBLEDeviceCharacteristicsSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBLEDeviceCharacteristicsSuccess]
  }
  
  @scala.inline
  implicit class GetBLEDeviceCharacteristicsSuccessMutableBuilder[Self <: GetBLEDeviceCharacteristicsSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacteristics(value: js.Array[GetBLEDeviceCharacteristicsSuccessData]): Self = StObject.set(x, "characteristics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacteristicsUndefined: Self = StObject.set(x, "characteristics", js.undefined)
    
    @scala.inline
    def setCharacteristicsVarargs(value: GetBLEDeviceCharacteristicsSuccessData*): Self = StObject.set(x, "characteristics", js.Array(value :_*))
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
  }
}
