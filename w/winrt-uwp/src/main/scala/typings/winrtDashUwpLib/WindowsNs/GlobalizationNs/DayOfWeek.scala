package typings
package winrtDashUwpLib.WindowsNs.GlobalizationNs

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
  sealed trait friday
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DayOfWeek
  
  /** Monday */
  @js.native
  sealed trait monday
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DayOfWeek
  
  /** Saturday */
  @js.native
  sealed trait saturday
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DayOfWeek
  
  /** Sunday */
  @js.native
  sealed trait sunday
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DayOfWeek
  
  /** Thursday */
  @js.native
  sealed trait thursday
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DayOfWeek
  
  /** Tuesday */
  @js.native
  sealed trait tuesday
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DayOfWeek
  
  /** Wednesday */
  @js.native
  sealed trait wednesday
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DayOfWeek
  
  /* 5 */ val friday: friday with scala.Double = js.native
  /* 1 */ val monday: monday with scala.Double = js.native
  /* 6 */ val saturday: saturday with scala.Double = js.native
  /* 0 */ val sunday: sunday with scala.Double = js.native
  /* 4 */ val thursday: thursday with scala.Double = js.native
  /* 2 */ val tuesday: tuesday with scala.Double = js.native
  /* 3 */ val wednesday: wednesday with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.GlobalizationNs.DayOfWeek with scala.Double] = js.native
}

