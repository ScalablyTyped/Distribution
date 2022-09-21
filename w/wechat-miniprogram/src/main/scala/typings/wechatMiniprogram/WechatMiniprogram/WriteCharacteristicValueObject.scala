package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteCharacteristicValueObject extends StObject {
  
  /** 可选，处理回包时使用 */
  var callbackId: js.UndefOr[Double] = js.undefined
  
  /** characteristic对应的uuid */
  var characteristicId: String
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[WriteCharacteristicValueCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[WriteCharacteristicValueFailCallback] = js.undefined
  
  /** 是否需要通知主机value已更新 */
  var needNotify: Boolean
  
  /** service 的 uuid */
  var serviceId: String
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[WriteCharacteristicValueSuccessCallback] = js.undefined
  
  /** 特征值对应的二进制值 */
  var value: js.typedarray.ArrayBuffer
}
object WriteCharacteristicValueObject {
  
  inline def apply(characteristicId: String, needNotify: Boolean, serviceId: String, value: js.typedarray.ArrayBuffer): WriteCharacteristicValueObject = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], needNotify = needNotify.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteCharacteristicValueObject]
  }
  
  extension [Self <: WriteCharacteristicValueObject](x: Self) {
    
    inline def setCallbackId(value: Double): Self = StObject.set(x, "callbackId", value.asInstanceOf[js.Any])
    
    inline def setCallbackIdUndefined: Self = StObject.set(x, "callbackId", js.undefined)
    
    inline def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setNeedNotify(value: Boolean): Self = StObject.set(x, "needNotify", value.asInstanceOf[js.Any])
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
