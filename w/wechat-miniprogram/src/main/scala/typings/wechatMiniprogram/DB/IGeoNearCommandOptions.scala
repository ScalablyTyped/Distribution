package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeoNearCommandOptions extends StObject {
  
  var geometry: GeoPoint
  
  var maxDistance: js.UndefOr[Double] = js.undefined
  
  var minDistance: js.UndefOr[Double] = js.undefined
}
object IGeoNearCommandOptions {
  
  inline def apply(geometry: GeoPoint): IGeoNearCommandOptions = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoNearCommandOptions]
  }
  
  extension [Self <: IGeoNearCommandOptions](x: Self) {
    
    inline def setGeometry(value: GeoPoint): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
    
    inline def setMaxDistanceUndefined: Self = StObject.set(x, "maxDistance", js.undefined)
    
    inline def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
    
    inline def setMinDistanceUndefined: Self = StObject.set(x, "minDistance", js.undefined)
  }
}
