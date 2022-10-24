package typings.wixStyleReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCalendarUtilsMod {
  
  @JSImport("wix-style-react/dist/types/Calendar/utils", "CalendarView")
  @js.native
  open class CalendarView protected () extends StObject {
    /**
      * @param {*} firstMonthDate a date that represents the first displayed month in the calendar view. (Does not have to be the 1st of that month)
      * @param {*} numOfMonths number of months that are displayed in the view
      */
    def this(firstMonthDate: Any, numOfMonths: Any) = this()
    
    var endDate: js.Date = js.native
    
    /**
      * Is the given date after the view's end date
      */
    def isAfterView(date: Any): Boolean = js.native
    
    /**
      * Is the given date before the view's start date
      */
    def isBeforeView(date: Any): Boolean = js.native
    
    /**
      * Is the given date contained in the calendar view
      *
      * @param {*} date
      * @returns
      * @memberof CalendarView
      */
    def isContained(date: Any): Boolean = js.native
    
    def isRangeFits(from: Any, to: Any): Boolean = js.native
    
    var startDate: js.Date = js.native
  }
}
