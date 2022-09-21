package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.wechatMiniprogramStrings.MultiPolygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeoJSONMultiPolygon
  extends StObject
     with IGeoJSONObject {
  
  var coordinates: js.Array[js.Array[js.Array[js.Tuple2[Double, Double]]]]
  
  var `type`: MultiPolygon
}
object IGeoJSONMultiPolygon {
  
  inline def apply(coordinates: js.Array[js.Array[js.Array[js.Tuple2[Double, Double]]]]): IGeoJSONMultiPolygon = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MultiPolygon")
    __obj.asInstanceOf[IGeoJSONMultiPolygon]
  }
  
  extension [Self <: IGeoJSONMultiPolygon](x: Self) {
    
    inline def setCoordinates(value: js.Array[js.Array[js.Array[js.Tuple2[Double, Double]]]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: (js.Array[js.Array[js.Tuple2[Double, Double]]])*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setType(value: MultiPolygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
