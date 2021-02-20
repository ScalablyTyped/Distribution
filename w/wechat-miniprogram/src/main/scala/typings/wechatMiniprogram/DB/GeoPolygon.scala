package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
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
  implicit class GeoPolygonMutableBuilder[Self <: GeoPolygon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLines(value: js.Array[GeoLineString]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesVarargs(value: GeoLineString*): Self = StObject.set(x, "lines", js.Array(value :_*))
    
    @scala.inline
    def setToJSON(value: () => IGeoJSONPolygon): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
