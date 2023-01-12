package typings.wechatMiniprogram.DB

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoPoint
  extends StObject
     with GeoInstance {
  
  var latitude: Double
  
  var longitude: Double
  
  def toJSON(): Record[String, Any]
}
object GeoPoint {
  
  inline def apply(latitude: Double, longitude: Double, toJSON: () => Record[String, Any]): GeoPoint = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GeoPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoPoint] (val x: Self) extends AnyVal {
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => Record[String, Any]): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
