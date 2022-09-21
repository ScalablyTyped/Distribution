package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleOptions
  extends StObject
     with PolygonFillOptions {
  
  /**
    * The center of the circle.
    */
  var center: LatLng | Null | LatLngLiteral
  
  /**
    * The radius of the circle.
    */
  var radius: js.UndefOr[Double | Null] = js.undefined
}
object CircleOptions {
  
  inline def apply(): CircleOptions = {
    val __obj = js.Dynamic.literal(center = null)
    __obj.asInstanceOf[CircleOptions]
  }
  
  extension [Self <: CircleOptions](x: Self) {
    
    inline def setCenter(value: LatLng | LatLngLiteral): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterNull: Self = StObject.set(x, "center", null)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusNull: Self = StObject.set(x, "radius", null)
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
