package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.wechatMiniprogramStrings.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoJSONPolygon extends IGeoJSONObject {
  
  var coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]] = js.native
  
  var `type`: Polygon = js.native
}
object IGeoJSONPolygon {
  
  @scala.inline
  def apply(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]], `type`: Polygon): IGeoJSONPolygon = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoJSONPolygon]
  }
  
  @scala.inline
  implicit class IGeoJSONPolygonOps[Self <: IGeoJSONPolygon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCoordinatesVarargs(value: (js.Array[js.Tuple2[Double, Double]])*): Self = this.set("coordinates", js.Array(value :_*))
    
    @scala.inline
    def setCoordinates(value: js.Array[js.Array[js.Tuple2[Double, Double]]]): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Polygon): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
