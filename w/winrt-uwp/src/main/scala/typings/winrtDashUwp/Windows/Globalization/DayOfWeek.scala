package typings.winrtDashUwp.Windows.Globalization

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Globalization.DayOfWeek.friday
import typings.winrtDashUwp.Windows.Globalization.DayOfWeek.monday
import typings.winrtDashUwp.Windows.Globalization.DayOfWeek.saturday
import typings.winrtDashUwp.Windows.Globalization.DayOfWeek.sunday
import typings.winrtDashUwp.Windows.Globalization.DayOfWeek.thursday
import typings.winrtDashUwp.Windows.Globalization.DayOfWeek.tuesday
import typings.winrtDashUwp.Windows.Globalization.DayOfWeek.wednesday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DayOfWeek extends js.Object

/** Identifies the day of the week. */
@JSGlobal("Windows.Globalization.DayOfWeek")
@js.native
object DayOfWeek extends js.Object {
  /** Friday */
  @js.native
  sealed trait friday extends DayOfWeek
  
  /** Monday */
  @js.native
  sealed trait monday extends DayOfWeek
  
  /** Saturday */
  @js.native
  sealed trait saturday extends DayOfWeek
  
  /** Sunday */
  @js.native
  sealed trait sunday extends DayOfWeek
  
  /** Thursday */
  @js.native
  sealed trait thursday extends DayOfWeek
  
  /** Tuesday */
  @js.native
  sealed trait tuesday extends DayOfWeek
  
  /** Wednesday */
  @js.native
  sealed trait wednesday extends DayOfWeek
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DayOfWeek with Double] = js.native
  /* 5 */ @js.native
  object friday extends TopLevel[friday with Double]
  
  /* 1 */ @js.native
  object monday extends TopLevel[monday with Double]
  
  /* 6 */ @js.native
  object saturday extends TopLevel[saturday with Double]
  
  /* 0 */ @js.native
  object sunday extends TopLevel[sunday with Double]
  
  /* 4 */ @js.native
  object thursday extends TopLevel[thursday with Double]
  
  /* 2 */ @js.native
  object tuesday extends TopLevel[tuesday with Double]
  
  /* 3 */ @js.native
  object wednesday extends TopLevel[wednesday with Double]
  
}

