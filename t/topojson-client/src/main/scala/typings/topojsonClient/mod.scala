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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("topojson-client", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def bbox(topology: Topology[Objects[Properties]]): BBox = js.native
  
  def feature[P](topology: Topology[Objects[Properties]], `object`: GeometryCollection[P]): FeatureCollection[GeometryObject, P] = js.native
  def feature[P](
    topology: Topology[Objects[Properties]],
    `object`: typings.topojsonSpecification.mod.GeometryObject[P]
  ): (Feature[GeometryObject, P]) | (FeatureCollection[GeometryObject, P]) = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: LineString[P]): Feature[typings.geojson.mod.LineString, P] = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: MultiLineString[P]): Feature[typings.geojson.mod.MultiLineString, P] = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: MultiPoint[P]): Feature[typings.geojson.mod.MultiPoint, P] = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: MultiPolygon[P]): Feature[typings.geojson.mod.MultiPolygon, P] = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: Point[P]): Feature[typings.geojson.mod.Point, P] = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: Polygon[P]): Feature[typings.geojson.mod.Polygon, P] = js.native
  
  def merge(
    topology: Topology[Objects[Properties]],
    objects: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]
  ): typings.geojson.mod.MultiPolygon = js.native
  
  def mergeArcs(
    topology: Topology[Objects[Properties]],
    objects: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]
  ): MultiPolygon[js.Object] = js.native
  
  def mesh(topology: Topology[Objects[Properties]]): typings.geojson.mod.MultiLineString = js.native
  def mesh(
    topology: Topology[Objects[Properties]],
    obj: js.UndefOr[scala.Nothing],
    filter: js.Function2[
      /* a */ typings.topojsonSpecification.mod.GeometryObject[js.Object], 
      /* b */ typings.topojsonSpecification.mod.GeometryObject[js.Object], 
      Boolean
    ]
  ): typings.geojson.mod.MultiLineString = js.native
  def mesh(
    topology: Topology[Objects[Properties]],
    obj: typings.topojsonSpecification.mod.GeometryObject[js.Object]
  ): typings.geojson.mod.MultiLineString = js.native
  def mesh(
    topology: Topology[Objects[Properties]],
    obj: typings.topojsonSpecification.mod.GeometryObject[js.Object],
    filter: js.Function2[
      /* a */ typings.topojsonSpecification.mod.GeometryObject[js.Object], 
      /* b */ typings.topojsonSpecification.mod.GeometryObject[js.Object], 
      Boolean
    ]
  ): typings.geojson.mod.MultiLineString = js.native
  
  def meshArcs(topology: Topology[Objects[Properties]]): MultiLineString[js.Object] = js.native
  def meshArcs(
    topology: Topology[Objects[Properties]],
    obj: js.UndefOr[scala.Nothing],
    filter: js.Function2[
      /* a */ typings.topojsonSpecification.mod.GeometryObject[js.Object], 
      /* b */ typings.topojsonSpecification.mod.GeometryObject[js.Object], 
      Boolean
    ]
  ): MultiLineString[js.Object] = js.native
  def meshArcs(
    topology: Topology[Objects[Properties]],
    obj: typings.topojsonSpecification.mod.GeometryObject[js.Object]
  ): MultiLineString[js.Object] = js.native
  def meshArcs(
    topology: Topology[Objects[Properties]],
    obj: typings.topojsonSpecification.mod.GeometryObject[js.Object],
    filter: js.Function2[
      /* a */ typings.topojsonSpecification.mod.GeometryObject[js.Object], 
      /* b */ typings.topojsonSpecification.mod.GeometryObject[js.Object], 
      Boolean
    ]
  ): MultiLineString[js.Object] = js.native
  
  def neighbors(objects: js.Array[typings.topojsonSpecification.mod.GeometryObject[js.Object]]): js.Array[js.Array[Double]] = js.native
  
  def quantize[T /* <: Objects[js.Object] */](topology: Topology[T], transform: Double): Topology[T] = js.native
  def quantize[T /* <: Objects[js.Object] */](topology: Topology[T], transform: Transform): Topology[T] = js.native
  
  def transform(): Transformer = js.native
  def transform(transform: Transform): Transformer = js.native
  
  def untransform(): Transformer = js.native
  def untransform(transform: Transform): Transformer = js.native
  
  type Transformer = js.Function2[/* point */ js.Array[Double], /* index */ js.UndefOr[Boolean], js.Array[Double]]
}
