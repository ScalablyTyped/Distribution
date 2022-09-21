package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONRawGeometry[T, C] extends StObject {
  
  var coordinates: C
  
  var `type`: T
}
object GeoJSONRawGeometry {
  
  inline def apply[T, C](coordinates: C, `type`: T): GeoJSONRawGeometry[T, C] = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONRawGeometry[T, C]]
  }
  
  extension [Self <: GeoJSONRawGeometry[?, ?], T, C](x: Self & (GeoJSONRawGeometry[T, C])) {
    
    inline def setCoordinates(value: C): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
