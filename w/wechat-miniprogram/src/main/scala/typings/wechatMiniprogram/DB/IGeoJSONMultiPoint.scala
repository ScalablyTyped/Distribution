package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.wechatMiniprogramStrings.MultiPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoJSONMultiPoint extends IGeoJSONObject {
  
  var coordinates: js.Array[js.Tuple2[Double, Double]] = js.native
  
  var `type`: MultiPoint = js.native
}
object IGeoJSONMultiPoint {
  
  @scala.inline
  def apply(coordinates: js.Array[js.Tuple2[Double, Double]], `type`: MultiPoint): IGeoJSONMultiPoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoJSONMultiPoint]
  }
  
  @scala.inline
  implicit class IGeoJSONMultiPointMutableBuilder[Self <: IGeoJSONMultiPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinates(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    @scala.inline
    def setType(value: MultiPoint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
