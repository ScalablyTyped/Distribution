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
  
  val friday: friday with java.lang.String = js.native
  val monday: monday with java.lang.String = js.native
  val saturday: saturday with java.lang.String = js.native
  val sunday: sunday with java.lang.String = js.native
  val thursday: thursday with java.lang.String = js.native
  val tuesday: tuesday with java.lang.String = js.native
  val wednesday: wednesday with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.GlobalizationNs.DayOfWeek with java.lang.String] = js.native
}

