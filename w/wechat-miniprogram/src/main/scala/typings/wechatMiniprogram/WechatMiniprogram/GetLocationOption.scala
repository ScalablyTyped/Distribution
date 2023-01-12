package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLocationOption extends StObject {
  
  /** 传入 true 会返回高度信息，由于获取高度需要较高精确度，会减慢接口返回速度
    *
    * 最低基础库： `1.6.0` */
  var altitude: js.UndefOr[String] = js.undefined
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetLocationCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[GetLocationFailCallback] = js.undefined
  
  /** 高精度定位超时时间(ms)，指定时间内返回最高精度，该值3000ms以上高精度定位才有效果
    *
    * 最低基础库： `2.9.0` */
  var highAccuracyExpireTime: js.UndefOr[Double] = js.undefined
  
  /** 开启高精度定位
    *
    * 最低基础库： `2.9.0` */
  var isHighAccuracy: js.UndefOr[Boolean] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetLocationSuccessCallback] = js.undefined
  
  /** wgs84 返回 gps 坐标，gcj02 返回可用于 wx.openLocation 的坐标 */
  var `type`: js.UndefOr[String] = js.undefined
}
object GetLocationOption {
  
  inline def apply(): GetLocationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLocationOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLocationOption] (val x: Self) extends AnyVal {
    
    inline def setAltitude(value: String): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setHighAccuracyExpireTime(value: Double): Self = StObject.set(x, "highAccuracyExpireTime", value.asInstanceOf[js.Any])
    
    inline def setHighAccuracyExpireTimeUndefined: Self = StObject.set(x, "highAccuracyExpireTime", js.undefined)
    
    inline def setIsHighAccuracy(value: Boolean): Self = StObject.set(x, "isHighAccuracy", value.asInstanceOf[js.Any])
    
    inline def setIsHighAccuracyUndefined: Self = StObject.set(x, "isHighAccuracy", js.undefined)
    
    inline def setSuccess(value: /* result */ GetLocationSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
