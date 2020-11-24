package typings.wechatMiniprogram.DB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoPolygon extends GeoInstance {
  
  var lines: js.Array[GeoLineString] = js.native
  
  def toJSON(): IGeoJSONPolygon = js.native
}
object GeoPolygon {
  
  @scala.inline
  def apply(lines: js.Array[GeoLineString], toJSON: () => IGeoJSONPolygon): GeoPolygon = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GeoPolygon]
  }
  
  @scala.inline
  implicit class GeoPolygonOps[Self <: GeoPolygon] (val x: Self) extends AnyVal {
    
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
    def setLinesVarargs(value: GeoLineString*): Self = this.set("lines", js.Array(value :_*))
    
    @scala.inline
    def setLines(value: js.Array[GeoLineString]): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => IGeoJSONPolygon): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
}
