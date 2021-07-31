package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteCharacteristicValueObject extends StObject {
  
  /** 可选，处理回包时使用 */
  var callbackId: js.UndefOr[Double] = js.undefined
  
  /** characteristic对应的uuid */
  var characteristicId: String
  
  /** 是否需要通知主机value已更新 */
  var needNotify: Boolean
  
  /** service 的 uuid */
  var serviceId: String
  
  /** 特征值对应的二进制值 */
  var value: ArrayBuffer
}
object WriteCharacteristicValueObject {
  
  @scala.inline
  def apply(characteristicId: String, needNotify: Boolean, serviceId: String, value: ArrayBuffer): WriteCharacteristicValueObject = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], needNotify = needNotify.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteCharacteristicValueObject]
  }
  
  @scala.inline
  implicit class WriteCharacteristicValueObjectMutableBuilder[Self <: WriteCharacteristicValueObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallbackId(value: Double): Self = StObject.set(x, "callbackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackIdUndefined: Self = StObject.set(x, "callbackId", js.undefined)
    
    @scala.inline
    def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedNotify(value: Boolean): Self = StObject.set(x, "needNotify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
