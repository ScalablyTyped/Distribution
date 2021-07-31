package typings.topojsonSpecification

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.geojson.mod.BBox
import typings.geojson.mod.GeoJsonGeometryTypes
import typings.geojson.mod.GeoJsonProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type Arc = js.Array[Positions]
  
  type ArcIndexes = js.Array[Double]
  
  trait GeometryCollection[P /* <: Properties */]
    extends StObject
       with GeometryObjectA[P]
       with GeometryObject[P] {
    
    var geometries: js.Array[GeometryObject[P]]
    
    @JSName("type")
    var type_GeometryCollection: typings.topojsonSpecification.topojsonSpecificationStrings.GeometryCollection
  }
  object GeometryCollection {
    
    @scala.inline
    def apply[P /* <: Properties */](geometries: js.Array[GeometryObject[P]]): GeometryCollection[P] = {
      val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("GeometryCollection")
      __obj.asInstanceOf[GeometryCollection[P]]
    }
    
    @scala.inline
    implicit class GeometryCollectionMutableBuilder[Self <: GeometryCollection[?], P /* <: Properties */] (val x: Self & GeometryCollection[P]) extends AnyVal {
      
      @scala.inline
      def setGeometries(value: js.Array[GeometryObject[P]]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometriesVarargs(value: GeometryObject[P]*): Self = StObject.set(x, "geometries", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typings.topojsonSpecification.topojsonSpecificationStrings.GeometryCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.topojsonSpecification.mod.Point[P]
    - typings.topojsonSpecification.mod.MultiPoint[P]
    - typings.topojsonSpecification.mod.LineString[P]
    - typings.topojsonSpecification.mod.MultiLineString[P]
    - typings.topojsonSpecification.mod.Polygon[P]
    - typings.topojsonSpecification.mod.MultiPolygon[P]
    - typings.topojsonSpecification.mod.GeometryCollection[P]
    - typings.topojsonSpecification.mod.NullObject
  */
  trait GeometryObject[P /* <: Properties */] extends StObject
  object GeometryObject {
    
    @scala.inline
    def GeometryCollection[P /* <: Properties */](geometries: js.Array[GeometryObject[P]]): typings.topojsonSpecification.mod.GeometryCollection[P] = {
      val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("GeometryCollection")
      __obj.asInstanceOf[typings.topojsonSpecification.mod.GeometryCollection[P]]
    }
    
    @scala.inline
    def LineString[P /* <: Properties */](arcs: ArcIndexes): typings.topojsonSpecification.mod.LineString[P] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("LineString")
      __obj.asInstanceOf[typings.topojsonSpecification.mod.LineString[P]]
    }
    
    @scala.inline
    def MultiLineString[P /* <: Properties */](arcs: js.Array[ArcIndexes]): typings.topojsonSpecification.mod.MultiLineString[P] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiLineString")
      __obj.asInstanceOf[typings.topojsonSpecification.mod.MultiLineString[P]]
    }
    
    @scala.inline
    def MultiPoint[P /* <: Properties */](coordinates: js.Array[Positions]): typings.topojsonSpecification.mod.MultiPoint[P] = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiPoint")
      __obj.asInstanceOf[typings.topojsonSpecification.mod.MultiPoint[P]]
    }
    
    @scala.inline
    def MultiPolygon[P /* <: Properties */](arcs: js.Array[js.Array[ArcIndexes]]): typings.topojsonSpecification.mod.MultiPolygon[P] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiPolygon")
      __obj.asInstanceOf[typings.topojsonSpecification.mod.MultiPolygon[P]]
    }
    
    @scala.inline
    def NullObject(`type`: Null): typings.topojsonSpecification.mod.NullObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.topojsonSpecification.mod.NullObject]
    }
    
    @scala.inline
    def Point[P /* <: Properties */](coordinates: Positions): typings.topojsonSpecification.mod.Point[P] = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Point")
      __obj.asInstanceOf[typings.topojsonSpecification.mod.Point[P]]
    }
    
    @scala.inline
    def Polygon[P /* <: Properties */](arcs: js.Array[ArcIndexes]): typings.topojsonSpecification.mod.Polygon[P] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Polygon")
      __obj.asInstanceOf[typings.topojsonSpecification.mod.Polygon[P]]
    }
  }
  
  trait GeometryObjectA[P /* <: Properties */]
    extends StObject
       with TopoJSON {
    
    var id: js.UndefOr[Double | String] = js.undefined
    
    var properties: js.UndefOr[P] = js.undefined
    
    @JSName("type")
    var type_GeometryObjectA: GeoJsonGeometryTypes | Null
  }
  object GeometryObjectA {
    
    @scala.inline
    def apply[P /* <: Properties */](): GeometryObjectA[P] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(null)
      __obj.asInstanceOf[GeometryObjectA[P]]
    }
    
    @scala.inline
    implicit class GeometryObjectAMutableBuilder[Self <: GeometryObjectA[?], P /* <: Properties */] (val x: Self & GeometryObjectA[P]) extends AnyVal {
      
      @scala.inline
      def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setProperties(value: P): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setType(value: GeoJsonGeometryTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
    }
  }
  
  trait LineString[P /* <: Properties */]
    extends StObject
       with GeometryObjectA[P]
       with GeometryObject[P] {
    
    var arcs: ArcIndexes
    
    @JSName("type")
    var type_LineString: typings.topojsonSpecification.topojsonSpecificationStrings.LineString
  }
  object LineString {
    
    @scala.inline
    def apply[P /* <: Properties */](arcs: ArcIndexes): LineString[P] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("LineString")
      __obj.asInstanceOf[LineString[P]]
    }
    
    @scala.inline
    implicit class LineStringMutableBuilder[Self <: LineString[?], P /* <: Properties */] (val x: Self & LineString[P]) extends AnyVal {
      
      @scala.inline
      def setArcs(value: ArcIndexes): Self = StObject.set(x, "arcs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArcsVarargs(value: Double*): Self = StObject.set(x, "arcs", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typings.topojsonSpecification.topojsonSpecificationStrings.LineString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiLineString[P /* <: Properties */]
    extends StObject
       with GeometryObjectA[P]
       with GeometryObject[P] {
    
    var arcs: js.Array[ArcIndexes]
    
    @JSName("type")
    var type_MultiLineString: typings.topojsonSpecification.topojsonSpecificationStrings.MultiLineString
  }
  object MultiLineString {
    
    @scala.inline
    def apply[P /* <: Properties */](arcs: js.Array[ArcIndexes]): MultiLineString[P] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiLineString")
      __obj.asInstanceOf[MultiLineString[P]]
    }
    
    @scala.inline
    implicit class MultiLineStringMutableBuilder[Self <: MultiLineString[?], P /* <: Properties */] (val x: Self & MultiLineString[P]) extends AnyVal {
      
      @scala.inline
      def setArcs(value: js.Array[ArcIndexes]): Self = StObject.set(x, "arcs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArcsVarargs(value: ArcIndexes*): Self = StObject.set(x, "arcs", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typings.topojsonSpecification.topojsonSpecificationStrings.MultiLineString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiPoint[P /* <: Properties */]
    extends StObject
       with GeometryObjectA[P]
       with GeometryObject[P] {
    
    var coordinates: js.Array[Positions]
    
    @JSName("type")
    var type_MultiPoint: typings.topojsonSpecification.topojsonSpecificationStrings.MultiPoint
  }
  object MultiPoint {
    
    @scala.inline
    def apply[P /* <: Properties */](coordinates: js.Array[Positions]): MultiPoint[P] = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiPoint")
      __obj.asInstanceOf[MultiPoint[P]]
    }
    
    @scala.inline
    implicit class MultiPointMutableBuilder[Self <: MultiPoint[?], P /* <: Properties */] (val x: Self & MultiPoint[P]) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: js.Array[Positions]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinatesVarargs(value: Positions*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typings.topojsonSpecification.topojsonSpecificationStrings.MultiPoint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiPolygon[P /* <: Properties */]
    extends StObject
       with GeometryObjectA[P]
       with GeometryObject[P] {
    
    var arcs: js.Array[js.Array[ArcIndexes]]
    
    @JSName("type")
    var type_MultiPolygon: typings.topojsonSpecification.topojsonSpecificationStrings.MultiPolygon
  }
  object MultiPolygon {
    
    @scala.inline
    def apply[P /* <: Properties */](arcs: js.Array[js.Array[ArcIndexes]]): MultiPolygon[P] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiPolygon")
      __obj.asInstanceOf[MultiPolygon[P]]
    }
    
    @scala.inline
    implicit class MultiPolygonMutableBuilder[Self <: MultiPolygon[?], P /* <: Properties */] (val x: Self & MultiPolygon[P]) extends AnyVal {
      
      @scala.inline
      def setArcs(value: js.Array[js.Array[ArcIndexes]]): Self = StObject.set(x, "arcs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArcsVarargs(value: js.Array[ArcIndexes]*): Self = StObject.set(x, "arcs", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typings.topojsonSpecification.topojsonSpecificationStrings.MultiPolygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NullObject
    extends StObject
       with GeometryObjectA[js.Object]
       with GeometryObject[js.Any] {
    
    @JSName("type")
    var type_NullObject: Null
  }
  object NullObject {
    
    @scala.inline
    def apply(`type`: Null): NullObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NullObject]
    }
    
    @scala.inline
    implicit class NullObjectMutableBuilder[Self <: NullObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: Null): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Objects[P /* <: Properties */] = StringDictionary[GeometryObject[P]]
  
  type OrNull[T /* <: Objects[js.Object] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] | topojson-specification.topojson-specification.NullObject}
    */ typings.topojsonSpecification.topojsonSpecificationStrings.OrNull & TopLevel[T]
  
  trait Point[P /* <: Properties */]
    extends StObject
       with GeometryObjectA[P]
       with GeometryObject[P] {
    
    var coordinates: Positions
    
    @JSName("type")
    var type_Point: typings.topojsonSpecification.topojsonSpecificationStrings.Point
  }
  object Point {
    
    @scala.inline
    def apply[P /* <: Properties */](coordinates: Positions): Point[P] = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Point")
      __obj.asInstanceOf[Point[P]]
    }
    
    @scala.inline
    implicit class PointMutableBuilder[Self <: Point[?], P /* <: Properties */] (val x: Self & Point[P]) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: Positions): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typings.topojsonSpecification.topojsonSpecificationStrings.Point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Polygon[P /* <: Properties */]
    extends StObject
       with GeometryObjectA[P]
       with GeometryObject[P] {
    
    var arcs: js.Array[ArcIndexes]
    
    @JSName("type")
    var type_Polygon: typings.topojsonSpecification.topojsonSpecificationStrings.Polygon
  }
  object Polygon {
    
    @scala.inline
    def apply[P /* <: Properties */](arcs: js.Array[ArcIndexes]): Polygon[P] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Polygon")
      __obj.asInstanceOf[Polygon[P]]
    }
    
    @scala.inline
    implicit class PolygonMutableBuilder[Self <: Polygon[?], P /* <: Properties */] (val x: Self & Polygon[P]) extends AnyVal {
      
      @scala.inline
      def setArcs(value: js.Array[ArcIndexes]): Self = StObject.set(x, "arcs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArcsVarargs(value: ArcIndexes*): Self = StObject.set(x, "arcs", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typings.topojsonSpecification.topojsonSpecificationStrings.Polygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Positions = js.Array[Double]
  
  type Properties = GeoJsonProperties
  
  trait TopoJSON extends StObject {
    
    var bbox: js.UndefOr[BBox] = js.undefined
    
    var `type`: typings.topojsonSpecification.topojsonSpecificationStrings.Topology | GeoJsonGeometryTypes | Null
  }
  object TopoJSON {
    
    @scala.inline
    def apply(): TopoJSON = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(null)
      __obj.asInstanceOf[TopoJSON]
    }
    
    @scala.inline
    implicit class TopoJSONMutableBuilder[Self <: TopoJSON] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBbox(value: BBox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      @scala.inline
      def setType(value: typings.topojsonSpecification.topojsonSpecificationStrings.Topology | GeoJsonGeometryTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
    }
  }
  
  trait Topology[T /* <: Objects[Properties] */]
    extends StObject
       with TopoJSON {
    
    var arcs: js.Array[Arc]
    
    var objects: T
    
    var transform: js.UndefOr[Transform] = js.undefined
    
    @JSName("type")
    var type_Topology: typings.topojsonSpecification.topojsonSpecificationStrings.Topology
  }
  object Topology {
    
    @scala.inline
    def apply[T /* <: Objects[Properties] */](arcs: js.Array[Arc], objects: T): Topology[T] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Topology")
      __obj.asInstanceOf[Topology[T]]
    }
    
    @scala.inline
    implicit class TopologyMutableBuilder[Self <: Topology[?], T /* <: Objects[Properties] */] (val x: Self & Topology[T]) extends AnyVal {
      
      @scala.inline
      def setArcs(value: js.Array[Arc]): Self = StObject.set(x, "arcs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArcsVarargs(value: Arc*): Self = StObject.set(x, "arcs", js.Array(value :_*))
      
      @scala.inline
      def setObjects(value: T): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setType(value: typings.topojsonSpecification.topojsonSpecificationStrings.Topology): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Transform extends StObject {
    
    var scale: js.Tuple2[Double, Double]
    
    var translate: js.Tuple2[Double, Double]
  }
  object Transform {
    
    @scala.inline
    def apply(scale: js.Tuple2[Double, Double], translate: js.Tuple2[Double, Double]): Transform = {
      val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transform]
    }
    
    @scala.inline
    implicit class TransformMutableBuilder[Self <: Transform] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScale(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslate(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    }
  }
}
