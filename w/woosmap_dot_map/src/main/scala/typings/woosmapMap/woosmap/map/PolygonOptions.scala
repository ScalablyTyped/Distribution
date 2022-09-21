package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolygonOptions
  extends StObject
     with PolygonFillOptions {
  
  /**
    * The paths of the polygon.
    */
  var paths: (MVCArray[LatLng | MVCArray[LatLng]]) | Null | (js.Array[(js.Array[LatLng | LatLngLiteral]) | LatLng | LatLngLiteral])
}
object PolygonOptions {
  
  inline def apply(): PolygonOptions = {
    val __obj = js.Dynamic.literal(paths = null)
    __obj.asInstanceOf[PolygonOptions]
  }
  
  extension [Self <: PolygonOptions](x: Self) {
    
    inline def setPaths(
      value: (MVCArray[LatLng | MVCArray[LatLng]]) | (js.Array[(js.Array[LatLng | LatLngLiteral]) | LatLng | LatLngLiteral])
    ): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsNull: Self = StObject.set(x, "paths", null)
    
    inline def setPathsVarargs(value: ((js.Array[LatLng | LatLngLiteral]) | LatLng | LatLngLiteral)*): Self = StObject.set(x, "paths", js.Array(value*))
  }
}
