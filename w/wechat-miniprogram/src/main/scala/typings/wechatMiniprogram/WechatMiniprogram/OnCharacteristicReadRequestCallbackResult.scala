package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnCharacteristicReadRequestCallbackResult extends StObject {
  
  /** 唯一标识码，调用 writeCharacteristicValue 时使用 */
  var callbackId: Double
  
  /** characteristic对应的uuid */
  var characteristicId: String
  
  /** service对应的uuid */
  var serviceId: String
}
object OnCharacteristicReadRequestCallbackResult {
  
  inline def apply(callbackId: Double, characteristicId: String, serviceId: String): OnCharacteristicReadRequestCallbackResult = {
    val __obj = js.Dynamic.literal(callbackId = callbackId.asInstanceOf[js.Any], characteristicId = characteristicId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCharacteristicReadRequestCallbackResult]
  }
  
  extension [Self <: OnCharacteristicReadRequestCallbackResult](x: Self) {
    
    inline def setCallbackId(value: Double): Self = StObject.set(x, "callbackId", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
  }
}
