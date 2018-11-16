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
  
  val friday: friday with java.lang.String = js.native
  val monday: monday with java.lang.String = js.native
  val saturday: saturday with java.lang.String = js.native
  val sunday: sunday with java.lang.String = js.native
  val thursday: thursday with java.lang.String = js.native
  val tuesday: tuesday with java.lang.String = js.native
  val wednesday: wednesday with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.GlobalizationNs.DayOfWeek with java.lang.String] = js.native
}

