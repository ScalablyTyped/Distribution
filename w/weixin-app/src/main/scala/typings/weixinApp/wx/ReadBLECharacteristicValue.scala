package typings.weixinApp.wx

import typings.weixinApp.anon.characteristiccharacteris
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadBLECharacteristicValue
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /**
    * 蓝牙特征值的 uuid
    */
  var characteristicId: String
  
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: String
  
  /**
    * 蓝牙特征值对应服务的 uuid
    */
  var serviceId: String
  
  @JSName("success")
  def success_MReadBLECharacteristicValue(res: characteristiccharacteris): Unit
}
object ReadBLECharacteristicValue {
  
  @scala.inline
  def apply(
    characteristicId: String,
    deviceId: String,
    serviceId: String,
    success: characteristiccharacteris => Unit
  ): ReadBLECharacteristicValue = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ReadBLECharacteristicValue]
  }
  
  @scala.inline
  implicit class ReadBLECharacteristicValueMutableBuilder[Self <: ReadBLECharacteristicValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: characteristiccharacteris => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
