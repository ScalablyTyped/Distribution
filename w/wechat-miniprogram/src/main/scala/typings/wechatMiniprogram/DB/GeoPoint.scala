package typings.wechatMiniprogram.DB

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoPoint extends GeoInstance {
  
  var latitude: Double = js.native
  
  var longitude: Double = js.native
  
  def toJSON(): Record[String, _] = js.native
}
object GeoPoint {
  
  @scala.inline
  def apply(latitude: Double, longitude: Double, toJSON: () => Record[String, _]): GeoPoint = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GeoPoint]
  }
  
  @scala.inline
  implicit class GeoPointMutableBuilder[Self <: GeoPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => Record[String, _]): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
