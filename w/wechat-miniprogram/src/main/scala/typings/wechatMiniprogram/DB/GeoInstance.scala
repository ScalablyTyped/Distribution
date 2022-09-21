package typings.wechatMiniprogram.DB

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.wechatMiniprogram.DB.GeoPoint
  - typings.wechatMiniprogram.DB.GeoMultiPoint
  - typings.wechatMiniprogram.DB.GeoLineString
  - typings.wechatMiniprogram.DB.GeoMultiLineString
  - typings.wechatMiniprogram.DB.GeoPolygon
  - typings.wechatMiniprogram.DB.GeoMultiPolygon
*/
trait GeoInstance extends StObject
object GeoInstance {
  
  inline def GeoLineString(points: js.Array[GeoPoint], toJSON: () => IGeoJSONLineString): typings.wechatMiniprogram.DB.GeoLineString = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[typings.wechatMiniprogram.DB.GeoLineString]
  }
  
  inline def GeoMultiLineString(lines: js.Array[GeoLineString], toJSON: () => IGeoJSONMultiLineString): typings.wechatMiniprogram.DB.GeoMultiLineString = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[typings.wechatMiniprogram.DB.GeoMultiLineString]
  }
  
  inline def GeoMultiPoint(points: js.Array[GeoPoint], toJSON: () => IGeoJSONMultiPoint): typings.wechatMiniprogram.DB.GeoMultiPoint = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[typings.wechatMiniprogram.DB.GeoMultiPoint]
  }
  
  inline def GeoMultiPolygon(polygons: js.Array[GeoPolygon], toJSON: () => IGeoJSONMultiPolygon): typings.wechatMiniprogram.DB.GeoMultiPolygon = {
    val __obj = js.Dynamic.literal(polygons = polygons.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[typings.wechatMiniprogram.DB.GeoMultiPolygon]
  }
  
  inline def GeoPoint(latitude: Double, longitude: Double, toJSON: () => Record[String, Any]): typings.wechatMiniprogram.DB.GeoPoint = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[typings.wechatMiniprogram.DB.GeoPoint]
  }
  
  inline def GeoPolygon(lines: js.Array[GeoLineString], toJSON: () => IGeoJSONPolygon): typings.wechatMiniprogram.DB.GeoPolygon = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[typings.wechatMiniprogram.DB.GeoPolygon]
  }
}
