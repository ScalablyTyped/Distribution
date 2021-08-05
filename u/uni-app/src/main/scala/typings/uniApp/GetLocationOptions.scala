package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLocationOptions extends StObject {
  
  /**
    * 传入 true 会返回高度信息，由于获取高度需要较高精确度，会减慢接口返回速度
    */
  var altitude: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 传入 true 会解析地址
    */
  var geocode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ GetLocationSuccess, Unit]] = js.undefined
  
  /**
    * 默认为 wgs84 返回 gps 坐标，gcj02 返回可用于uni.openLocation的坐标
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object GetLocationOptions {
  
  inline def apply(): GetLocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLocationOptions]
  }
  
  extension [Self <: GetLocationOptions](x: Self) {
    
    inline def setAltitude(value: Boolean): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setGeocode(value: Boolean): Self = StObject.set(x, "geocode", value.asInstanceOf[js.Any])
    
    inline def setGeocodeUndefined: Self = StObject.set(x, "geocode", js.undefined)
    
    inline def setSuccess(value: /* result */ GetLocationSuccess => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
