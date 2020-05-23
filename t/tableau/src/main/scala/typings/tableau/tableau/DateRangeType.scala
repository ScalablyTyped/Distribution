package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateRangeType extends js.Object

@JSGlobal("tableau.DateRangeType")
@js.native
object DateRangeType extends js.Object {
   /** Refers to the current day, week, month, etc. of the date period. */ @js.native
  sealed trait CURRENT extends DateRangeType
  
   /** Refers to the last day, week, month, etc. of the date period. */ @js.native
  sealed trait LAST extends DateRangeType
  
   /** Refers to the last N days, weeks, months, etc. of the date period. */ @js.native
  sealed trait LASTN extends DateRangeType
  
   /** Refers to the next day, week, month, etc. of the date period. */ @js.native
  sealed trait NEXT extends DateRangeType
  
   /** Refers to the next N days, weeks, months, etc. of the date period. */ @js.native
  sealed trait NEXTN extends DateRangeType
  
   /** Refers to everything up to and including the current day, week, month, etc. of the date period. */ @js.native
  sealed trait TODATE extends DateRangeType
  
}

