package typings.webix.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clear extends StObject {
  
  var clear: String
  
  var dayFull: js.Array[String]
  
  var dayShort: js.Array[String]
  
  var done: String
  
  var hours: String
  
  var minutes: String
  
  var monthFull: js.Array[String]
  
  var monthShort: js.Array[String]
  
  var today: String
}
object Clear {
  
  inline def apply(
    clear: String,
    dayFull: js.Array[String],
    dayShort: js.Array[String],
    done: String,
    hours: String,
    minutes: String,
    monthFull: js.Array[String],
    monthShort: js.Array[String],
    today: String
  ): Clear = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], dayFull = dayFull.asInstanceOf[js.Any], dayShort = dayShort.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], monthFull = monthFull.asInstanceOf[js.Any], monthShort = monthShort.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clear]
  }
  
  extension [Self <: Clear](x: Self) {
    
    inline def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setDayFull(value: js.Array[String]): Self = StObject.set(x, "dayFull", value.asInstanceOf[js.Any])
    
    inline def setDayFullVarargs(value: String*): Self = StObject.set(x, "dayFull", js.Array(value*))
    
    inline def setDayShort(value: js.Array[String]): Self = StObject.set(x, "dayShort", value.asInstanceOf[js.Any])
    
    inline def setDayShortVarargs(value: String*): Self = StObject.set(x, "dayShort", js.Array(value*))
    
    inline def setDone(value: String): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setHours(value: String): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    inline def setMinutes(value: String): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    inline def setMonthFull(value: js.Array[String]): Self = StObject.set(x, "monthFull", value.asInstanceOf[js.Any])
    
    inline def setMonthFullVarargs(value: String*): Self = StObject.set(x, "monthFull", js.Array(value*))
    
    inline def setMonthShort(value: js.Array[String]): Self = StObject.set(x, "monthShort", value.asInstanceOf[js.Any])
    
    inline def setMonthShortVarargs(value: String*): Self = StObject.set(x, "monthShort", js.Array(value*))
    
    inline def setToday(value: String): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
  }
}
