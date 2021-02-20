package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.wechatMiniprogramStrings.LineString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoJSONLineString extends IGeoJSONObject {
  
  var coordinates: js.Array[js.Tuple2[Double, Double]] = js.native
  
  var `type`: LineString = js.native
}
object IGeoJSONLineString {
  
  @scala.inline
  def apply(coordinates: js.Array[js.Tuple2[Double, Double]], `type`: LineString): IGeoJSONLineString = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoJSONLineString]
  }
  
  @scala.inline
  implicit class IGeoJSONLineStringMutableBuilder[Self <: IGeoJSONLineString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinates(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    @scala.inline
    def setType(value: LineString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
