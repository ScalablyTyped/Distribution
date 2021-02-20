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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("topojson", "bbox")
  @js.native
  def bbox(topology: Topology[Objects[Properties]]): BBox = js.native
  
  @JSImport("topojson", "feature")
  @js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: GeometryCollection[P]): FeatureCollection[GeometryObject, P] = js.native
  @JSImport("topojson", "feature")
  @js.native
  def feature[P](
    topology: Topology[Objects[Properties]],
    `object`: typings.topojsonSpecification.mod.GeometryObject[P]
  ): (Feature[GeometryObject, P]) | (FeatureCollection[GeometryObject, P]) = js.native
  @JSImport("topojson", "feature")
  @js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: LineString[P]): Feature[typings.geojson.mod.LineString, P] = js.native
  @JSImport("topojson", "feature")
  @js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: MultiLineString[P]): Feature[typings.geojson.mod.MultiLineString, P] = js.native
  @JSImport("topojson", "feature")
  @js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: MultiPoint[P]): Feature[typings.geojson.mod.MultiPoint, P] = js.native
  @JSImport("topojson", "feature")
  @js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: MultiPolygon[P]): Feature[typings.geojson.mod.MultiPolygon, P] = js.native
  @JSImport("topojson", "feature")
  @js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: Point[P]): Feature[typings.geojson.mod.Point, P] = js.native
  @JSImport("topojson", "feature")
  @js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: Polygon[P]): Feature[typings.geojson.mod.Polygon, P] = js.native
  
  @JSImport("topojson", "filter")
  @js.native
  def filter[K /* <: Objects[js.Object] */](topology: Topology[K], filter: Filter_): Topology[OrNull[K]] = js.native
  
  @JSImport("topojson", "filterAttached")
  @js.native
  def filterAttached(topology: Topology[Objects[Properties]]): Filter_ = js.native
  
  @JSImport("topojson", "filterAttachedWeight")
  @js.native
  def filterAttachedWeight(topology: Topology[Objects[Properties]]): Filter_ = js.native
  @JSImport("topojson", "filterAttachedWeight")
  @js.native
  def filterAttachedWeight(
    topology: Topology[Objects[Properties]],
    minWeight: js.UndefOr[scala.Nothing],
    weight: RingWeighter
  ): Filter_ = js.native
  @JSImport("topojson", "filterAttachedWeight")
  @js.native
  def filterAttachedWeight(topology: Topology[Objects[Properties]], minWeight: Double): Filter_ = js.native
  @JSImport("topojson", "filterAttachedWeight")
  @js.native
  def filterAttachedWeight(topology: Topology[Objects[Properties]], minWeight: Double, weight: RingWeighter): Filter_ = js.native
  
  @JSImport("topojson", "filterWeight")
  @js.native
  def filterWeight(topology: Topology[Objects[Properties]]): Filter_ = js.native
  @JSImport("topojson", "filterWeight")
  @js.native
  def filterWeight(
    topology: Topology[Objects[Properties]],
    minWeight: js.UndefOr[scala.Nothing],
    weight: RingWeighter
  ): Filter_ = js.native
  @JSImport("topojson", "filterWeight")
  @js.native
  def filterWeight(topology: Topology[Objects[Properties]], minWeight: Double): Filter_ = js.native
  @JSImport("topojson", "filterWeight")
  @js.native
  def filterWeight(topology: Topology[Objects[Properties]], minWeight: Double, weight: RingWeighter): Filter_ = js.native
  
  @JSImport("topojson", "merge")
  @js.native
  def merge(
    topology: Topology[Objects[Properties]],
    objects: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]
  ): typings.geojson.mod.MultiPolygon = js.native
  
  @JSImport("topojson", "mergeArcs")
  @js.native
  def mergeArcs(
    topology: Topology[Objects[Properties]],
    objects: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]
  ): MultiPolygon[js.Object] = js.native
  
  @JSImport("topojson", "mesh")
  @js.native
  def mesh(topology: Topology[Objects[Properties]]): typings.geojson.mod.MultiLineString = js.native
  @JSImport("topojson", "mesh")
  @js.native
  def mesh(
    topology: Topology[Objects[Properties]],
    obj: js.UndefOr[scala.Nothing],
    filter: js.Function2[
      /* a */ typings.topojsonSpecification.mod.GeometryObject[js.Object], 
      /* b */ typings.topojsonSpecification.mod.GeometryObject[js.Object], 
      Boolean
    ]
  ): typings.geojson.mod.MultiLineString = js.native
  @JSImport("topojson", "mesh")
  @js.native
  def mesh(
    topology: Topology[Objects[Properties]],
    obj: typings.topojsonSpecification.mod.GeometryObject[js.Object]
  ): typings.geojson.mod.MultiLineString = js.native
  @JSImport("topojson", "mesh")
  @js.native
  def mesh(
    topology: Topology[Objects[Properties]],
    obj: typings.topojsonSpecification.mod.GeometryObject[js.Object],
    filter: js.Function2[
      /* a */ typings.topojsonSpecification.mod.GeometryObject[js.Object], 
      /* b */ typings.topojsonSpecification.mod.GeometryObject[js.Object], 
      Boolean
    ]
  ): typings.geojson.mod.MultiLineString = js.native
  
  @JSImport("topojson", "meshArcs")
  @js.native
  def meshArcs(topology: Topology[Objects[Properties]]): MultiLineString[js.Object] = js.native
  @JSImport("topojson", "meshArcs")
  @js.native
  def meshArcs(
    topology: Topology[Objects[Properties]],
    obj: js.UndefOr[scala.Nothing],
    filter: js.Function2[
      /* a */ typings.topojsonSpecification.mod.GeometryObject[js.Object], 
      /* b */ typings.topojsonSpecification.mod.GeometryObject[js.Object], 
      Boolean
    ]
  ): MultiLineString[js.Object] = js.native
  @JSImport("topojson", "meshArcs")
  @js.native
  def meshArcs(
    topology: Topology[Objects[Properties]],
    obj: typings.topojsonSpecification.mod.GeometryObject[js.Object]
  ): MultiLineString[js.Object] = js.native
  @JSImport("topojson", "meshArcs")
  @js.native
  def meshArcs(
    topology: Topology[Objects[Properties]],
    obj: typings.topojsonSpecification.mod.GeometryObject[js.Object],
    filter: js.Function2[
      /* a */ typings.topojsonSpecification.mod.GeometryObject[js.Object], 
      /* b */ typings.topojsonSpecification.mod.GeometryObject[js.Object], 
      Boolean
    ]
  ): MultiLineString[js.Object] = js.native
  
  @JSImport("topojson", "neighbors")
  @js.native
  def neighbors(objects: js.Array[typings.topojsonSpecification.mod.GeometryObject[js.Object]]): js.Array[js.Array[Double]] = js.native
  
  @JSImport("topojson", "planarRingArea")
  @js.native
  def planarRingArea(ring: Ring): Double = js.native
  
  @JSImport("topojson", "planarTriangleArea")
  @js.native
  def planarTriangleArea(triangle: Triangle): Double = js.native
  
  @JSImport("topojson", "presimplify")
  @js.native
  def presimplify[T /* <: Objects[js.Object] */](topology: Topology[T]): Topology[T] = js.native
  @JSImport("topojson", "presimplify")
  @js.native
  def presimplify[T /* <: Objects[js.Object] */](topology: Topology[T], weight: TriangleWeighter): Topology[T] = js.native
  
  @JSImport("topojson", "quantile")
  @js.native
  def quantile(topology: Topology[Objects[Properties]], p: Double): Double = js.native
  
  @JSImport("topojson", "quantize")
  @js.native
  def quantize[T /* <: Objects[js.Object] */](topology: Topology[T], transform: Double): Topology[T] = js.native
  @JSImport("topojson", "quantize")
  @js.native
  def quantize[T /* <: Objects[js.Object] */](topology: Topology[T], transform: Transform): Topology[T] = js.native
  
  @JSImport("topojson", "simplify")
  @js.native
  def simplify[T /* <: Objects[js.Object] */](topology: Topology[T]): Topology[T] = js.native
  @JSImport("topojson", "simplify")
  @js.native
  def simplify[T /* <: Objects[js.Object] */](topology: Topology[T], minWeight: Double): Topology[T] = js.native
  
  @JSImport("topojson", "sphericalRingArea")
  @js.native
  def sphericalRingArea(ring: Ring, interior: Boolean): Double = js.native
  
  @JSImport("topojson", "sphericalTriangleArea")
  @js.native
  def sphericalTriangleArea(triangle: Triangle): Double = js.native
  
  @JSImport("topojson", "topology")
  @js.native
  def topology(objects: StringDictionary[GeoJsonObject]): Topology[Objects[Properties]] = js.native
  @JSImport("topojson", "topology")
  @js.native
  def topology(objects: StringDictionary[GeoJsonObject], quantization: Double): Topology[Objects[Properties]] = js.native
  
  @JSImport("topojson", "transform")
  @js.native
  def transform(): Transformer = js.native
  @JSImport("topojson", "transform")
  @js.native
  def transform(transform: Transform): Transformer = js.native
  
  @JSImport("topojson", "untransform")
  @js.native
  def untransform(): Transformer = js.native
  @JSImport("topojson", "untransform")
  @js.native
  def untransform(transform: Transform): Transformer = js.native
  
  @js.native
  trait UsAtlas extends Topology[Objects[Properties]] {
    
    @JSName("bbox")
    var bbox_UsAtlas: js.Tuple4[Double, Double, Double, Double] = js.native
    
    @JSName("objects")
    var objects_UsAtlas: Counties = js.native
    
    @JSName("transform")
    var transform_UsAtlas: Transform = js.native
  }
  object UsAtlas {
    
    @scala.inline
    def apply(
      arcs: js.Array[Arc],
      bbox: js.Tuple4[Double, Double, Double, Double],
      objects: Counties,
      transform: Transform,
      `type`: typings.topojsonSpecification.topojsonSpecificationStrings.Topology
    ): UsAtlas = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
  
  @js.native
  trait WorldAtlas extends Topology[Objects[Properties]] {
    
    @JSName("bbox")
    var bbox_WorldAtlas: js.Tuple4[Double, Double, Double, Double] = js.native
    
    @JSName("objects")
    var objects_WorldAtlas: Countries = js.native
    
    @JSName("transform")
    var transform_WorldAtlas: Transform = js.native
  }
  object WorldAtlas {
    
    @scala.inline
    def apply(
      arcs: js.Array[Arc],
      bbox: js.Tuple4[Double, Double, Double, Double],
      objects: Countries,
      transform: Transform,
      `type`: typings.topojsonSpecification.topojsonSpecificationStrings.Topology
    ): WorldAtlas = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
