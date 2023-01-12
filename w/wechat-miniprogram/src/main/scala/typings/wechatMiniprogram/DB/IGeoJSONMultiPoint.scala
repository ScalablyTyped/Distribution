package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.wechatMiniprogramStrings.MultiPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeoJSONMultiPoint
  extends StObject
     with IGeoJSONObject {
  
  var coordinates: js.Array[js.Tuple2[Double, Double]]
  
  var `type`: MultiPoint
}
object IGeoJSONMultiPoint {
  
  inline def apply(coordinates: js.Array[js.Tuple2[Double, Double]]): IGeoJSONMultiPoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MultiPoint")
    __obj.asInstanceOf[IGeoJSONMultiPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGeoJSONMultiPoint] (val x: Self) extends AnyVal {
    
    inline def setCoordinates(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setType(value: MultiPoint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
