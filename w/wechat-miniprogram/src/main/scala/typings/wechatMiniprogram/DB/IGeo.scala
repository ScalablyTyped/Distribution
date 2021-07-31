package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeo extends StObject {
  
  def LineString(points: js.Array[GeoPoint]): GeoLineString
  def LineString(points: IGeoJSONLineString): GeoLineString
  @JSName("LineString")
  var LineString_Original: IGeoLineStringConstructor
  
  def MultiLineString(lineStrings: js.Array[GeoLineString]): GeoMultiLineString
  def MultiLineString(lineStrings: IGeoJSONMultiLineString): GeoMultiLineString
  @JSName("MultiLineString")
  var MultiLineString_Original: IGeoMultiLineStringConstructor
  
  def MultiPoint(points: js.Array[GeoPoint]): GeoMultiPoint
  def MultiPoint(points: IGeoJSONMultiPoint): GeoMultiPoint
  @JSName("MultiPoint")
  var MultiPoint_Original: IGeoMultiPointConstructor
  
  def MultiPolygon(polygons: js.Array[GeoPolygon]): GeoMultiPolygon
  def MultiPolygon(polygons: IGeoJSONMultiPolygon): GeoMultiPolygon
  @JSName("MultiPolygon")
  var MultiPolygon_Original: IGeoMultiPolygonConstructor
  
  def Point(geojson: IGeoJSONPoint): GeoPoint
  def Point(longitude: Double, latitide: Double): GeoPoint
  @JSName("Point")
  var Point_Original: IGeoPointConstructor
  
  def Polygon(lineStrings: js.Array[GeoLineString]): GeoPolygon
  def Polygon(lineStrings: IGeoJSONPolygon): GeoPolygon
  @JSName("Polygon")
  var Polygon_Original: IGeoPolygonConstructor
}
object IGeo {
  
  @scala.inline
  def apply(
    LineString: IGeoLineStringConstructor,
    MultiLineString: IGeoMultiLineStringConstructor,
    MultiPoint: IGeoMultiPointConstructor,
    MultiPolygon: IGeoMultiPolygonConstructor,
    Point: IGeoPointConstructor,
    Polygon: IGeoPolygonConstructor
  ): IGeo = {
    val __obj = js.Dynamic.literal(LineString = LineString.asInstanceOf[js.Any], MultiLineString = MultiLineString.asInstanceOf[js.Any], MultiPoint = MultiPoint.asInstanceOf[js.Any], MultiPolygon = MultiPolygon.asInstanceOf[js.Any], Point = Point.asInstanceOf[js.Any], Polygon = Polygon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeo]
  }
  
  @scala.inline
  implicit class IGeoMutableBuilder[Self <: IGeo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineString(value: IGeoLineStringConstructor): Self = StObject.set(x, "LineString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiLineString(value: IGeoMultiLineStringConstructor): Self = StObject.set(x, "MultiLineString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiPoint(value: IGeoMultiPointConstructor): Self = StObject.set(x, "MultiPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiPolygon(value: IGeoMultiPolygonConstructor): Self = StObject.set(x, "MultiPolygon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: IGeoPointConstructor): Self = StObject.set(x, "Point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygon(value: IGeoPolygonConstructor): Self = StObject.set(x, "Polygon", value.asInstanceOf[js.Any])
  }
}
