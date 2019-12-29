package typings.tableau.tableau

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PeriodType with String] = js.native
  /* "days" */ @js.native
  object DAYS extends TopLevel[DAYS with String]
  
  /* "hours" */ @js.native
  object HOURS extends TopLevel[HOURS with String]
  
  /* "minutes" */ @js.native
  object MINUTES extends TopLevel[MINUTES with String]
  
  /* "months" */ @js.native
  object MONTHS extends TopLevel[MONTHS with String]
  
  /* "quarters" */ @js.native
  object QUARTERS extends TopLevel[QUARTERS with String]
  
  /* "seconds" */ @js.native
  object SECONDS extends TopLevel[SECONDS with String]
  
  /* "weeks" */ @js.native
  object WEEKS extends TopLevel[WEEKS with String]
  
  /* "years" */ @js.native
  object YEARS extends TopLevel[YEARS with String]
  
}

