package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.wechatMiniprogramStrings.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeoJSONPoint
  extends StObject
     with IGeoJSONObject {
  
  var coordinates: js.Tuple2[Double, Double]
  
  var `type`: Point
}
object IGeoJSONPoint {
  
  @scala.inline
  def apply(coordinates: js.Tuple2[Double, Double]): IGeoJSONPoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Point")
    __obj.asInstanceOf[IGeoJSONPoint]
  }
  
  @scala.inline
  implicit class IGeoJSONPointMutableBuilder[Self <: IGeoJSONPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinates(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
