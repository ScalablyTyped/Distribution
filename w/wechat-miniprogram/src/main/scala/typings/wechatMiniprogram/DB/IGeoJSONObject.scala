package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.wechatMiniprogramStrings.LineString
import typings.wechatMiniprogram.wechatMiniprogramStrings.MultiLineString
import typings.wechatMiniprogram.wechatMiniprogramStrings.MultiPoint
import typings.wechatMiniprogram.wechatMiniprogramStrings.MultiPolygon
import typings.wechatMiniprogram.wechatMiniprogramStrings.Point
import typings.wechatMiniprogram.wechatMiniprogramStrings.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.wechatMiniprogram.DB.IGeoJSONPoint
  - typings.wechatMiniprogram.DB.IGeoJSONMultiPoint
  - typings.wechatMiniprogram.DB.IGeoJSONLineString
  - typings.wechatMiniprogram.DB.IGeoJSONMultiLineString
  - typings.wechatMiniprogram.DB.IGeoJSONPolygon
  - typings.wechatMiniprogram.DB.IGeoJSONMultiPolygon
*/
trait IGeoJSONObject extends StObject
object IGeoJSONObject {
  
  @scala.inline
  def IGeoJSONLineString(coordinates: js.Array[js.Tuple2[Double, Double]], `type`: LineString): typings.wechatMiniprogram.DB.IGeoJSONLineString = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.wechatMiniprogram.DB.IGeoJSONLineString]
  }
  
  @scala.inline
  def IGeoJSONMultiLineString(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]], `type`: MultiLineString): typings.wechatMiniprogram.DB.IGeoJSONMultiLineString = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.wechatMiniprogram.DB.IGeoJSONMultiLineString]
  }
  
  @scala.inline
  def IGeoJSONMultiPoint(coordinates: js.Array[js.Tuple2[Double, Double]], `type`: MultiPoint): typings.wechatMiniprogram.DB.IGeoJSONMultiPoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.wechatMiniprogram.DB.IGeoJSONMultiPoint]
  }
  
  @scala.inline
  def IGeoJSONMultiPolygon(coordinates: js.Array[js.Array[js.Array[js.Tuple2[Double, Double]]]], `type`: MultiPolygon): typings.wechatMiniprogram.DB.IGeoJSONMultiPolygon = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.wechatMiniprogram.DB.IGeoJSONMultiPolygon]
  }
  
  @scala.inline
  def IGeoJSONPoint(coordinates: js.Tuple2[Double, Double], `type`: Point): typings.wechatMiniprogram.DB.IGeoJSONPoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.wechatMiniprogram.DB.IGeoJSONPoint]
  }
  
  @scala.inline
  def IGeoJSONPolygon(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]], `type`: Polygon): typings.wechatMiniprogram.DB.IGeoJSONPolygon = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.wechatMiniprogram.DB.IGeoJSONPolygon]
  }
}
