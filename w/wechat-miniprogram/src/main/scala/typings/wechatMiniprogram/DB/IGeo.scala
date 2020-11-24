package typings.wechatMiniprogram.DB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeo extends js.Object {
  
  def LineString(points: js.Array[GeoPoint]): GeoLineString = js.native
  def LineString(points: IGeoJSONLineString): GeoLineString = js.native
  @JSName("LineString")
  var LineString_Original: IGeoLineStringConstructor = js.native
  
  def MultiLineString(lineStrings: js.Array[GeoLineString]): GeoMultiLineString = js.native
  def MultiLineString(lineStrings: IGeoJSONMultiLineString): GeoMultiLineString = js.native
  @JSName("MultiLineString")
  var MultiLineString_Original: IGeoMultiLineStringConstructor = js.native
  
  def MultiPoint(points: js.Array[GeoPoint]): GeoMultiPoint = js.native
  def MultiPoint(points: IGeoJSONMultiPoint): GeoMultiPoint = js.native
  @JSName("MultiPoint")
  var MultiPoint_Original: IGeoMultiPointConstructor = js.native
  
  def MultiPolygon(polygons: js.Array[GeoPolygon]): GeoMultiPolygon = js.native
  def MultiPolygon(polygons: IGeoJSONMultiPolygon): GeoMultiPolygon = js.native
  @JSName("MultiPolygon")
  var MultiPolygon_Original: IGeoMultiPolygonConstructor = js.native
  
  def Point(geojson: IGeoJSONPoint): GeoPoint = js.native
  def Point(longitude: Double, latitide: Double): GeoPoint = js.native
  @JSName("Point")
  var Point_Original: IGeoPointConstructor = js.native
  
  def Polygon(lineStrings: js.Array[GeoLineString]): GeoPolygon = js.native
  def Polygon(lineStrings: IGeoJSONPolygon): GeoPolygon = js.native
  @JSName("Polygon")
  var Polygon_Original: IGeoPolygonConstructor = js.native
}
