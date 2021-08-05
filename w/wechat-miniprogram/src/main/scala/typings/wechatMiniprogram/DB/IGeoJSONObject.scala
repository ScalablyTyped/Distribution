package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  inline def IGeoJSONLineString(coordinates: js.Array[js.Tuple2[Double, Double]]): typings.wechatMiniprogram.DB.IGeoJSONLineString = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LineString")
    __obj.asInstanceOf[typings.wechatMiniprogram.DB.IGeoJSONLineString]
  }
  
  inline def IGeoJSONMultiLineString(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]]): typings.wechatMiniprogram.DB.IGeoJSONMultiLineString = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MultiLineString")
    __obj.asInstanceOf[typings.wechatMiniprogram.DB.IGeoJSONMultiLineString]
  }
  
  inline def IGeoJSONMultiPoint(coordinates: js.Array[js.Tuple2[Double, Double]]): typings.wechatMiniprogram.DB.IGeoJSONMultiPoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MultiPoint")
    __obj.asInstanceOf[typings.wechatMiniprogram.DB.IGeoJSONMultiPoint]
  }
  
  inline def IGeoJSONMultiPolygon(coordinates: js.Array[js.Array[js.Array[js.Tuple2[Double, Double]]]]): typings.wechatMiniprogram.DB.IGeoJSONMultiPolygon = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MultiPolygon")
    __obj.asInstanceOf[typings.wechatMiniprogram.DB.IGeoJSONMultiPolygon]
  }
  
  inline def IGeoJSONPoint(coordinates: js.Tuple2[Double, Double]): typings.wechatMiniprogram.DB.IGeoJSONPoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Point")
    __obj.asInstanceOf[typings.wechatMiniprogram.DB.IGeoJSONPoint]
  }
  
  inline def IGeoJSONPolygon(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]]): typings.wechatMiniprogram.DB.IGeoJSONPolygon = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Polygon")
    __obj.asInstanceOf[typings.wechatMiniprogram.DB.IGeoJSONPolygon]
  }
}
