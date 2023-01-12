package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoPolygon
  extends StObject
     with GeoInstance {
  
  var lines: js.Array[GeoLineString]
  
  def toJSON(): IGeoJSONPolygon
}
object GeoPolygon {
  
  inline def apply(lines: js.Array[GeoLineString], toJSON: () => IGeoJSONPolygon): GeoPolygon = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GeoPolygon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoPolygon] (val x: Self) extends AnyVal {
    
    inline def setLines(value: js.Array[GeoLineString]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesVarargs(value: GeoLineString*): Self = StObject.set(x, "lines", js.Array(value*))
    
    inline def setToJSON(value: () => IGeoJSONPolygon): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
