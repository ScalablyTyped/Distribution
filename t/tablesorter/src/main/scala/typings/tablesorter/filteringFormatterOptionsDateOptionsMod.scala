package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filteringFormatterOptionsDateOptionsMod {
  
  trait DateOptions extends StObject {
    
    /**
      * A value indicating whether the filter's time-value should be set to the end of the day.
      */
    var endOfDay: js.UndefOr[Boolean] = js.undefined
  }
  object DateOptions {
    
    inline def apply(): DateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateOptions]
    }
    
    extension [Self <: DateOptions](x: Self) {
      
      inline def setEndOfDay(value: Boolean): Self = StObject.set(x, "endOfDay", value.asInstanceOf[js.Any])
      
      inline def setEndOfDayUndefined: Self = StObject.set(x, "endOfDay", js.undefined)
    }
  }
}
