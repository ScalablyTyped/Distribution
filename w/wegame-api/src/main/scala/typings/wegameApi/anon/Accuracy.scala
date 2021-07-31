package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accuracy extends StObject {
  
  /**
    * 位置的精确度
    */
  var accuracy: Double
  
  /**
    * 高度，单位 m
    */
  var altitude: Double
  
  /**
    * 水平精度，单位 m
    */
  var horizontalAccuracy: Double
  
  /**
    * 纬度，范围为 -90~90，负数表示南纬
    */
  var latitude: Double
  
  /**
    * 经度，范围为 -180~180，负数表示西经
    */
  var longitude: Double
  
  /**
    * 速度，单位 m/s
    */
  var speed: Double
  
  /**
    * 垂直精度，单位 m（Android 无法获取，返回 0）
    */
  var verticalAccuracy: Double
}
object Accuracy {
  
  @scala.inline
  def apply(
    accuracy: Double,
    altitude: Double,
    horizontalAccuracy: Double,
    latitude: Double,
    longitude: Double,
    speed: Double,
    verticalAccuracy: Double
  ): Accuracy = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], horizontalAccuracy = horizontalAccuracy.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], verticalAccuracy = verticalAccuracy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accuracy]
  }
  
  @scala.inline
  implicit class AccuracyMutableBuilder[Self <: Accuracy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAccuracy(value: Double): Self = StObject.set(x, "horizontalAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAccuracy(value: Double): Self = StObject.set(x, "verticalAccuracy", value.asInstanceOf[js.Any])
  }
}
