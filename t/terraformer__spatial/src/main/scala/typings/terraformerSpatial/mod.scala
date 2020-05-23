package typings.terraformerSpatial

import typings.geojson.mod.BBox
import typings.geojson.mod.Feature
import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJSON
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.geojson.mod.GeometryCollection
import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import typings.geojson.mod.MultiPoint
import typings.geojson.mod.MultiPolygon
import typings.geojson.mod.Point
import typings.geojson.mod.Polygon
import typings.geojson.mod.Position
import typings.terraformerSpatial.anon.H
import typings.terraformerSpatial.anon.Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@terraformer/spatial", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def calculateBounds(geojson: GeoJSON): BBox = js.native
  def calculateEnvelope(geojson: GeoJSON): H = js.native
  def contains(geojson: GeoJSON, comparisonGeojson: GeoJSON): Boolean = js.native
  def convexHull(geojson: GeoJSON): Polygon = js.native
  def intersects(geojson: GeoJSON, comparisonGeojson: GeoJSON): Boolean = js.native
  def isConvex(geojson: GeoJSON): Boolean = js.native
  def polygonContainsPoint(polygon: js.Array[js.Array[Position]], point: Position): Boolean = js.native
  def positionToGeographic(position: Position): Position = js.native
  def positionToMercator(position: Position): Position = js.native
  def toCircle(center: Position, radius: Double): Feature[Polygon, GeoJsonProperties] = js.native
  def toCircle(center: Position, radius: Double, interpolate: Double): Feature[Polygon, GeoJsonProperties] = js.native
  def toGeographic(geojson: Feature[Geometry, GeoJsonProperties]): Feature[Geometry, GeoJsonProperties] = js.native
  def toGeographic(geojson: FeatureCollection[Geometry, GeoJsonProperties]): FeatureCollection[Geometry, GeoJsonProperties] = js.native
  def toGeographic(geojson: GeometryCollection): GeometryCollection = js.native
  def toGeographic(geojson: LineString): LineString = js.native
  def toGeographic(geojson: MultiLineString): MultiLineString = js.native
  def toGeographic(geojson: MultiPoint): MultiPoint = js.native
  def toGeographic(geojson: MultiPolygon): MultiPolygon = js.native
  def toGeographic(geojson: Point): Point = js.native
  def toGeographic(geojson: Polygon): Polygon = js.native
  def toMercator(geojson: Feature[Geometry, GeoJsonProperties]): Feature[Geometry, GeoJsonProperties] = js.native
  def toMercator(geojson: FeatureCollection[Geometry, GeoJsonProperties]): FeatureCollection[Geometry, GeoJsonProperties] = js.native
  def toMercator(geojson: GeometryCollection): GeometryCollection = js.native
  def toMercator(geojson: LineString): LineString = js.native
  def toMercator(geojson: MultiLineString): MultiLineString = js.native
  def toMercator(geojson: MultiPoint): MultiPoint = js.native
  def toMercator(geojson: MultiPolygon): MultiPolygon = js.native
  def toMercator(geojson: Point): Point = js.native
  def toMercator(geojson: Polygon): Polygon = js.native
  def within(geojson: GeoJSON, comparisonGeojson: GeoJSON): Boolean = js.native
  @js.native
  object GeographicCRS extends js.Object {
    var properties: Href = js.native
    var `type`: String = js.native
  }
  
  @js.native
  object MercatorCRS extends js.Object {
    var properties: Href = js.native
    var `type`: String = js.native
  }
  
}

