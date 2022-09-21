package typings.wellknown

import typings.wellknown.wellknownStrings.GeometryCollection
import typings.wellknown.wellknownStrings.LineString
import typings.wellknown.wellknownStrings.MultiLineString
import typings.wellknown.wellknownStrings.MultiPoint
import typings.wellknown.wellknownStrings.MultiPolygon
import typings.wellknown.wellknownStrings.Point
import typings.wellknown.wellknownStrings.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wellknown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(input: String): GeoJSONGeometryOrNull = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[GeoJSONGeometryOrNull]
  
  inline def stringify(gj: GeoJSONGeometry): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(gj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type GeoJSONGeometry = GeoJSONPoint | GeoJSONMultiPoint | GeoJSONLineString | GeoJSONMultiLineString | GeoJSONPolygon | GeoJSONMultiPolygon | GeoJSONGeometryCollection
  
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
    
    extension [Self <: GeoJSONGeometryCollection](x: Self) {
      
      inline def setGeometries(value: js.Array[GeoJSONGeometry]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
      
      inline def setGeometriesVarargs(value: GeoJSONGeometry*): Self = StObject.set(x, "geometries", js.Array(value*))
      
      inline def setType(value: GeometryCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type GeoJSONGeometryOrNull = GeoJSONGeometry | Null
  
  type GeoJSONLineString = Geometry[LineString, js.Array[GeoJSONPosition]]
  
  type GeoJSONMultiLineString = Geometry[MultiLineString, js.Array[js.Array[GeoJSONPosition]]]
  
  type GeoJSONMultiPoint = Geometry[MultiPoint, js.Array[GeoJSONPosition]]
  
  type GeoJSONMultiPolygon = Geometry[MultiPolygon, js.Array[js.Array[js.Array[GeoJSONPosition]]]]
  
  type GeoJSONPoint = Geometry[Point, GeoJSONPosition]
  
  type GeoJSONPolygon = Geometry[Polygon, js.Array[js.Array[GeoJSONPosition]]]
  
  type GeoJSONPosition = (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double])
  
  trait Geometry[T, C] extends StObject {
    
    var coordinates: C
    
    var `type`: T
  }
  object Geometry {
    
    inline def apply[T, C](coordinates: C, `type`: T): Geometry[T, C] = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Geometry[T, C]]
    }
    
    extension [Self <: Geometry[?, ?], T, C](x: Self & (Geometry[T, C])) {
      
      inline def setCoordinates(value: C): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
