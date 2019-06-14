package typings
package winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MonthFormat extends js.Object

/** Specifies the intended format for the month in a DateTimeFormatter object. */
@JSGlobal("Windows.Globalization.DateTimeFormatting.MonthFormat")
@js.native
object MonthFormat extends js.Object {
  /** Display an abbreviated version of the month (for example, "Sep" for September). */
  @js.native
  sealed trait abbreviated
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MonthFormat
  
  /** Display the month in the most natural way. It may be abbreviated, full, or numeric depending on the context, such as the language or calendar that is being used. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MonthFormat
  
  /** Display the month in its entirety (for example, "September"). */
  @js.native
  sealed trait full
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MonthFormat
  
  /** Do not display the month. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MonthFormat
  
  /** Display the month as a number (for example, "9" for September). */
  @js.native
  sealed trait numeric
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MonthFormat
  
  /* 2 */ val abbreviated: abbreviated with scala.Double = js.native
  /* 1 */ val default: default with scala.Double = js.native
  /* 3 */ val full: full with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 4 */ val numeric: numeric with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MonthFormat with scala.Double
  ] = js.native
}

