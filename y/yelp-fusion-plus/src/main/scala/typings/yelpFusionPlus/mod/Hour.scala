package typings.yelpFusionPlus.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hour extends StObject {
  
  var hours_type: String
  
  var is_open_now: Boolean
  
  var open: js.Array[Open]
}
object Hour {
  
  inline def apply(hours_type: String, is_open_now: Boolean, open: js.Array[Open]): Hour = {
    val __obj = js.Dynamic.literal(hours_type = hours_type.asInstanceOf[js.Any], is_open_now = is_open_now.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hour]
  }
  
  extension [Self <: Hour](x: Self) {
    
    inline def setHours_type(value: String): Self = StObject.set(x, "hours_type", value.asInstanceOf[js.Any])
    
    inline def setIs_open_now(value: Boolean): Self = StObject.set(x, "is_open_now", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: js.Array[Open]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenVarargs(value: Open*): Self = StObject.set(x, "open", js.Array(value*))
  }
}
