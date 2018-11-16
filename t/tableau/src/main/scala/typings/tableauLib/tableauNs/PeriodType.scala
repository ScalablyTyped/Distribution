package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PeriodType extends js.Object

@JSGlobal("tableau.PeriodType")
@js.native
object PeriodType extends js.Object {
  @js.native
  sealed trait DAYS
    extends tableauLib.tableauNs.PeriodType
  
  @js.native
  sealed trait HOURS
    extends tableauLib.tableauNs.PeriodType
  
  @js.native
  sealed trait MINUTES
    extends tableauLib.tableauNs.PeriodType
  
  @js.native
  sealed trait MONTHS
    extends tableauLib.tableauNs.PeriodType
  
  @js.native
  sealed trait QUARTERS
    extends tableauLib.tableauNs.PeriodType
  
  @js.native
  sealed trait SECONDS
    extends tableauLib.tableauNs.PeriodType
  
  @js.native
  sealed trait WEEKS
    extends tableauLib.tableauNs.PeriodType
  
  @js.native
  sealed trait YEARS
    extends tableauLib.tableauNs.PeriodType
  
  /* "days" */ val DAYS: DAYS with java.lang.String = js.native
  /* "hours" */ val HOURS: HOURS with java.lang.String = js.native
  /* "minutes" */ val MINUTES: MINUTES with java.lang.String = js.native
  /* "months" */ val MONTHS: MONTHS with java.lang.String = js.native
  /* "quarters" */ val QUARTERS: QUARTERS with java.lang.String = js.native
  /* "seconds" */ val SECONDS: SECONDS with java.lang.String = js.native
  /* "weeks" */ val WEEKS: WEEKS with java.lang.String = js.native
  /* "years" */ val YEARS: YEARS with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[tableauLib.tableauNs.PeriodType with java.lang.String] = js.native
}

