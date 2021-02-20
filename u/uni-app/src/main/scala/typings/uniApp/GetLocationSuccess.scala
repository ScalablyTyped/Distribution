package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLocationSuccess extends StObject {
  
  /**
    * 位置的精确度
    */
  var accuracy: js.UndefOr[String] = js.native
  
  /**
    * 地址信息
    */
  var address: js.UndefOr[js.Any] = js.native
  
  /**
    * 高度，单位 m
    */
  var altitude: js.UndefOr[Double] = js.native
  
  /**
    * 水平精度，单位 m
    */
  var horizontalAccuracy: js.UndefOr[Double] = js.native
  
  /**
    * 纬度，浮点数，范围为-90~90，负数表示南纬
    */
  var latitude: js.UndefOr[Double] = js.native
  
  /**
    * 经度，范围为-180~180，负数表示西经
    */
  var longitude: js.UndefOr[Double] = js.native
  
  /**
    * 速度，浮点数，单位m/s
    */
  var speed: js.UndefOr[Double] = js.native
  
  /**
    * 垂直精度，单位 m（Android 无法获取，返回 0）
    */
  var verticalAccuracy: js.UndefOr[Double] = js.native
}
object GetLocationSuccess {
  
  @scala.inline
  def apply(): GetLocationSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLocationSuccess]
  }
  
  @scala.inline
  implicit class GetLocationSuccessMutableBuilder[Self <: GetLocationSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: String): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    @scala.inline
    def setAddress(value: js.Any): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setHorizontalAccuracy(value: Double): Self = StObject.set(x, "horizontalAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAccuracyUndefined: Self = StObject.set(x, "horizontalAccuracy", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    @scala.inline
    def setVerticalAccuracy(value: Double): Self = StObject.set(x, "verticalAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAccuracyUndefined: Self = StObject.set(x, "verticalAccuracy", js.undefined)
  }
}
