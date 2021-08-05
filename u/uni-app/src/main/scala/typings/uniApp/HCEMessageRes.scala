package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HCEMessageRes extends StObject {
  
  /**
    * 客户端接收到 NFC 设备的指令
    */
  var data: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * 消息类型
    */
  var messageType: js.UndefOr[Double] = js.undefined
  
  /**
    * 此参数当且仅当 messageType=2 时有效
    */
  var reason: js.UndefOr[Double] = js.undefined
}
object HCEMessageRes {
  
  inline def apply(): HCEMessageRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HCEMessageRes]
  }
  
  extension [Self <: HCEMessageRes](x: Self) {
    
    inline def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setMessageType(value: Double): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
    
    inline def setReason(value: Double): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
