package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoMultiLineString extends GeoInstance {
  
  var lines: js.Array[GeoLineString] = js.native
  
  def toJSON(): IGeoJSONMultiLineString = js.native
}
object GeoMultiLineString {
  
  @scala.inline
  def apply(lines: js.Array[GeoLineString], toJSON: () => IGeoJSONMultiLineString): GeoMultiLineString = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GeoMultiLineString]
  }
  
  @scala.inline
  implicit class GeoMultiLineStringMutableBuilder[Self <: GeoMultiLineString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLines(value: js.Array[GeoLineString]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesVarargs(value: GeoLineString*): Self = StObject.set(x, "lines", js.Array(value :_*))
    
    @scala.inline
    def setToJSON(value: () => IGeoJSONMultiLineString): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
