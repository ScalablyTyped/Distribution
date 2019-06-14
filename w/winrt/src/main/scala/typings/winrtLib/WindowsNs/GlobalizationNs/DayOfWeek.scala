package typings
package winrtLib.WindowsNs.GlobalizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DayOfWeek extends js.Object

@JSGlobal("Windows.Globalization.DayOfWeek")
@js.native
object DayOfWeek extends js.Object {
  @js.native
  sealed trait friday
    extends winrtLib.WindowsNs.GlobalizationNs.DayOfWeek
  
  @js.native
  sealed trait monday
    extends winrtLib.WindowsNs.GlobalizationNs.DayOfWeek
  
  @js.native
  sealed trait saturday
    extends winrtLib.WindowsNs.GlobalizationNs.DayOfWeek
  
  @js.native
  sealed trait sunday
    extends winrtLib.WindowsNs.GlobalizationNs.DayOfWeek
  
  @js.native
  sealed trait thursday
    extends winrtLib.WindowsNs.GlobalizationNs.DayOfWeek
  
  @js.native
  sealed trait tuesday
    extends winrtLib.WindowsNs.GlobalizationNs.DayOfWeek
  
  @js.native
  sealed trait wednesday
    extends winrtLib.WindowsNs.GlobalizationNs.DayOfWeek
  
  /* 5 */ val friday: friday with scala.Double = js.native
  /* 1 */ val monday: monday with scala.Double = js.native
  /* 6 */ val saturday: saturday with scala.Double = js.native
  /* 0 */ val sunday: sunday with scala.Double = js.native
  /* 4 */ val thursday: thursday with scala.Double = js.native
  /* 2 */ val tuesday: tuesday with scala.Double = js.native
  /* 3 */ val wednesday: wednesday with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.GlobalizationNs.DayOfWeek with scala.Double] = js.native
}

