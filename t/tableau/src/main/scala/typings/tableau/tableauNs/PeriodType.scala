package typings.tableau.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PeriodType extends js.Object

@JSGlobal("tableau.PeriodType")
@js.native
object PeriodType extends js.Object {
  @js.native
  sealed trait DAYS extends PeriodType
  
  @js.native
  sealed trait HOURS extends PeriodType
  
  @js.native
  sealed trait MINUTES extends PeriodType
  
  @js.native
  sealed trait MONTHS extends PeriodType
  
  @js.native
  sealed trait QUARTERS extends PeriodType
  
  @js.native
  sealed trait SECONDS extends PeriodType
  
  @js.native
  sealed trait WEEKS extends PeriodType
  
  @js.native
  sealed trait YEARS extends PeriodType
  
  /* "days" */ val DAYS: typings.tableau.tableauNs.PeriodType.DAYS with String = js.native
  /* "hours" */ val HOURS: typings.tableau.tableauNs.PeriodType.HOURS with String = js.native
  /* "minutes" */ val MINUTES: typings.tableau.tableauNs.PeriodType.MINUTES with String = js.native
  /* "months" */ val MONTHS: typings.tableau.tableauNs.PeriodType.MONTHS with String = js.native
  /* "quarters" */ val QUARTERS: typings.tableau.tableauNs.PeriodType.QUARTERS with String = js.native
  /* "seconds" */ val SECONDS: typings.tableau.tableauNs.PeriodType.SECONDS with String = js.native
  /* "weeks" */ val WEEKS: typings.tableau.tableauNs.PeriodType.WEEKS with String = js.native
  /* "years" */ val YEARS: typings.tableau.tableauNs.PeriodType.YEARS with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PeriodType with String] = js.native
}

