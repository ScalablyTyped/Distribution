package typings.woosmapMap.woosmap.map

import typings.woosmapMap.woosmapMapStrings.GeometryCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONGeometryCollection extends StObject {
  
  var geometries: js.Array[GeoJSONGeometry]
  
  var `type`: GeometryCollection
}
object GeoJSONGeometryCollection {
  
  inline def apply(geometries: js.Array[GeoJSONGeometry]): GeoJSONGeometryCollection = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("GeometryCollection")
    __obj.asInstanceOf[GeoJSONGeometryCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoJSONGeometryCollection] (val x: Self) extends AnyVal {
    
    inline def setGeometries(value: js.Array[GeoJSONGeometry]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    inline def setGeometriesVarargs(value: GeoJSONGeometry*): Self = StObject.set(x, "geometries", js.Array(value*))
    
    inline def setType(value: GeometryCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
