package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.wechatMiniprogramStrings.MultiLineString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeoJSONMultiLineString
  extends StObject
     with IGeoJSONObject {
  
  var coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]]
  
  var `type`: MultiLineString
}
object IGeoJSONMultiLineString {
  
  inline def apply(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]]): IGeoJSONMultiLineString = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MultiLineString")
    __obj.asInstanceOf[IGeoJSONMultiLineString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGeoJSONMultiLineString] (val x: Self) extends AnyVal {
    
    inline def setCoordinates(value: js.Array[js.Array[js.Tuple2[Double, Double]]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: (js.Array[js.Tuple2[Double, Double]])*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setType(value: MultiLineString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
