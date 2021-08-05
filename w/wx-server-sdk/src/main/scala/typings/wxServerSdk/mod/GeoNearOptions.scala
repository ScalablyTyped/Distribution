package typings.wxServerSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoNearOptions extends StObject {
  
  def geometry(longitude: Double, latitude: Double): Point
  @JSName("geometry")
  var geometry_Original: Point
  
  // 点的地理位置
  var maxDistance: js.UndefOr[Double] = js.undefined
  
  // 选填，最大距离，单位为米
  var minDistance: js.UndefOr[Double] = js.undefined
}
object GeoNearOptions {
  
  inline def apply(geometry: Point): GeoNearOptions = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoNearOptions]
  }
  
  extension [Self <: GeoNearOptions](x: Self) {
    
    inline def setGeometry(value: Point): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
    
    inline def setMaxDistanceUndefined: Self = StObject.set(x, "maxDistance", js.undefined)
    
    inline def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
    
    inline def setMinDistanceUndefined: Self = StObject.set(x, "minDistance", js.undefined)
  }
}
