package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DateRangeType extends StObject
@JSGlobal("tableau.DateRangeType")
@js.native
object DateRangeType extends StObject {
  
  /** Refers to the next N days, weeks, months, etc. of the date period. */
  @js.native
  sealed trait CURRENT
    extends StObject
       with DateRangeType
  
  @js.native
  sealed trait LAST
    extends StObject
       with DateRangeType
  
  /** Refers to the last day, week, month, etc. of the date period. */
  @js.native
  sealed trait LASTN
    extends StObject
       with DateRangeType
  
  /** Refers to the last N days, weeks, months, etc. of the date period. */
  @js.native
  sealed trait NEXT
    extends StObject
       with DateRangeType
  
  /** Refers to the next day, week, month, etc. of the date period. */
  @js.native
  sealed trait NEXTN
    extends StObject
       with DateRangeType
  
  /** Refers to the current day, week, month, etc. of the date period. */
  @js.native
  sealed trait TODATE
    extends StObject
       with DateRangeType
}
