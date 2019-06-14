package typings
package winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DayOfWeekFormat extends js.Object

@JSGlobal("Windows.Globalization.DateTimeFormatting.DayOfWeekFormat")
@js.native
object DayOfWeekFormat extends js.Object {
  @js.native
  sealed trait abbreviated
    extends winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DayOfWeekFormat
  
  @js.native
  sealed trait default
    extends winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DayOfWeekFormat
  
  @js.native
  sealed trait full
    extends winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DayOfWeekFormat
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DayOfWeekFormat
  
  /* 2 */ val abbreviated: abbreviated with scala.Double = js.native
  /* 1 */ val default: default with scala.Double = js.native
  /* 3 */ val full: full with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DayOfWeekFormat with scala.Double
  ] = js.native
}

