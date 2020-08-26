package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.wechatMiniprogramStrings.LineString
import typings.wechatMiniprogram.wechatMiniprogramStrings.MultiLineString
import typings.wechatMiniprogram.wechatMiniprogramStrings.MultiPoint
import typings.wechatMiniprogram.wechatMiniprogramStrings.MultiPolygon
import typings.wechatMiniprogram.wechatMiniprogramStrings.Point
import typings.wechatMiniprogram.wechatMiniprogramStrings.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wechatMiniprogram.DB.IGeoJSONPoint
  - typings.wechatMiniprogram.DB.IGeoJSONMultiPoint
  - typings.wechatMiniprogram.DB.IGeoJSONLineString
  - typings.wechatMiniprogram.DB.IGeoJSONMultiLineString
  - typings.wechatMiniprogram.DB.IGeoJSONPolygon
  - typings.wechatMiniprogram.DB.IGeoJSONMultiPolygon
*/
trait IGeoJSONObject extends js.Object

object IGeoJSONObject {
  @scala.inline
  def IGeoJSONMultiPoint(coordinates: js.Array[js.Tuple2[Double, Double]], `type`: MultiPoint): IGeoJSONObject = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoJSONObject]
  }
  @scala.inline
  def IGeoJSONLineString(coordinates: js.Array[js.Tuple2[Double, Double]], `type`: LineString): IGeoJSONObject = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoJSONObject]
  }
  @scala.inline
  def IGeoJSONPoint(coordinates: js.Tuple2[Double, Double], `type`: Point): IGeoJSONObject = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoJSONObject]
  }
  @scala.inline
  def IGeoJSONMultiLineString(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]], `type`: MultiLineString): IGeoJSONObject = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoJSONObject]
  }
  @scala.inline
  def IGeoJSONMultiPolygon(coordinates: js.Array[js.Array[js.Array[js.Tuple2[Double, Double]]]], `type`: MultiPolygon): IGeoJSONObject = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoJSONObject]
  }
  @scala.inline
  def IGeoJSONPolygon(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]], `type`: Polygon): IGeoJSONObject = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoJSONObject]
  }
}

