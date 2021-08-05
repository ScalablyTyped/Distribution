package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoMultiLineString
  extends StObject
     with GeoInstance {
  
  var lines: js.Array[GeoLineString]
  
  def toJSON(): IGeoJSONMultiLineString
}
object GeoMultiLineString {
  
  inline def apply(lines: js.Array[GeoLineString], toJSON: () => IGeoJSONMultiLineString): GeoMultiLineString = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GeoMultiLineString]
  }
  
  extension [Self <: GeoMultiLineString](x: Self) {
    
    inline def setLines(value: js.Array[GeoLineString]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesVarargs(value: GeoLineString*): Self = StObject.set(x, "lines", js.Array(value :_*))
    
    inline def setToJSON(value: () => IGeoJSONMultiLineString): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
