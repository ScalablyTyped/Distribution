package typings.winrtDashUwp.Windows.Globalization

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
  
  /* 5 */ val friday: typings.winrtDashUwp.Windows.Globalization.DayOfWeek.friday with Double = js.native
  /* 1 */ val monday: typings.winrtDashUwp.Windows.Globalization.DayOfWeek.monday with Double = js.native
  /* 6 */ val saturday: typings.winrtDashUwp.Windows.Globalization.DayOfWeek.saturday with Double = js.native
  /* 0 */ val sunday: typings.winrtDashUwp.Windows.Globalization.DayOfWeek.sunday with Double = js.native
  /* 4 */ val thursday: typings.winrtDashUwp.Windows.Globalization.DayOfWeek.thursday with Double = js.native
  /* 2 */ val tuesday: typings.winrtDashUwp.Windows.Globalization.DayOfWeek.tuesday with Double = js.native
  /* 3 */ val wednesday: typings.winrtDashUwp.Windows.Globalization.DayOfWeek.wednesday with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DayOfWeek with Double] = js.native
}

