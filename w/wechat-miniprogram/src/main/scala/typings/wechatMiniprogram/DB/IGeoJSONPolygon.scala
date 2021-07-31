package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.wechatMiniprogramStrings.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeoJSONPolygon
  extends StObject
     with IGeoJSONObject {
  
  var coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]]
  
  var `type`: Polygon
}
object IGeoJSONPolygon {
  
  @scala.inline
  def apply(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]]): IGeoJSONPolygon = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Polygon")
    __obj.asInstanceOf[IGeoJSONPolygon]
  }
  
  @scala.inline
  implicit class IGeoJSONPolygonMutableBuilder[Self <: IGeoJSONPolygon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinates(value: js.Array[js.Array[js.Tuple2[Double, Double]]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesVarargs(value: (js.Array[js.Tuple2[Double, Double]])*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    @scala.inline
    def setType(value: Polygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
