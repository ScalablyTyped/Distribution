package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChoosePoiSuccessCallbackResult extends StObject {
  
  /** 详细地址 */
  var address: String
  
  /** 城市名称 */
  var city: Double
  
  var errMsg: String
  
  /** 纬度，浮点数，范围为-90~90，负数表示南纬。使用 gcj02 国测局坐标系 */
  var latitude: Double
  
  /** 经度，浮点数，范围为-180~180，负数表示西经。使用 gcj02 国测局坐标系 */
  var longitude: Double
  
  /** 位置名称 */
  var name: String
  
  /** 选择城市时，值为 1，选择精确位置时，值为 2 */
  var `type`: Double
}
object ChoosePoiSuccessCallbackResult {
  
  inline def apply(
    address: String,
    city: Double,
    errMsg: String,
    latitude: Double,
    longitude: Double,
    name: String,
    `type`: Double
  ): ChoosePoiSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoosePoiSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChoosePoiSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setCity(value: Double): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
