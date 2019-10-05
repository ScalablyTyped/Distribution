package typings.topojson.topojsonMod

import typings.geojson.geojsonMod.Feature
import typings.geojson.geojsonMod.FeatureCollection
import typings.geojson.geojsonMod.GeometryObject
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryCollection
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.LineString
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.MultiLineString
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.MultiPoint
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.MultiPolygon
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Objects
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Point
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Polygon
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Properties
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "feature")
@js.native
object feature extends js.Object {
  def apply[P](topology: Topology[Objects[Properties]], `object`: GeometryCollection[P]): FeatureCollection[GeometryObject, P] = js.native
  def apply[P](
    topology: Topology[Objects[Properties]],
    `object`: typings.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject[P]
  ): (Feature[GeometryObject, P]) | (FeatureCollection[GeometryObject, P]) = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: LineString[P]): Feature[typings.geojson.geojsonMod.LineString, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: MultiLineString[P]): Feature[typings.geojson.geojsonMod.MultiLineString, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: MultiPoint[P]): Feature[typings.geojson.geojsonMod.MultiPoint, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: MultiPolygon[P]): Feature[typings.geojson.geojsonMod.MultiPolygon, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: Point[P]): Feature[typings.geojson.geojsonMod.Point, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: Polygon[P]): Feature[typings.geojson.geojsonMod.Polygon, P] = js.native
}

