package typings.topojson.mod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("topojson", "feature")
@js.native
object feature extends js.Object {
  
  def apply[P](topology: Topology[Objects[Properties]], `object`: GeometryCollection[P]): FeatureCollection[GeometryObject, P] = js.native
  def apply[P](
    topology: Topology[Objects[Properties]],
    `object`: typings.topojsonSpecification.mod.GeometryObject[P]
  ): (Feature[GeometryObject, P]) | (FeatureCollection[GeometryObject, P]) = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: LineString[P]): Feature[typings.geojson.mod.LineString, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: MultiLineString[P]): Feature[typings.geojson.mod.MultiLineString, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: MultiPoint[P]): Feature[typings.geojson.mod.MultiPoint, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: MultiPolygon[P]): Feature[typings.geojson.mod.MultiPolygon, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: Point[P]): Feature[typings.geojson.mod.Point, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: Polygon[P]): Feature[typings.geojson.mod.Polygon, P] = js.native
}
