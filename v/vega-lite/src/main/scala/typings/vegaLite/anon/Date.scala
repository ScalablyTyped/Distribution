package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Date extends StObject {
  
  val date: typings.vegaLite.vegaLiteInts.`1`
  
  val day: typings.vegaLite.vegaLiteInts.`1`
  
  val dayofyear: typings.vegaLite.vegaLiteInts.`1`
  
  val hours: typings.vegaLite.vegaLiteInts.`1`
  
  val milliseconds: typings.vegaLite.vegaLiteInts.`1`
  
  val minutes: typings.vegaLite.vegaLiteInts.`1`
  
  val month: typings.vegaLite.vegaLiteInts.`1`
  
  val quarter: typings.vegaLite.vegaLiteInts.`1`
  
  val seconds: typings.vegaLite.vegaLiteInts.`1`
  
  val week: typings.vegaLite.vegaLiteInts.`1`
  
  val year: typings.vegaLite.vegaLiteInts.`1`
}
object Date {
  
  inline def apply(): Date = {
    val __obj = js.Dynamic.literal(date = 1, day = 1, dayofyear = 1, hours = 1, milliseconds = 1, minutes = 1, month = 1, quarter = 1, seconds = 1, week = 1, year = 1)
    __obj.asInstanceOf[Date]
  }
  
  extension [Self <: Date](x: Self) {
    
    inline def setDate(value: typings.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDay(value: typings.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayofyear(value: typings.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "dayofyear", value.asInstanceOf[js.Any])
    
    inline def setHours(value: typings.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    inline def setMilliseconds(value: typings.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
    
    inline def setMinutes(value: typings.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: typings.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setQuarter(value: typings.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "quarter", value.asInstanceOf[js.Any])
    
    inline def setSeconds(value: typings.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setWeek(value: typings.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    
    inline def setYear(value: typings.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
