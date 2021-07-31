package typings.topojson

import org.scalablytyped.runtime.StringDictionary
import typings.geojson.mod.BBox
import typings.geojson.mod.Feature
import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJsonObject
import typings.geojson.mod.GeometryObject
import typings.topojson.anon.Counties
import typings.topojson.anon.Countries
import typings.topojsonClient.mod.Transformer
import typings.topojsonSimplify.mod.Filter_
import typings.topojsonSimplify.mod.Ring
import typings.topojsonSimplify.mod.RingWeighter
import typings.topojsonSimplify.mod.Triangle
import typings.topojsonSimplify.mod.TriangleWeighter
import typings.topojsonSpecification.mod.Arc
import typings.topojsonSpecification.mod.GeometryCollection
import typings.topojsonSpecification.mod.LineString
import typings.topojsonSpecification.mod.MultiLineString
import typings.topojsonSpecification.mod.MultiPoint
import typings.topojsonSpecification.mod.MultiPolygon
import typings.topojsonSpecification.mod.Objects
import typings.topojsonSpecification.mod.OrNull
import typings.topojsonSpecification.mod.Point
import typings.topojsonSpecification.mod.Polygon
import typings.topojsonSpecification.mod.Properties
import typings.topojsonSpecification.mod.Topology
import typings.topojsonSpecification.mod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("topojson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def bbox(topology: Topology[Objects[Properties]]): BBox = ^.asInstanceOf[js.Dynamic].applyDynamic("bbox")(topology.asInstanceOf[js.Any]).asInstanceOf[BBox]
  
  @scala.inline
  def feature[P](topology: Topology[Objects[Properties]], `object`: GeometryCollection[P]): FeatureCollection[GeometryObject, P] = (^.asInstanceOf[js.Dynamic].applyDynamic("feature")(topology.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[FeatureCollection[GeometryObject, P]]
  @scala.inline
  def feature[P](
    topology: Topology[Objects[Properties]],
    `object`: typings.topojsonSpecification.mod.GeometryObject[P]
  ): (Feature[GeometryObject, P]) | (FeatureCollection[GeometryObject, P]) = (^.asInstanceOf[js.Dynamic].applyDynamic("feature")(topology.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[(Feature[GeometryObject, P]) | (FeatureCollection[GeometryObject, P])]
  @scala.inline
  def feature[P](topology: Topology[Objects[Properties]], `object`: LineString[P]): Feature[typings.geojson.mod.LineString, P] = (^.asInstanceOf[js.Dynamic].applyDynamic("feature")(topology.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Feature[typings.geojson.mod.LineString, P]]
  @scala.inline
  def feature[P](topology: Topology[Objects[Properties]], `object`: MultiLineString[P]): Feature[typings.geojson.mod.MultiLineString, P] = (^.asInstanceOf[js.Dynamic].applyDynamic("feature")(topology.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Feature[typings.geojson.mod.MultiLineString, P]]
  @scala.inline
  def feature[P](topology: Topology[Objects[Properties]], `object`: MultiPoint[P]): Feature[typings.geojson.mod.MultiPoint, P] = (^.asInstanceOf[js.Dynamic].applyDynamic("feature")(topology.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Feature[typings.geojson.mod.MultiPoint, P]]
  @scala.inline
  def feature[P](topology: Topology[Objects[Properties]], `object`: MultiPolygon[P]): Feature[typings.geojson.mod.MultiPolygon, P] = (^.asInstanceOf[js.Dynamic].applyDynamic("feature")(topology.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Feature[typings.geojson.mod.MultiPolygon, P]]
  @scala.inline
  def feature[P](topology: Topology[Objects[Properties]], `object`: Point[P]): Feature[typings.geojson.mod.Point, P] = (^.asInstanceOf[js.Dynamic].applyDynamic("feature")(topology.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Feature[typings.geojson.mod.Point, P]]
  @scala.inline
  def feature[P](topology: Topology[Objects[Properties]], `object`: Polygon[P]): Feature[typings.geojson.mod.Polygon, P] = (^.asInstanceOf[js.Dynamic].applyDynamic("feature")(topology.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Feature[typings.geojson.mod.Polygon, P]]
  
  @scala.inline
  def filter[K /* <: Objects[js.Object] */](topology: Topology[K], filter: Filter_): Topology[OrNull[K]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(topology.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Topology[OrNull[K]]]
  
  @scala.inline
  def filterAttached(topology: Topology[Objects[Properties]]): Filter_ = ^.asInstanceOf[js.Dynamic].applyDynamic("filterAttached")(topology.asInstanceOf[js.Any]).asInstanceOf[Filter_]
  
  @scala.inline
  def filterAttachedWeight(topology: Topology[Objects[Properties]]): Filter_ = ^.asInstanceOf[js.Dynamic].applyDynamic("filterAttachedWeight")(topology.asInstanceOf[js.Any]).asInstanceOf[Filter_]
  @scala.inline
  def filterAttachedWeight(topology: Topology[Objects[Properties]], minWeight: Double): Filter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("filterAttachedWeight")(topology.asInstanceOf[js.Any], minWeight.asInstanceOf[js.Any])).asInstanceOf[Filter_]
  @scala.inline
  def filterAttachedWeight(topology: Topology[Objects[Properties]], minWeight: Double, weight: RingWeighter): Filter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("filterAttachedWeight")(topology.asInstanceOf[js.Any], minWeight.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[Filter_]
  @scala.inline
  def filterAttachedWeight(topology: Topology[Objects[Properties]], minWeight: Unit, weight: RingWeighter): Filter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("filterAttachedWeight")(topology.asInstanceOf[js.Any], minWeight.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[Filter_]
  
  @scala.inline
  def filterWeight(topology: Topology[Objects[Properties]]): Filter_ = ^.asInstanceOf[js.Dynamic].applyDynamic("filterWeight")(topology.asInstanceOf[js.Any]).asInstanceOf[Filter_]
  @scala.inline
  def filterWeight(topology: Topology[Objects[Properties]], minWeight: Double): Filter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("filterWeight")(topology.asInstanceOf[js.Any], minWeight.asInstanceOf[js.Any])).asInstanceOf[Filter_]
  @scala.inline
  def filterWeight(topology: Topology[Objects[Properties]], minWeight: Double, weight: RingWeighter): Filter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("filterWeight")(topology.asInstanceOf[js.Any], minWeight.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[Filter_]
  @scala.inline
  def filterWeight(topology: Topology[Objects[Properties]], minWeight: Unit, weight: RingWeighter): Filter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("filterWeight")(topology.asInstanceOf[js.Any], minWeight.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[Filter_]
  
  @scala.inline
  def merge(
    topology: Topology[Objects[Properties]],
    objects: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]
  ): typings.geojson.mod.MultiPolygon = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(topology.asInstanceOf[js.Any], objects.asInstanceOf[js.Any])).asInstanceOf[typings.geojson.mod.MultiPolygon]
  
  @scala.inline
  def mergeArcs(
    topology: Topology[Objects[Properties]],
    objects: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]
  ): MultiPolygon[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeArcs")(topology.asInstanceOf[js.Any], objects.asInstanceOf[js.Any])).asInstanceOf[MultiPolygon[js.Object]]
  
  @scala.inline
  def mesh(topology: Topology[Objects[Properties]]): typings.geojson.mod.MultiLineString = ^.asInstanceOf[js.Dynamic].applyDynamic("mesh")(topology.asInstanceOf[js.Any]).asInstanceOf[typings.geojson.mod.MultiLineString]
  @scala.inline
  def mesh(
    topology: Topology[Objects[Properties]],
    obj: Unit,
    filter: js.Function2[
      /* a */ typings.topojsonSpecification.mod.GeometryObject[js.Object], 
      /* b */ typings.topojsonSpecification.mod.GeometryObject[js.Object], 
      Boolean
    ]
  ): typings.geojson.mod.MultiLineString = (^.asInstanceOf[js.Dynamic].applyDynamic("mesh")(topology.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[typings.geojson.mod.MultiLineString]
  @scala.inline
  def mesh(
    topology: Topology[Objects[Properties]],
    obj: typings.topojsonSpecification.mod.GeometryObject[js.Object]
  ): typings.geojson.mod.MultiLineString = (^.asInstanceOf[js.Dynamic].applyDynamic("mesh")(topology.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[typings.geojson.mod.MultiLineString]
  @scala.inline
  def mesh(
    topology: Topology[Objects[Properties]],
    obj: typings.topojsonSpecification.mod.GeometryObject[js.Object],
    filter: js.Function2[
      /* a */ typings.topojsonSpecification.mod.GeometryObject[js.Object], 
      /* b */ typings.topojsonSpecification.mod.GeometryObject[js.Object], 
      Boolean
    ]
  ): typings.geojson.mod.MultiLineString = (^.asInstanceOf[js.Dynamic].applyDynamic("mesh")(topology.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[typings.geojson.mod.MultiLineString]
  
  @scala.inline
  def meshArcs(topology: Topology[Objects[Properties]]): MultiLineString[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("meshArcs")(topology.asInstanceOf[js.Any]).asInstanceOf[MultiLineString[js.Object]]
  @scala.inline
  def meshArcs(
    topology: Topology[Objects[Properties]],
    obj: Unit,
    filter: js.Function2[
      /* a */ typings.topojsonSpecification.mod.GeometryObject[js.Object], 
      /* b */ typings.topojsonSpecification.mod.GeometryObject[js.Object], 
      Boolean
    ]
  ): MultiLineString[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("meshArcs")(topology.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[MultiLineString[js.Object]]
  @scala.inline
  def meshArcs(
    topology: Topology[Objects[Properties]],
    obj: typings.topojsonSpecification.mod.GeometryObject[js.Object]
  ): MultiLineString[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("meshArcs")(topology.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[MultiLineString[js.Object]]
  @scala.inline
  def meshArcs(
    topology: Topology[Objects[Properties]],
    obj: typings.topojsonSpecification.mod.GeometryObject[js.Object],
    filter: js.Function2[
      /* a */ typings.topojsonSpecification.mod.GeometryObject[js.Object], 
      /* b */ typings.topojsonSpecification.mod.GeometryObject[js.Object], 
      Boolean
    ]
  ): MultiLineString[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("meshArcs")(topology.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[MultiLineString[js.Object]]
  
  @scala.inline
  def neighbors(objects: js.Array[typings.topojsonSpecification.mod.GeometryObject[js.Object]]): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("neighbors")(objects.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Double]]]
  
  @scala.inline
  def planarRingArea(ring: Ring): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("planarRingArea")(ring.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def planarTriangleArea(triangle: Triangle): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("planarTriangleArea")(triangle.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def presimplify[T /* <: Objects[js.Object] */](topology: Topology[T]): Topology[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("presimplify")(topology.asInstanceOf[js.Any]).asInstanceOf[Topology[T]]
  @scala.inline
  def presimplify[T /* <: Objects[js.Object] */](topology: Topology[T], weight: TriangleWeighter): Topology[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("presimplify")(topology.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[Topology[T]]
  
  @scala.inline
  def quantile(topology: Topology[Objects[Properties]], p: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("quantile")(topology.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def quantize[T /* <: Objects[js.Object] */](topology: Topology[T], transform: Double): Topology[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("quantize")(topology.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Topology[T]]
  @scala.inline
  def quantize[T /* <: Objects[js.Object] */](topology: Topology[T], transform: Transform): Topology[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("quantize")(topology.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Topology[T]]
  
  @scala.inline
  def simplify[T /* <: Objects[js.Object] */](topology: Topology[T]): Topology[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("simplify")(topology.asInstanceOf[js.Any]).asInstanceOf[Topology[T]]
  @scala.inline
  def simplify[T /* <: Objects[js.Object] */](topology: Topology[T], minWeight: Double): Topology[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("simplify")(topology.asInstanceOf[js.Any], minWeight.asInstanceOf[js.Any])).asInstanceOf[Topology[T]]
  
  @scala.inline
  def sphericalRingArea(ring: Ring, interior: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sphericalRingArea")(ring.asInstanceOf[js.Any], interior.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def sphericalTriangleArea(triangle: Triangle): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sphericalTriangleArea")(triangle.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def topology(objects: StringDictionary[GeoJsonObject]): Topology[Objects[Properties]] = ^.asInstanceOf[js.Dynamic].applyDynamic("topology")(objects.asInstanceOf[js.Any]).asInstanceOf[Topology[Objects[Properties]]]
  @scala.inline
  def topology(objects: StringDictionary[GeoJsonObject], quantization: Double): Topology[Objects[Properties]] = (^.asInstanceOf[js.Dynamic].applyDynamic("topology")(objects.asInstanceOf[js.Any], quantization.asInstanceOf[js.Any])).asInstanceOf[Topology[Objects[Properties]]]
  
  @scala.inline
  def transform(): Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")().asInstanceOf[Transformer]
  @scala.inline
  def transform(transform: Transform): Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(transform.asInstanceOf[js.Any]).asInstanceOf[Transformer]
  
  @scala.inline
  def untransform(): Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("untransform")().asInstanceOf[Transformer]
  @scala.inline
  def untransform(transform: Transform): Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("untransform")(transform.asInstanceOf[js.Any]).asInstanceOf[Transformer]
  
  trait UsAtlas
    extends StObject
       with Topology[Objects[Properties]] {
    
    @JSName("bbox")
    var bbox_UsAtlas: js.Tuple4[Double, Double, Double, Double]
    
    @JSName("objects")
    var objects_UsAtlas: Counties
    
    @JSName("transform")
    var transform_UsAtlas: Transform
  }
  object UsAtlas {
    
    @scala.inline
    def apply(
      arcs: js.Array[Arc],
      bbox: js.Tuple4[Double, Double, Double, Double],
      objects: Counties,
      transform: Transform
    ): UsAtlas = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Topology")
      __obj.asInstanceOf[UsAtlas]
    }
    
    @scala.inline
    implicit class UsAtlasMutableBuilder[Self <: UsAtlas] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBbox(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjects(value: Counties): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorldAtlas
    extends StObject
       with Topology[Objects[Properties]] {
    
    @JSName("bbox")
    var bbox_WorldAtlas: js.Tuple4[Double, Double, Double, Double]
    
    @JSName("objects")
    var objects_WorldAtlas: Countries
    
    @JSName("transform")
    var transform_WorldAtlas: Transform
  }
  object WorldAtlas {
    
    @scala.inline
    def apply(
      arcs: js.Array[Arc],
      bbox: js.Tuple4[Double, Double, Double, Double],
      objects: Countries,
      transform: Transform
    ): WorldAtlas = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Topology")
      __obj.asInstanceOf[WorldAtlas]
    }
    
    @scala.inline
    implicit class WorldAtlasMutableBuilder[Self <: WorldAtlas] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBbox(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjects(value: Countries): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
}
