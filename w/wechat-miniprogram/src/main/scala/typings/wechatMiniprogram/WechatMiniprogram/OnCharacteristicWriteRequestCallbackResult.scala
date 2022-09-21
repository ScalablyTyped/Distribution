package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnCharacteristicWriteRequestCallbackResult extends StObject {
  
  /** 唯一标识码，调用 writeCharacteristicValue 时使用 */
  var callbackId: Double
  
  /** characteristic对应的uuid */
  var characteristicId: String
  
  /** service对应的uuid */
  var serviceId: String
  
  /** 请求写入的特征值数据 */
  var value: js.typedarray.ArrayBuffer
}
object OnCharacteristicWriteRequestCallbackResult {
  
  inline def apply(callbackId: Double, characteristicId: String, serviceId: String, value: js.typedarray.ArrayBuffer): OnCharacteristicWriteRequestCallbackResult = {
    val __obj = js.Dynamic.literal(callbackId = callbackId.asInstanceOf[js.Any], characteristicId = characteristicId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCharacteristicWriteRequestCallbackResult]
  }
  
  extension [Self <: OnCharacteristicWriteRequestCallbackResult](x: Self) {
    
    inline def setCallbackId(value: Double): Self = StObject.set(x, "callbackId", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
