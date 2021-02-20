package typings.wellknown

import typings.wellknown.wellknownStrings.LineString
import typings.wellknown.wellknownStrings.MultiLineString
import typings.wellknown.wellknownStrings.MultiPoint
import typings.wellknown.wellknownStrings.MultiPolygon
import typings.wellknown.wellknownStrings.Point
import typings.wellknown.wellknownStrings.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wellknown", "parse")
  @js.native
  def parse(input: String): GeoJSONGeometry = js.native
  
  @JSImport("wellknown", "stringify")
  @js.native
  def stringify(gj: GeoJSONGeometry): String = js.native
  
  type GeoJSONGeometry = GeoJSONPoint | GeoJSONMultiPoint | GeoJSONLineString | GeoJSONMultiLineString | GeoJSONPolygon | GeoJSONMultiPolygon | Null
  
  type GeoJSONLineString = Geometry[LineString, js.Array[GeoJSONPosition]]
  
  type GeoJSONMultiLineString = Geometry[MultiLineString, js.Array[js.Array[GeoJSONPosition]]]
  
  type GeoJSONMultiPoint = Geometry[MultiPoint, js.Array[GeoJSONPosition]]
  
  type GeoJSONMultiPolygon = Geometry[MultiPolygon, js.Array[js.Array[js.Array[GeoJSONPosition]]]]
  
  type GeoJSONPoint = Geometry[Point, GeoJSONPosition]
  
  type GeoJSONPolygon = Geometry[Polygon, js.Array[js.Array[GeoJSONPosition]]]
  
  type GeoJSONPosition = (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double])
  
  @js.native
  trait Geometry[T, C] extends StObject {
    
    var coordinates: C = js.native
    
    var `type`: T = js.native
  }
  object Geometry {
    
    @scala.inline
    def apply[T, C](coordinates: C, `type`: T): Geometry[T, C] = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Geometry[T, C]]
    }
    
    @scala.inline
    implicit class GeometryMutableBuilder[Self <: Geometry[_, _], T, C] (val x: Self with (Geometry[T, C])) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: C): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
