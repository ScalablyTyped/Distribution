package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateOptionsMod {
  
  @js.native
  trait DateOptions extends StObject {
    
    /**
      * A value indicating whether the filter's time-value should be set to the end of the day.
      */
    var endOfDay: js.UndefOr[Boolean] = js.native
  }
  object DateOptions {
    
    @scala.inline
    def apply(): DateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateOptions]
    }
    
    @scala.inline
    implicit class DateOptionsMutableBuilder[Self <: DateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndOfDay(value: Boolean): Self = StObject.set(x, "endOfDay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndOfDayUndefined: Self = StObject.set(x, "endOfDay", js.undefined)
    }
  }
}
