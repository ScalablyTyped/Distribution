package typings.topojsonClient

import typings.geojson.mod.BBox
import typings.geojson.mod.Feature
import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeometryObject
import typings.topojsonSpecification.mod.GeometryCollection
import typings.topojsonSpecification.mod.LineString
import typings.topojsonSpecification.mod.MultiLineString
import typings.topojsonSpecification.mod.MultiPoint
import typings.topojsonSpecification.mod.MultiPolygon
import typings.topojsonSpecification.mod.Objects
import typings.topojsonSpecification.mod.Point
import typings.topojsonSpecification.mod.Polygon
import typings.topojsonSpecification.mod.Properties
import typings.topojsonSpecification.mod.Topology
import typings.topojsonSpecification.mod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("topojson-client", JSImport.Namespace)
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
  def quantize[T /* <: Objects[js.Object] */](topology: Topology[T], transform: Double): Topology[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("quantize")(topology.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Topology[T]]
  @scala.inline
  def quantize[T /* <: Objects[js.Object] */](topology: Topology[T], transform: Transform): Topology[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("quantize")(topology.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Topology[T]]
  
  @scala.inline
  def transform(): Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")().asInstanceOf[Transformer]
  @scala.inline
  def transform(transform: Transform): Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(transform.asInstanceOf[js.Any]).asInstanceOf[Transformer]
  
  @scala.inline
  def untransform(): Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("untransform")().asInstanceOf[Transformer]
  @scala.inline
  def untransform(transform: Transform): Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("untransform")(transform.asInstanceOf[js.Any]).asInstanceOf[Transformer]
  
  type Transformer = js.Function2[/* point */ js.Array[Double], /* index */ js.UndefOr[Boolean], js.Array[Double]]
}
