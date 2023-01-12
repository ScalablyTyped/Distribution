package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnCharacteristicSubscribedCallbackResult extends StObject {
  
  /** characteristic对应的uuid */
  var characteristicId: String
  
  /** service对应的uuid */
  var serviceId: String
}
object OnCharacteristicSubscribedCallbackResult {
  
  inline def apply(characteristicId: String, serviceId: String): OnCharacteristicSubscribedCallbackResult = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCharacteristicSubscribedCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnCharacteristicSubscribedCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
  }
}
