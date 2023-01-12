package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 媒体
//  地图
trait LocationBaseOptions extends StObject {
  
  //  纬度，浮点数，范围为-90~90，负数表示南纬
  var latitude: Double
  
  //  经度，浮点数，范围为-180~180，负数表示西经
  var longitude: Double
}
object LocationBaseOptions {
  
  inline def apply(latitude: Double, longitude: Double): LocationBaseOptions = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationBaseOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationBaseOptions] (val x: Self) extends AnyVal {
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
