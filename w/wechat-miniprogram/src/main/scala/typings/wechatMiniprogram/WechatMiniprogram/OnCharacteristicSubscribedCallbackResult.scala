package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnCharacteristicSubscribedCallbackResult extends StObject {
  
  /** characteristic对应的uuid */
  var characteristicId: String = js.native
  
  /** service对应的uuid */
  var serviceId: String = js.native
}
object OnCharacteristicSubscribedCallbackResult {
  
  @scala.inline
  def apply(characteristicId: String, serviceId: String): OnCharacteristicSubscribedCallbackResult = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCharacteristicSubscribedCallbackResult]
  }
  
  @scala.inline
  implicit class OnCharacteristicSubscribedCallbackResultMutableBuilder[Self <: OnCharacteristicSubscribedCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
  }
}
