package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenMapAppOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[OpenMapAppCompleteCallback] = js.undefined
  
  /** 目的地名称 */
  var destination: String
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[OpenMapAppFailCallback] = js.undefined
  
  /** 目的地纬度 */
  var latitude: Double
  
  /** 目的地经度 */
  var longitude: Double
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[OpenMapAppSuccessCallback] = js.undefined
}
object OpenMapAppOption {
  
  inline def apply(destination: String, latitude: Double, longitude: Double): OpenMapAppOption = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenMapAppOption]
  }
  
  extension [Self <: OpenMapAppOption](x: Self) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
