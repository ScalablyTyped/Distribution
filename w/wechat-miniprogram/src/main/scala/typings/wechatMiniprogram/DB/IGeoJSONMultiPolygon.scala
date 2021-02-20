package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.wechatMiniprogramStrings.MultiPolygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoJSONMultiPolygon extends IGeoJSONObject {
  
  var coordinates: js.Array[js.Array[js.Array[js.Tuple2[Double, Double]]]] = js.native
  
  var `type`: MultiPolygon = js.native
}
object IGeoJSONMultiPolygon {
  
  @scala.inline
  def apply(coordinates: js.Array[js.Array[js.Array[js.Tuple2[Double, Double]]]], `type`: MultiPolygon): IGeoJSONMultiPolygon = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoJSONMultiPolygon]
  }
  
  @scala.inline
  implicit class IGeoJSONMultiPolygonMutableBuilder[Self <: IGeoJSONMultiPolygon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinates(value: js.Array[js.Array[js.Array[js.Tuple2[Double, Double]]]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesVarargs(value: (js.Array[js.Array[js.Tuple2[Double, Double]]])*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    @scala.inline
    def setType(value: MultiPolygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
