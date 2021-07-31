package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoMultiPolygon
  extends StObject
     with GeoInstance {
  
  var polygons: js.Array[GeoPolygon]
  
  def toJSON(): IGeoJSONMultiPolygon
}
object GeoMultiPolygon {
  
  @scala.inline
  def apply(polygons: js.Array[GeoPolygon], toJSON: () => IGeoJSONMultiPolygon): GeoMultiPolygon = {
    val __obj = js.Dynamic.literal(polygons = polygons.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GeoMultiPolygon]
  }
  
  @scala.inline
  implicit class GeoMultiPolygonMutableBuilder[Self <: GeoMultiPolygon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolygons(value: js.Array[GeoPolygon]): Self = StObject.set(x, "polygons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonsVarargs(value: GeoPolygon*): Self = StObject.set(x, "polygons", js.Array(value :_*))
    
    @scala.inline
    def setToJSON(value: () => IGeoJSONMultiPolygon): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
