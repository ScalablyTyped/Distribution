package typings.wechatMiniprogram.DB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wechatMiniprogram.DB.GeoPoint
  - typings.wechatMiniprogram.DB.GeoMultiPoint
  - typings.wechatMiniprogram.DB.GeoLineString
  - typings.wechatMiniprogram.DB.GeoMultiLineString
  - typings.wechatMiniprogram.DB.GeoPolygon
  - typings.wechatMiniprogram.DB.GeoMultiPolygon
*/
trait GeoInstance extends js.Object

object GeoInstance {
  @scala.inline
  def GeoPoint(latitude: Double, longitude: Double, toJSON: () => js.Object): GeoInstance = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GeoInstance]
  }
  @scala.inline
  def GeoLineString(points: js.Array[GeoPoint], toJSON: () => IGeoJSONLineString): GeoInstance = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GeoInstance]
  }
  @scala.inline
  def GeoMultiPolygon(polygons: js.Array[GeoPolygon], toJSON: () => IGeoJSONMultiPolygon): GeoInstance = {
    val __obj = js.Dynamic.literal(polygons = polygons.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GeoInstance]
  }
  @scala.inline
  def GeoMultiLineString(lines: js.Array[GeoLineString], toJSON: () => IGeoJSONMultiLineString): GeoInstance = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GeoInstance]
  }
  @scala.inline
  def GeoMultiPoint(points: js.Array[GeoPoint], toJSON: () => IGeoJSONMultiPoint): GeoInstance = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GeoInstance]
  }
  @scala.inline
  def GeoPolygon(lines: js.Array[GeoLineString], toJSON: () => IGeoJSONPolygon): GeoInstance = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GeoInstance]
  }
}

