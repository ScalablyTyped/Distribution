package typings.trimblemapsTrimblemapsJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geojsonMod {
  
  type BBox = (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple6[Double, Double, Double, Double, Double, Double])
  
  trait Feature[G /* <: Geometry | Null */, P]
    extends StObject
       with GeoJsonObject {
    
    /**
      * The feature's geometry
      */
    var geometry: G
    
    /**
      * A value that uniquely identifies this feature in a
      * https://tools.ietf.org/html/rfc7946#section-3.2.
      */
    var id: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Properties associated with this feature.
      */
    var properties: P
    
    @JSName("type")
    var type_Feature: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Feature
  }
  object Feature {
    
    inline def apply[G /* <: Geometry | Null */, P](geometry: G, properties: P): Feature[G, P] = {
      val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Feature")
      __obj.asInstanceOf[Feature[G, P]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Feature[?, ?], G /* <: Geometry | Null */, P] (val x: Self & (Feature[G, P])) extends AnyVal {
      
      inline def setGeometry(value: G): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setProperties(value: P): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setType(value: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Feature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeatureCollection[G /* <: Geometry | Null */, P]
    extends StObject
       with GeoJsonObject {
    
    var features: js.Array[Feature[G, P]]
    
    @JSName("type")
    var type_FeatureCollection: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.FeatureCollection
  }
  object FeatureCollection {
    
    inline def apply[G /* <: Geometry | Null */, P](features: js.Array[Feature[G, P]]): FeatureCollection[G, P] = {
      val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("FeatureCollection")
      __obj.asInstanceOf[FeatureCollection[G, P]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FeatureCollection[?, ?], G /* <: Geometry | Null */, P] (val x: Self & (FeatureCollection[G, P])) extends AnyVal {
      
      inline def setFeatures(value: js.Array[Feature[G, P]]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesVarargs(value: (Feature[G, P])*): Self = StObject.set(x, "features", js.Array(value*))
      
      inline def setType(value: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.FeatureCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type GeoJSON = Geometry | (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties])
  
  /* Inlined @trimblemaps/trimblemaps-js.@trimblemaps/trimblemaps-js/geojson.Geometry['type'] */
  /* Rewritten from type alias, can be one of: 
    - typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPolygon
    - typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.GeometryCollection
    - typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiLineString
    - typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.LineString
    - typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Point
    - typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Polygon
    - typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPoint
  */
  trait GeoJsonGeometryTypes extends StObject
  object GeoJsonGeometryTypes {
    
    inline def GeometryCollection: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.GeometryCollection = "GeometryCollection".asInstanceOf[typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.GeometryCollection]
    
    inline def LineString: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.LineString = "LineString".asInstanceOf[typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.LineString]
    
    inline def MultiLineString: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiLineString = "MultiLineString".asInstanceOf[typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiLineString]
    
    inline def MultiPoint: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPoint = "MultiPoint".asInstanceOf[typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPoint]
    
    inline def MultiPolygon: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPolygon = "MultiPolygon".asInstanceOf[typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPolygon]
    
    inline def Point: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Point = "Point".asInstanceOf[typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Point]
    
    inline def Polygon: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Polygon = "Polygon".asInstanceOf[typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Polygon]
  }
  
  trait GeoJsonObject extends StObject {
    
    /**
      * Bounding box of the coordinate range of the object's Geometries, Features, or Feature Collections.
      * The value of the bbox member is an array of length 2*n where n is the number of dimensions
      * represented in the contained geometries, with all axes of the most southwesterly point
      * followed by all axes of the more northeasterly point.
      * The axes order of a bbox follows the axes order of geometries.
      * https://tools.ietf.org/html/rfc7946#section-5
      */
    var bbox: js.UndefOr[BBox] = js.undefined
    
    // Don't include foreign members directly into this type def.
    // in order to preserve type safety.
    // [key: string]: any;
    /**
      * Specifies the type of GeoJSON object.
      */
    var `type`: GeoJsonTypes
  }
  object GeoJsonObject {
    
    inline def apply(`type`: GeoJsonTypes): GeoJsonObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoJsonObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeoJsonObject] (val x: Self) extends AnyVal {
      
      inline def setBbox(value: BBox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      inline def setType(value: GeoJsonTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type GeoJsonProperties = StringDictionary[Any] | Null
  
  /* Inlined @trimblemaps/trimblemaps-js.@trimblemaps/trimblemaps-js/geojson.GeoJSON['type'] */
  /* Rewritten from type alias, can be one of: 
    - typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPolygon
    - typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.GeometryCollection
    - typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiLineString
    - typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.LineString
    - typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Point
    - typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.FeatureCollection
    - typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Polygon
    - typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPoint
    - typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Feature
  */
  trait GeoJsonTypes extends StObject
  object GeoJsonTypes {
    
    inline def Feature: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Feature = "Feature".asInstanceOf[typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Feature]
    
    inline def FeatureCollection: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.FeatureCollection = "FeatureCollection".asInstanceOf[typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.FeatureCollection]
    
    inline def GeometryCollection: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.GeometryCollection = "GeometryCollection".asInstanceOf[typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.GeometryCollection]
    
    inline def LineString: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.LineString = "LineString".asInstanceOf[typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.LineString]
    
    inline def MultiLineString: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiLineString = "MultiLineString".asInstanceOf[typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiLineString]
    
    inline def MultiPoint: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPoint = "MultiPoint".asInstanceOf[typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPoint]
    
    inline def MultiPolygon: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPolygon = "MultiPolygon".asInstanceOf[typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPolygon]
    
    inline def Point: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Point = "Point".asInstanceOf[typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Point]
    
    inline def Polygon: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Polygon = "Polygon".asInstanceOf[typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Polygon]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.trimblemapsTrimblemapsJs.geojsonMod.Point
    - typings.trimblemapsTrimblemapsJs.geojsonMod.MultiPoint
    - typings.trimblemapsTrimblemapsJs.geojsonMod.LineString
    - typings.trimblemapsTrimblemapsJs.geojsonMod.MultiLineString
    - typings.trimblemapsTrimblemapsJs.geojsonMod.Polygon
    - typings.trimblemapsTrimblemapsJs.geojsonMod.MultiPolygon
    - typings.trimblemapsTrimblemapsJs.geojsonMod.GeometryCollection
  */
  trait Geometry extends StObject
  object Geometry {
    
    inline def GeometryCollection(geometries: js.Array[Geometry]): typings.trimblemapsTrimblemapsJs.geojsonMod.GeometryCollection = {
      val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("GeometryCollection")
      __obj.asInstanceOf[typings.trimblemapsTrimblemapsJs.geojsonMod.GeometryCollection]
    }
    
    inline def LineString(coordinates: js.Array[Position]): typings.trimblemapsTrimblemapsJs.geojsonMod.LineString = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("LineString")
      __obj.asInstanceOf[typings.trimblemapsTrimblemapsJs.geojsonMod.LineString]
    }
    
    inline def MultiLineString(coordinates: js.Array[js.Array[Position]]): typings.trimblemapsTrimblemapsJs.geojsonMod.MultiLineString = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiLineString")
      __obj.asInstanceOf[typings.trimblemapsTrimblemapsJs.geojsonMod.MultiLineString]
    }
    
    inline def MultiPoint(coordinates: js.Array[Position]): typings.trimblemapsTrimblemapsJs.geojsonMod.MultiPoint = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiPoint")
      __obj.asInstanceOf[typings.trimblemapsTrimblemapsJs.geojsonMod.MultiPoint]
    }
    
    inline def MultiPolygon(coordinates: js.Array[js.Array[js.Array[Position]]]): typings.trimblemapsTrimblemapsJs.geojsonMod.MultiPolygon = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiPolygon")
      __obj.asInstanceOf[typings.trimblemapsTrimblemapsJs.geojsonMod.MultiPolygon]
    }
    
    inline def Point(coordinates: Position): typings.trimblemapsTrimblemapsJs.geojsonMod.Point = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Point")
      __obj.asInstanceOf[typings.trimblemapsTrimblemapsJs.geojsonMod.Point]
    }
    
    inline def Polygon(coordinates: js.Array[js.Array[Position]]): typings.trimblemapsTrimblemapsJs.geojsonMod.Polygon = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Polygon")
      __obj.asInstanceOf[typings.trimblemapsTrimblemapsJs.geojsonMod.Polygon]
    }
  }
  
  trait GeometryCollection
    extends StObject
       with GeoJsonObject
       with Geometry {
    
    var geometries: js.Array[Geometry]
    
    @JSName("type")
    var type_GeometryCollection: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.GeometryCollection
  }
  object GeometryCollection {
    
    inline def apply(geometries: js.Array[Geometry]): GeometryCollection = {
      val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("GeometryCollection")
      __obj.asInstanceOf[GeometryCollection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeometryCollection] (val x: Self) extends AnyVal {
      
      inline def setGeometries(value: js.Array[Geometry]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
      
      inline def setGeometriesVarargs(value: Geometry*): Self = StObject.set(x, "geometries", js.Array(value*))
      
      inline def setType(value: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.GeometryCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type GeometryObject = Geometry
  
  trait LineString
    extends StObject
       with GeoJsonObject
       with Geometry {
    
    var coordinates: js.Array[Position]
    
    @JSName("type")
    var type_LineString: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.LineString
  }
  object LineString {
    
    inline def apply(coordinates: js.Array[Position]): LineString = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("LineString")
      __obj.asInstanceOf[LineString]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LineString] (val x: Self) extends AnyVal {
      
      inline def setCoordinates(value: js.Array[Position]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: Position*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setType(value: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.LineString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiLineString
    extends StObject
       with GeoJsonObject
       with Geometry {
    
    var coordinates: js.Array[js.Array[Position]]
    
    @JSName("type")
    var type_MultiLineString: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiLineString
  }
  object MultiLineString {
    
    inline def apply(coordinates: js.Array[js.Array[Position]]): MultiLineString = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiLineString")
      __obj.asInstanceOf[MultiLineString]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiLineString] (val x: Self) extends AnyVal {
      
      inline def setCoordinates(value: js.Array[js.Array[Position]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: js.Array[Position]*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setType(value: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiLineString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiPoint
    extends StObject
       with GeoJsonObject
       with Geometry {
    
    var coordinates: js.Array[Position]
    
    @JSName("type")
    var type_MultiPoint: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPoint
  }
  object MultiPoint {
    
    inline def apply(coordinates: js.Array[Position]): MultiPoint = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiPoint")
      __obj.asInstanceOf[MultiPoint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiPoint] (val x: Self) extends AnyVal {
      
      inline def setCoordinates(value: js.Array[Position]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: Position*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setType(value: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPoint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiPolygon
    extends StObject
       with GeoJsonObject
       with Geometry {
    
    var coordinates: js.Array[js.Array[js.Array[Position]]]
    
    @JSName("type")
    var type_MultiPolygon: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPolygon
  }
  object MultiPolygon {
    
    inline def apply(coordinates: js.Array[js.Array[js.Array[Position]]]): MultiPolygon = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiPolygon")
      __obj.asInstanceOf[MultiPolygon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiPolygon] (val x: Self) extends AnyVal {
      
      inline def setCoordinates(value: js.Array[js.Array[js.Array[Position]]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: js.Array[js.Array[Position]]*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setType(value: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPolygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point
    extends StObject
       with GeoJsonObject
       with Geometry {
    
    var coordinates: Position
    
    @JSName("type")
    var type_Point: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Point
  }
  object Point {
    
    inline def apply(coordinates: Position): Point = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Point")
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      inline def setCoordinates(value: Position): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setType(value: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Polygon
    extends StObject
       with GeoJsonObject
       with Geometry {
    
    var coordinates: js.Array[js.Array[Position]]
    
    @JSName("type")
    var type_Polygon: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Polygon
  }
  object Polygon {
    
    inline def apply(coordinates: js.Array[js.Array[Position]]): Polygon = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Polygon")
      __obj.asInstanceOf[Polygon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Polygon] (val x: Self) extends AnyVal {
      
      inline def setCoordinates(value: js.Array[js.Array[Position]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: js.Array[Position]*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setType(value: typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Polygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Position = js.Array[Double]
}
