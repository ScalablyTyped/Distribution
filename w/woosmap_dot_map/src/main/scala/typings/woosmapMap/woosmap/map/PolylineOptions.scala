package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolylineOptions
  extends StObject
     with GeometryOptions {
  
  /**
    * The path of the polyline.
    */
  var path: MVCArray[LatLng] | Null | (js.Array[LatLng | LatLngLiteral])
}
object PolylineOptions {
  
  inline def apply(): PolylineOptions = {
    val __obj = js.Dynamic.literal(path = null)
    __obj.asInstanceOf[PolylineOptions]
  }
  
  extension [Self <: PolylineOptions](x: Self) {
    
    inline def setPath(value: MVCArray[LatLng] | (js.Array[LatLng | LatLngLiteral])): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathVarargs(value: (LatLng | LatLngLiteral)*): Self = StObject.set(x, "path", js.Array(value*))
  }
}
