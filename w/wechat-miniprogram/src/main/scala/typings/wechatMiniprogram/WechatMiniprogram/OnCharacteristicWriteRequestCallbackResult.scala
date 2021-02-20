package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnCharacteristicWriteRequestCallbackResult extends StObject {
  
  /** 唯一标识码，调用 writeCharacteristicValue 时使用 */
  var callbackId: Double = js.native
  
  /** characteristic对应的uuid */
  var characteristicId: String = js.native
  
  /** service对应的uuid */
  var serviceId: String = js.native
  
  /** 请求写入的特征值数据 */
  var value: ArrayBuffer = js.native
}
object OnCharacteristicWriteRequestCallbackResult {
  
  @scala.inline
  def apply(callbackId: Double, characteristicId: String, serviceId: String, value: ArrayBuffer): OnCharacteristicWriteRequestCallbackResult = {
    val __obj = js.Dynamic.literal(callbackId = callbackId.asInstanceOf[js.Any], characteristicId = characteristicId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCharacteristicWriteRequestCallbackResult]
  }
  
  @scala.inline
  implicit class OnCharacteristicWriteRequestCallbackResultMutableBuilder[Self <: OnCharacteristicWriteRequestCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallbackId(value: Double): Self = StObject.set(x, "callbackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
