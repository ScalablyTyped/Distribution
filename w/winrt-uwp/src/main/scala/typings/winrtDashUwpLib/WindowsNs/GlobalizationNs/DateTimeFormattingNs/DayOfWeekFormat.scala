package typings
package winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DayOfWeekFormat extends js.Object

/** Specifies the intended format for the day of the week in a DateTimeFormatter object. */
@JSGlobal("Windows.Globalization.DateTimeFormatting.DayOfWeekFormat")
@js.native
object DayOfWeekFormat extends js.Object {
  /** Display an abbreviated version of the day of the week (for example, "Thur" for Thursday). */
  @js.native
  sealed trait abbreviated
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DayOfWeekFormat
  
  /** Display the day of the week in the most natural way. It may be abbreviated or full depending on the context, such as the language or calendar that is being used. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DayOfWeekFormat
  
  /** Display the day of the week in its entirety (for example, "Thursday"). */
  @js.native
  sealed trait full
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DayOfWeekFormat
  
  /** Do not display the day of the week. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DayOfWeekFormat
  
  /* 2 */ val abbreviated: abbreviated with scala.Double = js.native
  /* 1 */ val default: default with scala.Double = js.native
  /* 3 */ val full: full with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DayOfWeekFormat with scala.Double
  ] = js.native
}

