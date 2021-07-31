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
  
  @scala.inline
  def apply(): HCEMessageRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HCEMessageRes]
  }
  
  @scala.inline
  implicit class HCEMessageResMutableBuilder[Self <: HCEMessageRes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setMessageType(value: Double): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
    
    @scala.inline
    def setReason(value: Double): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
