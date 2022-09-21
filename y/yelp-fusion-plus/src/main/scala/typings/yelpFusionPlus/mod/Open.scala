package typings.yelpFusionPlus.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Open extends StObject {
  
  var day: Double
  
  var end: String
  
  var is_overnight: Boolean
  
  var start: String
}
object Open {
  
  inline def apply(day: Double, end: String, is_overnight: Boolean, start: String): Open = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], is_overnight = is_overnight.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Open]
  }
  
  extension [Self <: Open](x: Self) {
    
    inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setIs_overnight(value: Boolean): Self = StObject.set(x, "is_overnight", value.asInstanceOf[js.Any])
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
