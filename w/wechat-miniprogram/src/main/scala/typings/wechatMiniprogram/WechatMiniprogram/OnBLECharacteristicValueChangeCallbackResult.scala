package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnBLECharacteristicValueChangeCallbackResult extends StObject {
  
  /** 蓝牙特征值的 uuid */
  var characteristicId: String = js.native
  
  /** 蓝牙设备 id */
  var deviceId: String = js.native
  
  /** 蓝牙特征值对应服务的 uuid */
  var serviceId: String = js.native
  
  /** 特征值最新的值 */
  var value: ArrayBuffer = js.native
}
object OnBLECharacteristicValueChangeCallbackResult {
  
  @scala.inline
  def apply(characteristicId: String, deviceId: String, serviceId: String, value: ArrayBuffer): OnBLECharacteristicValueChangeCallbackResult = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBLECharacteristicValueChangeCallbackResult]
  }
  
  @scala.inline
  implicit class OnBLECharacteristicValueChangeCallbackResultMutableBuilder[Self <: OnBLECharacteristicValueChangeCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
